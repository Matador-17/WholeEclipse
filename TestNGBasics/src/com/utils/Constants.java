package com.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Constants {
	
	public static final String HRMS_URL="http://166.62.36.207/humanresources/symfony/web/index.php/auth/login";
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers//chromedriver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
		driver.findElement(By.id("btnLogin")).click();
	}
	public static final String SYNTAX_PRACTICE_URL="http://jiravm.centralus.cloudapp.azure.com:8081/index.html";
	public static final String welcomeToTheInternet="https://the-internet.herokuapp.com/";
	public static final String amazon="https://amazon.com/";
	public static final String TOOLSQA_URL="https://www.toolsqa.com/automation-practice-switch-windows/";
	
	
}
