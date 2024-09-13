package com.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

public class HomePageTest extends TestBase{

	LoginPage login;
	HomePage home;
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
		login = new LoginPage();
		login.enterLogindetails(prop.getProperty("email"), prop.getProperty("password"));
	}
	
	@Test
	public void clickHomeIcon() {
		home = new HomePage();
		home.clickHomeIcon();
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
