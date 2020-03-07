package com.hrms.API.steps.practice;

import static io.restassured.RestAssured.given;

import org.junit.Assert;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static org.hamcrest.Matchers.equalTo;

import org.hamcrest.Matchers;



public class GoRestSteps {
	private static RequestSpecification request;
	private Response response;

	@When("I provide the request data")
	public void i_provide_the_request_data() {
		
		request = given().header("Content-Type", "application/json").header("Authorization" , "Bearer "+ "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE1ODMzNzIwODEsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTU4MzQ4NzI4MSwidXNlcklkIjoiMTI2In0.P5QWpz0nZw8QvKaqnvyN46S_zjNWSwkxOKGupmRiTg4");
		request.log().all();
		
	}

	@When("I make an API call to getAlbums API")
	public void i_make_an_API_call_to_getAlbums_API() {
		
		int albumID=4;
		response = request.when().get("https://gorest.co.in/public-api/albums/"+ albumID);

	}

	@Then("I validate that {int} is the status code")
	public void i_validate_that_is_the_status_code(int int1) {
		
		//response.then().assertThat().statusCode(int1);
		
		//second way
		int actualStatusCode = response.statusCode();
		Assert.assertEquals(int1, actualStatusCode);
		
		String responsePayload=response.prettyPrint();
		System.out.println(responsePayload);
		
	}

	@Then("I validate the response body")
	public void i_validate_the_response_body() {
		
		//1st way
		int result = 401;
		response.then().body("code", Matchers.equalTo(result));
		
		//2nd way
		
//		JsonPath jsonPath =  response.jsonPath();
//		jsonPath.getString("result.")
		
		
	}

}
