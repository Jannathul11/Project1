package org.pojo;

import org.base.BaseParent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebk extends BaseParent{
	public Facebk(){
		PageFactory.initElements(driver, this);
	}
	
@FindBy(id="email")                       //no;
private WebElement txtUser;

@FindBy(name="pass")
private WebElement txtPass;

@FindBy(xpath="//button[text()='Log In']")
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


