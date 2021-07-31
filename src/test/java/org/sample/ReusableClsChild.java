package org.sample;



import java.io.IOException;

import org.base.BaseParent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ReusableClsChild extends BaseParent{

	public static void main(String[] args) throws IOException, Exception  {
	chromeBrowserLaunch();
	launchUrl("https://en-gb.facebook.com/");
	toMaximize();
	WebElement txtPass= driver.findElement(By.id("email"));
	sendInJavaExe("'hello'", txtPass);
	getValueJavaExe(txtPass);
	
	
	}

	
	
}

