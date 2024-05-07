package com.hha.pageobject;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;
import com.hha.testcases.BaseClass;

public class LoginPage extends BaseClass {
	

	// constructor
	public LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

	// identify webelements
	
	@FindBy(xpath="//input[@id='user-name']") private WebElement userNameTxtBox;

	@FindBy(xpath="//input[@id='password']")private WebElement passwordTxtBox;
	
	@FindBy(xpath = "//input[@id='login-button']") private WebElement loginBtn;

	public String loginToApplication() throws IOException {
		userNameTxtBox.sendKeys("standard_user");
		logger.info("User name is entered ");
		passwordTxtBox.sendKeys("secret_sauce");
		logger.info("Password is entered");
		loginBtn.click();
		logger.info("Login button is clicked");
		return driver.getCurrentUrl();// https://www.saucedemo.com/inventory.html
	}

	public String verifyTitleOfApplication() {
		return driver.getTitle();
	}

	public String verifyURLOfApplication() {
		return driver.getCurrentUrl();

	}
}
