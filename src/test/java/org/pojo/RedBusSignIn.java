package org.pojo;
	import org.base.BaseParent;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class RedBusSignIn extends BaseParent  {

		public RedBusSignIn() {
		PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath="//div[@id='sign-in-icon-down']")
		private WebElement clk;

		@FindBy(xpath="//li[text()='Sign In/Sign Up']")
		private WebElement signIn;
		
		public WebElement getClk() {
			return clk;
		}

		public WebElement getSignIn() {
			return signIn;
		}
        
		
}
