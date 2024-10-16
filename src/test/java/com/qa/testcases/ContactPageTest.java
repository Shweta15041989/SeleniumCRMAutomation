package com.qa.testcases;
import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.ContactPage;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.util.TestUtil;

public class ContactPageTest extends TestBase{
    LoginPage login;
     HomePage home;
    ContactPage contact;
    String sheetName = "contacts";
//testcases
@BeforeMethod
    public void setUp() throws InterruptedException, IOException{
        initialization();
        login = new LoginPage();
		login.enterLogindetails(prop.getProperty("email"), prop.getProperty("password"));
    }

@Test(priority = 2, dataProvider="getCRMTestData")
public void enterDet(String firstName, String middleName, String lastName){
    home = new HomePage();
    home.clickContactIcon();
    contact =new ContactPage();
    contact.addContact();
    contact.enterDetails(firstName,middleName,lastName);
    
}

@DataProvider()
public Object[][] getCRMTestData(){
    Object[][] data = TestUtil.getTestData(sheetName);
    return data;


}
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
