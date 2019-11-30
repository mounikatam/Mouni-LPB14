package com.training.pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;




	public class RetailPOGuestPOM {

		
		private WebDriver driver; 
		
		public RetailPOGuestPOM(WebDriver driver) {
			this.driver = driver; 
			PageFactory.initElements(driver, this);
			
		}
		
		@FindBy(linkText="SasmitaRing")
		private WebElement product;
		
	    @FindBy(id="button-cart")
	    private WebElement addcart;
	    
		@FindBy(xpath="//ul[@class='noty_cont noty_layout_topRight']")
		private WebElement msg;
		
		@FindBy(xpath="//i[@class='tb_icon ico-linea-ecommerce-bag']")
		private WebElement mousehover;

		
		@FindBy(xpath="//a[@class='btn btn-sm']")
		private WebElement viewcartbtn;
		
		@FindBy(partialLinkText="Checkout")
		private WebElement checkoutbtn;
		
		
		@FindBy(xpath="//input[@value='guest']")
		private WebElement guestradiobtn;
	
		
		@FindBy(id="button-account")
		private WebElement contnbtn;
		
		
		@FindBy(id="input-payment-firstname")
		private WebElement firstname;
		
		
		@FindBy(id="input-payment-lastname")
		private WebElement lastname;
		
		@FindBy(id="input-payment-email")
		private WebElement email; 
		
		@FindBy(id="input-payment-telephone")
		private WebElement telephone; 
		
		@FindBy(id="input-payment-address-1")
		private WebElement address1;
		
		@FindBy(id="input-payment-address-2")
		private WebElement address2;
		
		@FindBy(id="input-payment-city")
		private WebElement city;
		
		@FindBy(id="input-payment-postcode")
		private WebElement postcode;
				
		@FindBy(id="input-payment-country")
		private WebElement country;
		
		@FindBy(id="input-payment-zone")
		private WebElement state;
		
		@FindBy(name="shipping_address")
		private WebElement shipaddcheckbox;
				
		@FindBy(id="button-guest")
		private WebElement continueguestbtn; 
		
		
		@FindBy(name="comment")
		private WebElement addcomment; 
		
		
		@FindBy(id="button-shipping-method")
		private WebElement continueshipbtn; 
		
		@FindBy(name="agree")
		private WebElement agreecheckbox;
		
		@FindBy(id="button-payment-method")
		private WebElement continuepaybtn; 
		
		
		@FindBy(xpath="//input[@value='Confirm Order']")
		private WebElement confirmordbtn;
		
		@FindBy(id="System_s3bhXNDb")
		private WebElement fmsg;

		
			public void clickProduct() {
			this.product.click();
			
		 
		 	}
		
			public void clickAddcart() {
			this.addcart.click();
			
		}
		
		public void displayMessage() {
		System.out.println("msg="+this.msg.getText());
			}
			
		public void Mousehover() {
			Actions builder = new Actions(driver);
		    builder.moveToElement(mousehover).build().perform();
		}
		
		public void clickViewcartBtn() {
			 this.viewcartbtn.click();
			 	}
			
		public void clickCheckoutBtn() {
			 this.checkoutbtn.click();
			 	}

		public void clickGuestradioBtn() {
			 this.guestradiobtn.click();
			 	}

		public void clickContinueBtn() {
			 this.contnbtn.click();
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
		
		
		
		
		public void sendAddress1(String address1) {
			this.address1.clear();
			this.address1.sendKeys(address1);
		}
		
		public void sendAddress2(String address2) {
			this.address2.clear();
			this.address2.sendKeys(address2);
		}
		
		public void sendCity(String city) {
			this.city.clear();
			this.city.sendKeys(city);
		}
	
		public void sendPostcode(String postcode) {
			this.postcode.clear();
			this.postcode.sendKeys(postcode);
		}
		

			public void DropdownCountry(String country) {
				Select drop = new Select(this.country);
				drop.selectByVisibleText(country);  
					
			}
		
				
		public void DropdownZone(String state) {
			Select drop = new Select(this.state);
		      drop.selectByVisibleText(state);  
		}

		
			
		
		public void clickShipaddcheckbox() {
			this.shipaddcheckbox.isSelected();
		}
				
		
		public void clickContinueGuestBtn() {
			this.continueguestbtn.click();
		}
		
		public void sendAddcomment(String addcomment) {
			this.addcomment.clear();
			this.addcomment.sendKeys(addcomment);
		}
		
		public void clickContinueshipBtn() {
			this.continueshipbtn.click();
		}
		
		
	
		public void clickAgreecheckbox() {
			this.agreecheckbox.isSelected();
			
			if(!agreecheckbox.isSelected())
				agreecheckbox.click();
		}
			
		public void clickContinuepayBtn() {
			this.continuepaybtn.click();
		}
		
		public void clickConfirmordBtn() {
		this.confirmordbtn.click();
		}
		
		public void displayFMessage() {
			System.out.println("fmsg="+this.fmsg.getText());
			}

		
		
		
}
