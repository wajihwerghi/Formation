package com.e2eTests.automation.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AuthentificationPage {
	
	final static String USER_NAME_ID= "txtUsername";
	final static String Password_ID= "txtPassword";
	final static String btnLogin_ID= "btnLogin";
	
	/*@FindBy*/
	@FindBy(how=How.ID, using= USER_NAME_ID)
	public static WebElement userName;
	
	@FindBy(how=How.ID, using= Password_ID)
	public static WebElement Password;
	
	@FindBy(how=How.ID, using= btnLogin_ID)
	public static WebElement btnLogin;
	
	/*Method*/
	public void fillUserName() throws InterruptedException {
		userName.sendKeys("Admin");
	}
	
	public void fillPassword() throws InterruptedException {	
		Password.sendKeys("admin123");
	}
	
	public void clickLoginbutton() {
		btnLogin.click();
	}

}
