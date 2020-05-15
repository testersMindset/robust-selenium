package com.robust.jsondata.test.demo;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.json.JSONObject;

public class CsvFileReader {

	private static final String CSVFILEPATH = "./testdata/TestData.csv";
	
	public static void main(String[] args) throws Exception {
		loadDataFromCsv();
	}
	
	private static void loadDataFromCsv() throws Exception {

		File file = new File(CSVFILEPATH);
		byte[] bytes = FileUtils.readFileToByteArray(file);
		String data = new String(bytes);
		
		data = StringUtils.replaceAll(data, "\r", "");
		String[] dataArray = data.split("\n");
		
		String keys = dataArray[0];
		
		Map<String, Map<String, String>> outerMap = new HashMap<>();
		List<String> keysFromFile = new ArrayList<>();
		
		String[] keyArr = keys.split(",");
		
		keysFromFile.addAll(Arrays.asList(keyArr));
		keysFromFile.remove(0);
		
		for(int d = 1; d < dataArray.length; d++) {
			Map<String, String> mp = new HashMap<>();
			List<String> row = new ArrayList<>();
			
			String[] rowArr = dataArray[d].split(",");
			row.addAll(Arrays.asList(rowArr));
			String keyForTestCase = row.get(0);
			row.remove(0);
		
		for( int i = 0; i < keysFromFile.size(); i++) {
			mp.put(keysFromFile.get(i).trim(), row.get(i).trim());
		}
		outerMap.put(keyForTestCase, mp);
		}
		Map<String, String> rowMap = outerMap.get("A_001");
		JSONObject jsonData = new JSONObject(outerMap);
		System.out.println(jsonData);
	}
	
}
