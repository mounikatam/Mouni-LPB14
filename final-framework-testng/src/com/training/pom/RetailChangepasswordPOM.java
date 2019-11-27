package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




public class RetailChangepasswordPOM {

	
	private WebDriver driver; 
	
	public RetailChangepasswordPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(className="fa-user-o")
	private WebElement user_icon;
	
    @FindBy(className="tb_menu_system_account_account")
    private WebElement tb_txt;
    
	@FindBy(id="input-email")
	private WebElement userName; 
	
	@FindBy(id="input-password")
	private WebElement password;
	
	@FindBy(xpath="//input[@value='Login']")
	private WebElement loginBtn; 
	
	@FindBy(linkText="Change your password")
	private WebElement changepswd;
	 
    			
	@FindBy(id="input-password")
	private WebElement chngpswd;
	
	@FindBy(id="input-confirm")
	private WebElement pswdcnfm;
	
	@FindBy(xpath="//input[@type='submit'] [@value='Continue']")
	private WebElement continueBtn; 
	
	@FindBy(xpath="//div[@class='alert alert-success']")
	private WebElement msg;
	
	
	
	public void clickUserIcon() {
	 this.user_icon.click();
	 	}
	
		public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
		
		public void clickLoginBtn() {
		this.loginBtn.click();
		
			}
		
		public void clickChangepassword() {
			this.changepswd.click();
			
		}

		
		public void sendChPassword(String string) {
			this.chngpswd.sendKeys(string);
		}
		
		public void sendCfPassword(String string) {
			this.pswdcnfm.sendKeys(string);
		}
		
		public void clickContinueBtn() {
			Actions builder = new Actions(driver);
		    builder.moveToElement(continueBtn).click().perform(); 
		    	}
		
		public void displayMessage() {
			System.out.println("msg="+this.msg.getText());
		}
		


}