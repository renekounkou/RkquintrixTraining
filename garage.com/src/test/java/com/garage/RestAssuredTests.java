package com.garage;

import static org.testng.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

import garage.com.DeserializeTheUserData;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssuredTests {
	
	@Test
	public void verifyTheEmailAddressTest() {
		String getSingleUserEndpoint = "https://reqres.in/api/users/2";
		Response getResponse = RestAssured.get(getSingleUserEndpoint);
		System.out.println(getResponse.asPrettyString());

		Assert.assertTrue(getResponse.asPrettyString().contains("janet.weaver@reqres.in"));
	}

	@Test
	public void verifyTheTokenTest() {
		String postLoginEndpoint = "https://reqres.in/api/login";
		RequestSpecification postRequest = RestAssured.given();
		postRequest.header("content-type", "application/json");
		postRequest.body(
				"{\r\n" + "    \"email\": \"eve.holt@reqres.in\",\r\n" + "    \"password\": \"cityslicka\"\r\n" + "}");
		Response postResponse = postRequest.post(postLoginEndpoint);
		System.out.println(postResponse.getStatusCode());
		System.out.println(postResponse.asPrettyString());

		Assert.assertTrue(postResponse.asPrettyString().contains("QpwL5tke4Pnpja7X4"));
	}

	@Test
	public void verifyTheResponseCodeTest() {
		String deleteEndPoint = "https://reqres.in/api/users/2";
		Response deleteResponse = RestAssured.delete(deleteEndPoint);
		System.out.println(deleteResponse.statusCode());
		System.out.println(deleteResponse.getHeaders());

		assertEquals(deleteResponse.statusCode(), 204, "The response code should be 204 ");

		// The response code 204 does have headers but does not contain a body.
	}

	@Test
	public void updateMorpheusPatchTest() {
		String patchEndPoint = "https://reqres.in/api/users/2";
		RequestSpecification patchRequest = RestAssured.given();
		patchRequest.header("content-type", "application/json");
		patchRequest.body("{\r\n" + "    \"name\": \"morpheus2\"\r\n" + "}");
		Response patchResponse = patchRequest.patch(patchEndPoint);
		System.out.println(patchResponse.getStatusCode());
		System.out.println(patchResponse.asPrettyString());

		Assert.assertTrue(patchResponse.asPrettyString().contains("morpheus2"));

	}

	@Test
	public void updateMorpheusPutTest() {
		String putEndPoint = "https://reqres.in/api/users/2";
		RequestSpecification putRequest = RestAssured.given();
		putRequest.header("content-type", "application/json");
		putRequest.body("{\r\n" + "    \"name\": \"morpheus2\",\r\n" + "    \"job\": \"zion resident\"\r\n" + "}");
		Response putResponse = putRequest.put(putEndPoint);
		System.out.println(putResponse.getStatusCode());
		System.out.println(putResponse.asPrettyString());

		Assert.assertTrue(putResponse.asPrettyString().contains("morpheus2"));

	}
	
	@Test
	public void deserializeUserDataIntoAnObject() {
		String deserializeTheUserData = "https://reqres.in/api/users/2";
		Response getResponse = RestAssured.get(deserializeTheUserData);
		DeserializeTheUserData userData = new DeserializeTheUserData();
		userData.getId();
		userData.getEmail();
		userData.getFirst_name();
		userData.getLast_name();
		userData.getAvatar();

		RestAssured.given().contentType(ContentType.JSON).when().get(deserializeTheUserData);

		Assert.assertTrue(getResponse.asPrettyString().contains("janet.weaver@reqres.in"));

	}
	
	@Test
	public void deserializeUserDataIntoaCollectionOfObjects() {
		String deserializeTheUserData = "https://reqres.in/api/users?page=2";
		Response getResponse = RestAssured.get(deserializeTheUserData);
		DeserializeTheUserData userData = new DeserializeTheUserData();
		userData.getId();
		userData.getEmail();
		userData.getFirst_name();
		userData.getLast_name();
		userData.getAvatar();

		RestAssured.given().contentType(ContentType.JSON).when().get(deserializeTheUserData);
		System.out.println(getResponse.asPrettyString());
		Assert.assertTrue(getResponse.asPrettyString().contains("michael.lawson@reqres.in"));
		
	}
}
