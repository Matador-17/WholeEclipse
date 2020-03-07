package com.hrms.API.steps.practice;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.deps.com.google.gson.JsonArray;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

import org.json.JSONArray;
import org.json.JSONObject;

import com.hrms.utils.APIConstants;

public class getAllEmployees {

	private Response response;
	private static RequestSpecification request;

	@Given("User calls for the getAllEmployees API")
	public void user_calls_for_the_getAllEmployees_API() {
		 request = given().header("Content-Type", "application/json").header("authorization", SyntaxAPIAuthenticationSteps.Token);
		 
	}

	@When("The user retrieves all Employees")
	public void the_user_retrieves_all_Employees() {
		response = request.when().get(APIConstants.GET_ALL_EMPLOYEES_URI);
		response.prettyPrint();
	}

	@Then("the status code should be {int}")
	public void the_status_code_should_be(Integer int1) {
		response.then().assertThat().statusCode(int1);

	}

	@Then("User validates that all Employees has been retrieved")
	public void user_validates_that_all_Employees_has_been_retrieved() {
		JSONObject json = new JSONObject(response.prettyPrint());
		JSONArray array= json.getJSONArray("Employee");
		System.out.println("Size of the list for returned employees is: "+array.length());

	}

}
