package com.hha.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hha.pageobject.LoginPage;

public class LoginPageTest extends BaseClass {
	 LoginPage loginpage;
	 
	@Test
	public void verifyTitle() {
		 loginpage = new LoginPage(driver);
		String actualTitle = loginpage.verifyTitleOfApplication();
		String expectedTitle = "Swag Labs";
		Assert.assertEquals(actualTitle, expectedTitle);
	}

	@Test
	public void verifyURLOfApplicationTest() {
		
		String expURL = "https://www.saucedemo.com/";
		String actURL = loginpage.verifyURLOfApplication();
		Assert.assertEquals(expURL, actURL);
	}
	@Test
	public void verifylogin() throws IOException {
		
		String actualURL = loginpage.loginToApplication();
		String expectedURL = "https://www.saucedemo.com/inventory.html";
		Assert.assertEquals(actualURL, expectedURL);
	}
}
