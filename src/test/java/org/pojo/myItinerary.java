package org.pojo;

import org.base.BaseParent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

 public class myItinerary  extends BaseParent{
	public myItinerary() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="hotel_name") // no;
	private WebElement title;
	
	@FindBy(id ="order_no") // no;
	private WebElement orderNum;


	@FindBy(xpath="//input[@value='My Itinerary']") // no;
	private WebElement myItinry;
	
	public WebElement getTitle() {
		return title;
	}
	
	public WebElement getOrderNum() {
		return orderNum;
	} 
	
	public WebElement getMyItinry() {
		return myItinry;
	}

	
	
}

 
 
	

