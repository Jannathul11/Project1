package org.pojo;

import org.base.BaseParent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinAddress extends BaseParent{
	public AdactinAddress() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id ="first_name") // no;
	private WebElement first;

	@FindBy(id ="last_name")
	private WebElement last;

	@FindBy(id ="address")
	private WebElement addr;
	
	@FindBy(id ="cc_num")
	private WebElement ccNo;
	
	@FindBy(id ="cc_type") // no;
	private WebElement ccType;

	@FindBy(id ="cc_exp_month")
	private WebElement expMonth;

	@FindBy(id ="cc_exp_year")
	private WebElement expYr;
	
	@FindBy(id ="cc_cvv")
	private WebElement cvv;
	
	@FindBy(id="book_now")
	private WebElement bookNow;

	
	public WebElement getFirst() {
		return first;
	}

	public WebElement getLast() {
		return last;
	}

	public WebElement getAddr() {
		return addr;
	}

	public WebElement getCcNo() {
		return ccNo;
	}

	public WebElement getCcType() {
		return ccType;
	}

	public WebElement getExpMonth() {
		return expMonth;
	}

	public WebElement getExpYr() {
		return expYr;
	}

	public WebElement getCvv() {
		return cvv;
	}
	public WebElement getBookNow() {
		return bookNow;
	}
}
	
	


