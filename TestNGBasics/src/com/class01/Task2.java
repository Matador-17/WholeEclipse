package com.class01;

import org.testng.annotations.*;

public class Task2 {
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
	}
	@Test
	public void testOne() {
		System.out.println("I am Test One");
	}
	@Test
	public void testTwo() {
		System.out.println("I am Test two");	
	}
}
