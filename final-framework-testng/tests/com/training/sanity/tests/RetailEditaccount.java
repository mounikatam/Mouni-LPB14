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
import com.training.pom.RetailEditaccountPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;



public class RetailEditaccount {
	

	private WebDriver driver;
	private String baseUrl;
	private RetailEditaccountPOM retaileditaccountPOM;
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
		retaileditaccountPOM = new RetailEditaccountPOM(driver); 
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
		retaileditaccountPOM.clickUserIcon();
		retaileditaccountPOM.sendUserName("mehadi123@gmail.com");
		retaileditaccountPOM.sendPassword("manzoor");
		retaileditaccountPOM.clickLoginBtn();
		retaileditaccountPOM.Editaccount();
		retaileditaccountPOM.sendFirstName("manzoor");
		retaileditaccountPOM.sendLastName("mehadi");
		retaileditaccountPOM.sendEmail("manzoor@gmail.com");
		retaileditaccountPOM.sendTelephone("8906543210");
		retaileditaccountPOM.clickContinueBtn();
		retaileditaccountPOM.displayMessage();
		screenShot.captureScreenShot("screenshots/First");
		}

		
	}
	
		



