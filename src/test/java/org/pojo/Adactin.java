package org.pojo;

import org.base.BaseParent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin extends BaseParent{
	public Adactin(){
		PageFactory.initElements(driver, this);
	}
	
@FindBy(id="username")                       //no;
private WebElement txtUser;

@FindBy(name="password")
private WebElement txtPass;

@FindBy(id="login")
private WebElement logIn;

public WebElement getTxtUser() {
	return txtUser;
}

public WebElement getTxtPass() {
	return txtPass;
}

public WebElement getLogIn() {
	return logIn;
}



}
