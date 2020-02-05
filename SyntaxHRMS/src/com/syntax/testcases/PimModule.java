package com.syntax.testcases;

import org.testng.annotations.Test;

public class PimModule {
	@Test(groups= {"Regression","Smoke"})
	public void validatePimModule() {
		System.out.println("This is PIM Module Test Case");
		
	}
	@Test(groups= {"Regression"})
	public void validateAddEmployee() {
		System.out.println("This is Add Employee Test Case");
	}
	@Test(groups= {"Regression"})
	public void removeEmployee() {
		System.out.println("This is Remove Employee Test Case");
	}

}
