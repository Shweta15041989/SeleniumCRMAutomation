package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.qa.util.TestUtil;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;

	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(
					"/Users/shweta.suresh.hadpad/eclipse-workspace/SeleniumAutomation/src/main/java/com/qa/config/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void initialization() {
		String browserName = prop.getProperty("browser");

		if (browserName.equals("edge")) {
			System.setProperty("webdriver.edge.driver",
					"/Users/shweta.suresh.hadpad/eclipse-workspace/SeleniumAutomation/webdriver/msedgedriver.exe");
			driver = new EdgeDriver();
		} else if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\shweta.suresh.hadpad\\Downloads\\edgedriver_win64\\msedgedriver.exe");
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestUtil.Page_Load_Timeout));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtil.Implicit_Timeout));
		driver.get(prop.getProperty("url"));
	}
}
