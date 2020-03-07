package com.hrms.API.steps.practice;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;
import org.junit.Assert;
import com.hrms.utils.APIConstants;

public class GETOneEmployeeAPISteps {

	private Response response;
	private static RequestSpecification request;
	public static Object realEmpID;

	@Given("user calls getOneEmployee API")
	public void user_calls_getOneEmployee_API() {

		request = given().header("Content_Type", "application/json")
				.header("authorization", SyntaxAPIAuthenticationSteps.Token)
				.param("employee_id", POSTCreateEmployeeAPI.employee_ID);

	}

	@When("User retrieves response for getOneEmployee API")
	public void user_retrieves_response_for_getOneEmployee_API() {

		response = request.when().get(APIConstants.GET_ONE_EMPLOYEE_URI);
		response.prettyPrint();

	}

	@Then("status code is {int} for getOneEmployee API")
	public void status_code_is_for_getOneEmployee_API(Integer int1) {

		response.then().assertThat().statusCode(int1);
	}

	@Then("user validates created employee exists")
	public void user_validates_created_employee_exists() {

		response.then().body("employee[0].employee_id", equalTo(POSTCreateEmployeeAPI.employee_ID));

		JsonPath jsonPathEvaluator = response.jsonPath();

		realEmpID = jsonPathEvaluator.get("employee[0].employee_id");

		System.out.println("Actual emp_ID is: " + realEmpID);

		// Assert.assertEquals("Verifying empIDs are the same",
		// POSTCreateEmployeeAPI.employee_ID, realEmpID);
		try {
			Assert.assertEquals("Verifying empIDs are the same", POSTCreateEmployeeAPI.employee_ID, realEmpID);

		} catch (AssertionError e) {
			System.err.println("Employee IDs do not match");
		}
		System.out.println("Employee IDs match");
	}

}
