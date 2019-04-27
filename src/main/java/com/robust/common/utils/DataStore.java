package com.robust.common.utils;

import org.json.JSONObject;

public class DataStore {

	private static JSONObject jsonObject;

	public static JSONObject getJsonObject() {
		return jsonObject;
	}

	public static void setJsonObject(JSONObject jsonObject) {
		DataStore.jsonObject = jsonObject;
	}

}
