package com.robust.selenium.backend.services;

import org.json.JSONObject;
import com.robust.backend.services.Endpoints;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class CheckPostReq {

	public static void main(String[] args) {
		CheckPostReq r = new CheckPostReq();
		r.sendRequestViaPost("PLACEHOLDER_TYPE");
	}

	public void sendRequestViaPost(String endpoint) {
		String url = Endpoints.getEndpoint(endpoint);
		System.out.println(url);
		JSONObject jObj = new JSONObject();
		jObj.put("username", "admin");
		jObj.put("password", "password123");

		Response resp = RestAssured.given().relaxedHTTPSValidation().contentType(ContentType.JSON).body(jObj.toString())
				.post(url);
		System.out.println(resp.body().asString());
	}

}
