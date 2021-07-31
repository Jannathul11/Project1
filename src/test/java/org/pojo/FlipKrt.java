package org.pojo;

import org.base.BaseParent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory; 

public class FlipKrt extends BaseParent {
	public FlipKrt() {
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement txtBox;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement passBox;

	public WebElement getTxtBox() {
		return txtBox;
	}

	public WebElement getPassBox() {
		return passBox;
	}
	
	

}
