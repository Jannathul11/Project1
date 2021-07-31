package org.pojo;

import org.base.BaseParent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactInRadio extends BaseParent {
	public AdactInRadio() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "radiobutton_0") // no;
	private WebElement radio;

	@FindBy(id = "continue")
	private WebElement cont;

	public WebElement getRadio() {
		return radio;
	}

	public WebElement getCont() {
		return cont;
	}
	
	



}
