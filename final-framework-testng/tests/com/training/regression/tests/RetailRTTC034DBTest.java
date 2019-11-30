package com.training.regression.tests;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.training.bean.LoginBean;
import com.training.dao.ELearningDAO;
import com.training.dataproviders.LoginDataProviders;
import com.training.dataproviders.RetailRTTC0034DataProviders;
import com.training.generics.GenericMethods;
import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.RetailPOGuestPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RetailRTTC034DBTest {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private static Properties properties;
	private ScreenShot screenShot;
	private GenericMethods genericMethods; 
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp(RetailPOGuestPOM retailpoguestPOM) throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		retailpoguestPOM = new RetailPOGuestPOM(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver);
		genericMethods = new GenericMethods(driver); 
		// open the browser
		driver.get(baseUrl);
	}

	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}


	@Test(dataProvider = "db-inputs", dataProviderClass = RetailRTTC0034DataProviders.class)
	public void retailrttc034DBTest(String firstname, String lastname, String email, String telephone, String address1, String address2, String city, String postcode, String country, String state, String addcomment, RetailPOGuestPOM reatilpoguestPOM) throws InterruptedException {
		

		// for demonstration 
//		genericMethods.getElement("login", "id"); 
				
		reatilpoguestPOM.sendFirstName(firstname);
		reatilpoguestPOM.sendLastName(lastname);
		reatilpoguestPOM.sendEmail(email);
		reatilpoguestPOM.sendTelephone(telephone);
		reatilpoguestPOM.sendAddress1(address1);
		reatilpoguestPOM.sendAddress2(address2);
		reatilpoguestPOM.sendCity(city);
		reatilpoguestPOM.sendPostcode(postcode);
		reatilpoguestPOM.DropdownCountry(country);
		reatilpoguestPOM.DropdownZone(state);
		reatilpoguestPOM.clickShipaddcheckbox();
		reatilpoguestPOM.clickContinueGuestBtn();
		reatilpoguestPOM.sendAddcomment(addcomment);
		reatilpoguestPOM.clickContinueshipBtn();
		reatilpoguestPOM.clickAgreecheckbox();
		Thread.sleep(1000);
		reatilpoguestPOM.clickContinuepayBtn();
		reatilpoguestPOM.clickConfirmordBtn();
		reatilpoguestPOM.displayFMessage();
		
		//screenShot.captureScreenShot(userName);

	}

}