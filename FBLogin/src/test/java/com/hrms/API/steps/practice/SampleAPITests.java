package com.hrms.API.steps.practice;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import org.junit.Assert;
import org.junit.Test;

public class SampleAPITests {

	// @Test
	public void getAllJobTitles() {

		Response response = RestAssured.given().contentType("application/json").header("Authorization",
				"Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE1ODI0NzEwNTAsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTU4MjU4NjI1MCwidXNlcklkIjoiMTI2In0.aCn-lTXX31p2IdkAPl0DQF2p_uKhU3gm0BgRBZSp5uw")
				.when().get("http://54.167.125.15/syntaxapi/api/jobTitle.php");

		response.prettyPrint();
		int actualResponseCode = response.getStatusCode();
		System.out.println(actualResponseCode);

	}

	// @Test
	public void getOneEmployee() {
		Response response = RestAssured.given().param("employee_id", "05774A").contentType("application/json").header(
				"Authorization",
				"Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE1ODI0NzEwNTAsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTU4MjU4NjI1MCwidXNlcklkIjoiMTI2In0.aCn-lTXX31p2IdkAPl0DQF2p_uKhU3gm0BgRBZSp5uw")
				.when().get("http://54.167.125.15/syntaxapi/api/getOneEmployee.php");

		response.prettyPrint();
		int actualResponseCode = response.getStatusCode();
		System.out.println(actualResponseCode);

	}

	/*
	 * Task: getAllEmployeeStatuses PrettyPrint print status code
	 * 
	 */

	// @Test
	public void getAllEmployeeStatuses() {
		Response response = RestAssured.given().contentType("application/json").header("Authorization",
				"Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE1ODI0NzEwNTAsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTU4MjU4NjI1MCwidXNlcklkIjoiMTI2In0.aCn-lTXX31p2IdkAPl0DQF2p_uKhU3gm0BgRBZSp5uw")
				.when().get("http://54.167.125.15/syntaxapi/api/employeeStatus.php");

		response.prettyPrint();
		int actualResponseCode = response.getStatusCode();
		System.out.println(actualResponseCode);
	}

	@Test
	public void createEmployee() {
		Response response = RestAssured.given().contentType("application/json").header("Authorization",
				"Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE1ODI0NzEwNTAsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTU4MjU4NjI1MCwidXNlcklkIjoiMTI2In0.aCn-lTXX31p2IdkAPl0DQF2p_uKhU3gm0BgRBZSp5uw")
				.param("emp_firstname", "Kevin")
				.param("emp_lastname", "Mata")
				.param("emp_middle_name", "")
				.param("emp_gender", "1")
				.param("emp_birthday", "1996-12-03")
				.param("emp_status", "Employee")
				.param("emp_job_title", "Data Quality Manager")
				.when().post("http://54.167.125.15/syntaxapi/api/createEmployee.php");

		response.prettyPrint();
		int actualStatusCode = response.getStatusCode();
		Assert.assertEquals(200, actualStatusCode);

	}

	// @Test
	public void getAllEmployees() {
		Response response = RestAssured.given().contentType("application/json").header("Authorization",
				"Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE1ODI0NzEwNTAsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTU4MjU4NjI1MCwidXNlcklkIjoiMTI2In0.aCn-lTXX31p2IdkAPl0DQF2p_uKhU3gm0BgRBZSp5uw")
				.when().get("http://54.167.125.15/syntaxapi/api/getAllEmployees.php");
		response.prettyPrint();
		int actualStatusCode = response.getStatusCode();
		Assert.assertEquals(200, actualStatusCode);

	}

}
