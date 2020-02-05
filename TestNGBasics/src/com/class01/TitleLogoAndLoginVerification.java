package com.class01;

import org.openqa.selenium.By;
import org.testng.annotations.*;

import com.utils.CommonMethods;
import com.utils.Constants;

public class TitleLogoAndLoginVerification extends CommonMethods {
	@BeforeMethod
	public void openAndNavigate() {
		setUp("Chrome", Constants.HRMS_URL);

	}

	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

	@Test
	public void titleVerification() {
		String expectedtitle = "Human Management System";
		String actualTitle = driver.getTitle();
		if (actualTitle.equals(expectedtitle)) {
			System.out.println("Test Passed");
		} else {
			System.err.println("Test Failed");
		}
	}

	@Test
	public void logoValidation() {
		boolean isDisplayed = driver.findElement(By.xpath("//div[@id='divLogo']/img")).isDisplayed();
		if (isDisplayed) {
			System.out.println("Logo Test Case Pass");
		} else {
			System.err.println("Logo Test Case Failed");
		}
	}

	@Test
	public void validLogin() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
		driver.findElement(By.id("btnLogin")).click();
	}

}
