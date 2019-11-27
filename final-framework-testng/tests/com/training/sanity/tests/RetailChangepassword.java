package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.RetailChangepasswordPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;


public class RetailChangepassword {

	private WebDriver driver;
	private String baseUrl;
	private RetailChangepasswordPOM retailchangepasswordPOM;
	private static Properties properties;
	private ScreenShot screenShot;




	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		retailchangepasswordPOM = new RetailChangepasswordPOM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		
	// open the browser 
		driver.get(baseUrl);
	
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		
		driver.quit();
	}
	
	@Test
	public void validRetailTest() throws InterruptedException {
		retailchangepasswordPOM.clickUserIcon();
		retailchangepasswordPOM.sendUserName("mehadi@gmail.com");
		retailchangepasswordPOM.sendPassword("manzoor");
		retailchangepasswordPOM.clickLoginBtn();
		retailchangepasswordPOM.clickChangepassword();
		retailchangepasswordPOM.sendChPassword("mehadi");
		retailchangepasswordPOM.sendCfPassword("mehadi");
		retailchangepasswordPOM.clickContinueBtn();
		Thread.sleep(5000);
		retailchangepasswordPOM.displayMessage();
		Thread.sleep(1000);
		screenShot.captureScreenShot("screenshots/First");
		}

		
	}
	
		



