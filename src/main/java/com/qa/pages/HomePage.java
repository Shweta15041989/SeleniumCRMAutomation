package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class HomePage extends TestBase{

	//Page Factory
	@FindBy(xpath="//a[contains(@href,\"/home\")]")
	WebElement homeIcon;
	
	LoginPage login;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickHomeIcon() {
		homeIcon.click();
		System.out.println("HomeIcon is clicked");
	}
}
