package com.hrms.steps;

import org.junit.Assert;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;


public class TestingSteps {

	@When("I do some step")
	public void i_do_some_step() {
		System.out.println("I do some step");
	}

	@When("another step")
	public void another_step(DataTable table) {
		System.out.println("Another Step");
		System.out.println(table);

		System.out.println("asList " + table.asList());

	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes(DataTable secondTable) {
		System.out.println("I validate the outcomes");
		System.out.println(secondTable);
	}

	@When("I check for the {int} in step")
	public void i_check_for_the_in_step(Integer value) {
		System.out.println("I check for the {int} in step");
		System.out.println(value);

	}

	@Then("I verify that for value {int}, the result {string}")
	public void i_verify_that_for_value_the_result(Integer value, String result) {
		System.out.println("I verify that for value {int}, the result {string}");
		System.out.println(value + " " + result);
		String expected="Success";
		Assert.assertEquals(expected, result );
	}

}
