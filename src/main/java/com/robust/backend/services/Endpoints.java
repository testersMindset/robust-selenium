package com.robust.backend.services;

public enum Endpoints {
	
	
	USER_CREDENTIALS ("/services/user-data/users", "GET"),
	DOWNLOAD_FILE ("/services/file-system/download-file", "GET"),
	UPLOAD_FILE ("/services/file-system/upload", "POST"),
	CREATE_FILE ("/services/file-system/create-file", "POST");

	private String endpointUrl;
	private String endpointType;
	
	Endpoints(String endpointUrl, String endpointType){
		this.endpointUrl = endpointUrl;
		this.endpointType = endpointType;
	}
	
	public String getEndpointUrl() {
		return endpointUrl;
	}
	
	public String getEndpointType() {
		return endpointType;
	}

	public static String getEndpoint(String key) {
		Endpoints[] endpoint = Endpoints.values();
		for (Endpoints e : endpoint) {
			if (e.name().equals(key)) {
				return e.endpointUrl;
			}
		}
		return null;
	}
}
