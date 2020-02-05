package com.syntax.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReportModule {
	@Test(priority = 1, groups = { "Regression", "Smoke" })
	public void validateReportModule() {
		System.out.println("This is Report Module Test Case");

	}

	@Test(enabled = true, groups = { "Regression" })
	public void openReport() {
		// System.out.println("This is open report Test Case");
		Assert.assertTrue(true);
	}

	@Test(groups = { "Regression" })
	public void closeReport() {
		System.out.println("This is close report Test Case");
	}

}
