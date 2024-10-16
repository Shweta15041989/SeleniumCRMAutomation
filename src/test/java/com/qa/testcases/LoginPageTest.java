package com.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	
	LoginPage login;
	HomePage homePage;
	
	public LoginPageTest() {
		super();
	}
	@BeforeMethod
	public void setUp() {
		initialization();
		 login = new LoginPage();
	}

	@Test(priority=1)
	public void loginTitleTest() {
		String title = login.validateLoginPageTitle();
		Assert.assertEquals(title, "#1 Free CRM Software Power Up your Entire Business Free Forever");
		}
	
	@Test(priority=2)
	public void loginTest() throws InterruptedException, IOException {
		login.enterLogindetails(prop.getProperty("email"), prop.getProperty("password"));
		
	}
	@AfterMethod
	public void tearDown() {
    System.out.println("Finish");
    driver.quit();
	}
}
