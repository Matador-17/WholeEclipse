package com.class03;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.utils.CommonMethods;
import com.utils.Constants;

public class DataProviderDemo extends CommonMethods {
	@BeforeMethod
	public void openBrowser() {
		setUp("chrome", Constants.HRMS_URL);
	}
	@Test(dataProvider = "getData")
	public void logIn(String userName, String password) {
		driver.findElement(By.id("txtUsername")).sendKeys(userName);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();
		boolean welcomeDisplayed = driver.findElement(By.id("welcome")).isDisplayed();
		Assert.assertTrue(welcomeDisplayed, "Welcome element is NOT displayed");
	}

	// to create data provider, we need to create a method that will be returning an
	// object of a 2D array
	@DataProvider
	public Object[][] getData() {
		Object[][] data = { { "Admin", "Hum@nhrm123" }, { "Syntax", "Syntax123!" }, { "SyntaxUser", "Syntax123!" } };
		return data;
	}

	@AfterMethod(alwaysRun = true)
	public void tearDown() {
		driver.quit();
	}
}
