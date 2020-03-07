package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.*;

public class FBPageElements {
	
	
	@FindBy(id="email")
	public WebElement email;
	
	@FindBy(id="pass")
	public WebElement password;
	
	@FindBy(id="u_0_2")
	public WebElement loginBtn;
	
	public FBPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	

}
