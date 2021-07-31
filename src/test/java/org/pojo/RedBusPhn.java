package org.pojo;
	import org.base.BaseParent;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class RedBusPhn extends BaseParent  {

		public RedBusPhn() {
		PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath="(//input[@placeholder='Enter your mobile number'])[2]")
		private WebElement phn;

		public WebElement getRedBusPhn() {
			return getRedBusPhn();
		}
        
		
}




