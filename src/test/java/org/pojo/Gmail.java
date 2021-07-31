package org.pojo;

import org.base.BaseParent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Gmail extends BaseParent{
	public Gmail(){
		PageFactory.initElements(driver, this);
	}
	
@FindBy(id="identifierId")                       //no;
private WebElement txtUser;

@FindBy(name="password")
private WebElement txtPass;

public WebElement getTxtUser() {
	return txtUser;
}

public WebElement getTxtPass() {
	return txtPass;
}


}