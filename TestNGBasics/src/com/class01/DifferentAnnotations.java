package com.class01;

import org.testng.annotations.*;

public class DifferentAnnotations {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
	}
	@BeforeGroups
	public void beforeGroups() {
		System.out.println("Before Groups");
	}
	@AfterGroups
	public void afterGroups() {
		System.out.println("After Groups");
	}
	@Test
	public void Test() {
		System.out.println("I am an actual test");
	}
	
	
}
