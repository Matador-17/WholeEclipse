package com.utils;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CommonMethods {

	public static WebDriver driver;

	/**
	 * use this method instead of opening browser and target URL
	 * 
	 * @param browser the desired URL
	 * @param url     the desired URL
	 * @return
	 */
	public static WebDriver setUp(String browser, String url) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(url);
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "drivers//geckodriver.exe");
			driver = new FirefoxDriver();
		} else {
			System.err.println("This browser is not supported with this method");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
		return driver;
	}

	/**
	 * This method will accept the alert
	 * 
	 * @throws will throw an "NoAlertPresentException" if alert is not present
	 */
	public static void acceptAlert() {
		try {
			Alert alert = driver.switchTo().alert();
			alert.accept();
		} catch (NoAlertPresentException e) {
			System.out.println("Alert is not present");
		}
	}

	/**
	 * This method will dismiss the alert
	 * 
	 * @throws will throw an "NoAlertPresentException" if alert is not present
	 */
	public static void dismissAlert() {
		try {
			Alert alert = driver.switchTo().alert();
			alert.dismiss();
		} catch (NoAlertPresentException e) {
			System.out.println("Alert is not present");
		}
	}

	/**
	 * This method will get a text from the alert
	 * 
	 * @return text of the alert
	 * @throws will throw an "NoAlertPresentException" if alert is not present
	 */
	public static String getAlertText() {

		try {
			Alert alert = driver.switchTo().alert();
			return alert.getText();
		} catch (NoAlertPresentException e) {
			System.out.println("Alert is not present");
			return null;
		}
	}
	/**
	 * This method will switch to the Frame
	 * @param nameOrID
	 */

	public static void switchToFrame(String nameOrID) {
		try {
			driver.switchTo().frame(nameOrID);
		} catch (NoSuchFrameException e) {
			System.out.println("Frame is not present");
		}
	}
	/**
	 * This method will switch to the Frame
	 * @param WebElement
	 */

	public static void switchToFrame(WebElement element) {
		try {
			driver.switchTo().frame(element);
		}catch(NoSuchFrameException e) {
			System.out.println("Frame is not present");
		}
	}
	/**
	 * This method will switch to the Frame
	 * @param index
	 */
	public static void switchToFrame(int index) {
		try {
			driver.switchTo().frame(index);
		}catch(NoSuchFrameException e) {
			System.out.println("Frame is not present");
		}
	}
	/**
	 * this method will click on the element using JavaScript Executor
	 * @param element
	 */
	public static void jsClick(WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", element);
	}
	/**
	 * this method will scroll page until specified element is shown
	 * @param element
	 */
	public static void scrollIntoElement(WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}
	/**
	 * This method will scroll page down
	 * @param pixel
	 */
	public static void scrollDown(long pixel) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,"+ pixel+")");
	}
	/**
	 * This method will scroll the page up
	 * @param pixel - number of pixels you'd like to scroll up
	 */
	public static void scrollUp(long pixel) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, -" + pixel+")");
	}
	/**
	 * this method will take a screenshot
	 * @param fileName
	 */
	public static void takeScreenshot(String fileName) {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File file=ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File("screenshot/"+fileName+".png"));
		} catch (IOException e) {
			System.out.println("Cannot take a screenshot");
		}
	}
	
	
	
}
