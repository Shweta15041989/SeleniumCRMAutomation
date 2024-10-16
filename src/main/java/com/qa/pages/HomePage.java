package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.base.TestBase;

public class HomePage extends TestBase{

	//Page Factory
	@FindBy(xpath="//a[contains(@href,\"/home\")]")
	WebElement homeIcon;
	
	@FindBy(xpath="//div/b[contains(text(),'Shweta')]")
	WebElement nameDisplay;
	
	@FindBy(xpath="//div/a[@href='/contacts']")
	WebElement contacts;
	
	LoginPage login;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickHomeIcon() {
		homeIcon.click();
		System.out.println("HomeIcon is clicked");
	}
	
	public void nameLabel() {
		String namelLabel = nameDisplay.getText();
		Assert.assertEquals("Shweta", namelLabel);
		System.out.println("The username dispalyed is " + namelLabel );
	}

	public void clickContactIcon(){
		contacts.click();
		System.out.println("Contact Icon is clicked");
	}
}

