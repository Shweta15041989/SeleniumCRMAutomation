package com.qa.testcases;
import java.io.IOException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

public class HomePageTest extends TestBase {

	LoginPage login;
	HomePage home;

	@BeforeMethod
	public void setUp() throws InterruptedException, IOException {
		initialization();
		login = new LoginPage();
		login.enterLogindetails(prop.getProperty("email"), prop.getProperty("password"));
	}

	@Test(priority =1)
	public void clickHomeIcon() {
		home = new HomePage();
		home.clickHomeIcon();
	}
	
	@Test(priority = 2)
	public void usernameLabel() {
		home = new HomePage();
		home.nameLabel();
	}

	@Test(priority = 3)
	public void clickContactIcon(){
		home = new HomePage();
		home.clickContactIcon();
	}
	


	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
