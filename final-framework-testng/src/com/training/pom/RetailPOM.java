package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RetailPOM {
	
	private WebDriver driver; 
	
	public RetailPOM(WebDriver driver) {
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
	
	@FindBy(xpath="//ul[@class='dropdown-menu tb_list_1']")
	private WebElement dropdown;
	 
    @FindBy(xpath="//span[@class='tb_text' and contains(text(),'MY ORDERS')]")
	private WebElement accountorder;

	@FindBy(className="fa-eye")
	private WebElement vieworder;

			
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
		
		public void Dropdown() {
			Actions builder = new Actions(driver);
		    builder.moveToElement(user_icon).build().perform();
		}
		
	    public void clickMyOrders() {
	    	this.accountorder.click();
			
		}

		public void clickViewOrder() {
		    this.vieworder.click();
			
		}

		
		
						
}
