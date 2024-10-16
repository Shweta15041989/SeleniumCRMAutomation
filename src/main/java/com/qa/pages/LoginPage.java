package com.qa.pages;

//import org.jspecify.annotations.Nullable;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import java.io.File;
import java.io.IOException;

import com.google.common.io.Files;
import com.qa.base.TestBase;

public class LoginPage  extends TestBase{
	
	//PageFactory
	@FindBy(xpath="//a[@class=\"btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left\"]")
	WebElement startHere;
	
	@FindBy(xpath="//input[@name=\"email\"]")
	WebElement username;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;

	@FindBy(xpath="//div[@class=\"ui fluid large blue submit button\"]")
	WebElement login;
	
	@FindBy(xpath="//h1[contains(text(),\"CRM\")]")
	WebElement pageText; 
	
	
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public String validateLoginPageTitle() {
		
		return driver.getTitle();
	}
	
	public String enterLogindetails(String mail, String pass) throws InterruptedException, IOException {
		startHere.click();
		Thread.sleep(3000);
		username.sendKeys(mail);
		password.sendKeys(pass);
		
		login.click();
		String homeTitle = driver.getTitle();
		Assert.assertEquals(homeTitle, "Cogmento CRM");
		System.out.println("Successfully Logged in");
		System.out.println("Title of the page is " + homeTitle);
		// File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// Files.copy(f, new File(  "C://Desktop//img.png"));
		// JavascriptExecutor js = (JavascriptExecutor)driver;
		// js.executeScript("window.scrollBy(0,1000)");
					return homeTitle;
		//return new HomePage();
	}
}
