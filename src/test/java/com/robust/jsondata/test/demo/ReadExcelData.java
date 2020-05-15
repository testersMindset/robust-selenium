package com.robust.jsondata.test.demo;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.json.JSONObject;

public class ReadExcelData {

	public final String FILEPATH = "./testdata/DemoTestData.xlsx";
	private Map<String, List<Map<String, String>>> excelDataMap;

	private FileInputStream fis;
	private XSSFWorkbook workbook;
	private XSSFSheet sheet;
	private XSSFRow row;
	private List<String> sheetNames;

	private void loadExcelData() throws Exception {
		File file = new File(FILEPATH);
		fis = new FileInputStream(file);
		workbook = new XSSFWorkbook(fis);
		loadSheetNames(workbook);
	}

	private List<String> loadSheetNames(XSSFWorkbook wbook) {
		sheetNames = new ArrayList<>();
		int numOfSheets = wbook.getNumberOfSheets();
		for (int i = 0; i < numOfSheets; i++) {
			sheetNames.add(wbook.getSheetName(i));
		}
		return sheetNames;
	}

	private String getStringValue(XSSFCell cell) {
		String value = cell.getCellType().equals(CellType.STRING) ? cell.getStringCellValue()
				: cell.getCellType().equals(CellType.NUMERIC) ? String.valueOf(cell.getNumericCellValue())
						: cell.getCellType().equals(CellType.BOOLEAN) ? String.valueOf(cell.getBooleanCellValue())
								: cell.getCellType().equals(CellType.ERROR) ? cell.getErrorCellString()
										: cell.getStringCellValue();

		return value;
	}

	private Map<String, String> getSheetDataFromColumnKeys(XSSFSheet sheet) {
		Map<String, String> map = new HashMap<>();
		for (int i = 1; i < sheet.getLastRowNum() + 1; i++) {
			row = sheet.getRow(i);
			String keyCell = getStringValue(row.getCell(0));
			int columns = row.getLastCellNum();
			for (int j = 1; j < columns; j++) {
				String val = getStringValue(row.getCell(j));
				map.put(keyCell, val);
			}
		}
		return map;
	}

	private List<Map<String, String>> getSheetDataFromRowKeys(XSSFRow keyrow,
			List<Map<String, String>> rowDataInSheet) {
		for (int i = 1; i < sheet.getLastRowNum() + 1; i++) {
			Map<String, String> map = new HashMap<>();
			XSSFRow sheetRow = sheet.getRow(i);

			for (int s = 0; s < keyrow.getPhysicalNumberOfCells(); s++) {
				String value = getStringValue(sheetRow.getCell(s));
				String key = getStringValue(keyrow.getCell(s));
				map.put(key, value);
			}
			rowDataInSheet.add(map);
		}
		return rowDataInSheet;
	}

	public void createTestDataMapper() throws Exception {
		if (sheet == null) {
			loadExcelData();
		}
		Map<String, List<Map<String, String>>> sheetMap = new HashMap<>();
		List<Map<String, String>> testExecControlMap = new ArrayList<>();
		XSSFSheet masterSheet = workbook.getSheet(sheetNames.get(0));

		testExecControlMap.add(getSheetDataFromColumnKeys(masterSheet));
		sheetMap.put(sheetNames.get(0), testExecControlMap);

		for (int k = 1; k < sheetNames.size(); k++) {
			List<Map<String, String>> rowDataInSheet = new ArrayList<>();

			sheet = workbook.getSheet(sheetNames.get(k));
			XSSFRow keyrow = sheet.getRow(0);
			sheetMap.put(sheet.getSheetName(), getSheetDataFromRowKeys(keyrow, rowDataInSheet));
		}
		excelDataMap = sheetMap;
		JSONObject json = new JSONObject(sheetMap);
	}

	public static void main(String[] args) throws Exception {
		ReadExcelData readData = new ReadExcelData();
		List<Map<String, String>> maps = readData.getDataFromSheet("Computers");
	}

	public Map<String, List<Map<String, String>>> getExcelDataMap() throws Exception {
		if (CollectionUtils.sizeIsEmpty(excelDataMap)) {
			createTestDataMapper();
		}
		return excelDataMap;
	}

	public List<Map<String, String>> getDataFromSheet(String sheetName) throws Exception {
		return getExcelDataMap().get(sheetName);
	}

}
