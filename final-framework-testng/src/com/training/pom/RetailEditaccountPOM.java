package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.Assert;



public class RetailEditaccountPOM {

	
	private WebDriver driver; 
	
	public RetailEditaccountPOM(WebDriver driver) {
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
	
	@FindBy(linkText="Edit your account information")
	private WebElement editaccount;
	 
    			
	@FindBy(id="input-firstname")
	private WebElement firstname;
	
	@FindBy(id="input-lastname")
	private WebElement lastname;
	
	@FindBy(id="input-email")
	private WebElement email; 
	
	@FindBy(id="input-telephone")
	private WebElement telephone; 
	
	@FindBy(xpath="//input[@value='Continue']")
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
		
		public void Editaccount() {
			this.editaccount.click();
			
		}

		
		public void sendFirstName(String firstname) {
			this.firstname.clear();
			this.firstname.sendKeys(firstname);
		}
		
		public void sendLastName(String lastname) {
			this.lastname.clear();
			this.lastname.sendKeys(lastname);
		}
		
		public void sendEmail(String email) {
			this.email.clear();
			this.email.sendKeys(email);
		}
	
		public void sendTelephone(String telephone) {
			this.telephone.clear();
			this.telephone.sendKeys(telephone);
		}
		
		public void clickContinueBtn() {
			this.continueBtn.click();
		}
		
		public void displayMessage() {
			System.out.println("Success: Your account has="+this.msg.getText());
		}
		


}