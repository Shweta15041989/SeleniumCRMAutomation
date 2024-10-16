package com.qa.pages;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.time.Duration;
import java.io.*;

import com.google.common.io.Files;
import com.qa.base.TestBase;


public class ContactPage extends TestBase {

    @FindBy(xpath = "//div/a[@href='/contacts']/following-sibling::button[@class='ui mini basic icon button']")
    WebElement addIcon;

    @FindBy(xpath = "//div/input[@name='first_name']")
    WebElement enterFirstname;

    @FindBy(xpath = "//div/input[@name='last_name']")
    WebElement enterLastname;
    @FindBy(xpath = "//div[@name='company']")
    WebElement enterCompanyname;
    @FindBy(xpath = "//div/input[@name='middle_name']")
    WebElement enterMiddlename;
    @FindBy(xpath="//div/button[@class='ui linkedin button']")
    WebElement saveButton;
    @FindBy(xpath="//div[@id='dashboard-toolbar']")
    WebElement dash;

    public ContactPage() {
        PageFactory.initElements(driver, this);
    }

    public void addContact() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
        Actions action = new Actions(driver);
        action.moveToElement(addIcon).perform();
        addIcon.click();
        System.out.println("Add contcat icon is clicked");
    }

    public void enterDetails(String firstName, String lastName, String middleName) {
        dash.click();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
        enterFirstname.sendKeys(firstName);
        enterLastname.sendKeys(lastName);
        enterMiddlename.sendKeys(middleName);
        //enterCompanyname.sendKeys(companyName);

        System.out.println("Details entered");
        File scrshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            Files.copy(scrshot, new File("/Volumes/Data/Shweta_Project/screenshot.jpg"));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        saveButton.click();

    }
}
