package org.pojo;

import org.base.BaseParent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RedBusLgin extends BaseParent  {

	public RedBusLgin() {
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="src")
	private WebElement from;
	
	@FindBy(id="dest")
	private WebElement to;
	
	@FindBy(id="onward_cal")
	private WebElement calender;
	
	@FindBy(id="//td[@class='current day']")
	private WebElement num;
	
	
	@FindBy(id="search_btn")
	private WebElement srchBtn;

	public WebElement getFrom() {
		return from;
	}

	public WebElement getTo() {
		return to;
	}

	public WebElement getCalender() {
		return calender;
	}

	public WebElement getNum() {
		return num;
	}

	public WebElement getSrchBtn() {
		return srchBtn;
	}










}