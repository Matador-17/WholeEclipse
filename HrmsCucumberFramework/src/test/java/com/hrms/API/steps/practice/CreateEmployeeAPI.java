package com.hrms.API.steps.practice;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.*;

import com.hrms.utils.CommonMethods;

public class CreateEmployeeAPI {
	
	private static RequestSpecification request;
	private Response response;
	
	@Given("User calls createEmployee API")
	public void user_calls_createEmployee_API() {
	    request = given().header("Content-Type", "application/json").header("Authorization", SyntaxAPIAuthenticationSteps.Token);
	    
	    request.body(CommonMethods.readJson("C:\\Users\\ronal\\eclipse-workspace\\HrmsCucumberFramework\\src\\test\\resources\\JSONFiles\\createEmployee.json"));
	}

	@When("User retrieves response")
	public void user_retrieves_response() {
		
		response = request.post("http://54.167.125.15/syntaxapi/api/createEmployee.php");
	    
	}

	@Then("Status code is {int}")
	public void status_code_is(Integer int1) {
	    
	}

	@Then("User validates employee is created")
	public void user_validates_employee_is_created() {
	    
	}

	
	
}
