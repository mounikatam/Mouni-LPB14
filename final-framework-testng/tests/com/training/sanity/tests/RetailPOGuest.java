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
import com.training.pom.RetailPOGuestPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;


	public class RetailPOGuest {

		private WebDriver driver;
		private String baseUrl;
		private RetailPOGuestPOM retailpoguestPOM;
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
			retailpoguestPOM = new RetailPOGuestPOM(driver); 
			baseUrl = properties.getProperty("baseURL");
			screenShot = new ScreenShot(driver); 
			
		// open the browser 
			driver.get(baseUrl);
		
		}
		
		@AfterMethod
		public void tearDown() throws Exception {
			Thread.sleep(1000);
			
			//driver.quit();
		}
		
		@Test
		public void validRetailTest() throws InterruptedException {
			
			
			
			
			retailpoguestPOM.clickProduct();
			Thread.sleep(1000);
			retailpoguestPOM.clickAddcart();
			Thread.sleep(1000);
			retailpoguestPOM.displayMessage();
			retailpoguestPOM.Mousehover();
			Thread.sleep(3000);

			retailpoguestPOM.clickViewcartBtn();
			retailpoguestPOM.clickCheckoutBtn();
			retailpoguestPOM.clickGuestradioBtn();
			retailpoguestPOM.clickContinueBtn();
			retailpoguestPOM.sendFirstName("manzoor");
			retailpoguestPOM.sendLastName("mehadi");
			retailpoguestPOM.sendEmail("manzoor@gmail.com");
			retailpoguestPOM.sendTelephone("09876543210");
			retailpoguestPOM.sendAddress1("yeshwanthapur");
			retailpoguestPOM.sendAddress2("bangalore");
			retailpoguestPOM.sendCity("bangalore");
			retailpoguestPOM.sendPostcode("560022");
			retailpoguestPOM.DropdownCountry("India");
			retailpoguestPOM.DropdownZone("Karnataka");
			retailpoguestPOM.clickShipaddcheckbox();
			retailpoguestPOM.clickContinueGuestBtn();
			retailpoguestPOM.sendAddcomment("Test");
			retailpoguestPOM.clickContinueshipBtn();
			retailpoguestPOM.clickAgreecheckbox();
			Thread.sleep(1000);
			retailpoguestPOM.clickContinuepayBtn();
			retailpoguestPOM.clickConfirmordBtn();
			retailpoguestPOM.displayFMessage();

			screenShot.captureScreenShot("screenshots/First");
			
		}
		
	}

		
		