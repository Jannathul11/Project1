package org.sample;

import java.awt.AWTException;

import org.base.BaseParent;

import org.pojo.Gmail;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class GmailTestng extends BaseParent {
	
	@DataProvider(name="credentials")
	private Object[][] data(){
		return new Object[][] {
		
		{"mysteriousvolcano@gmail.com","Jannathul33"},{"jannathul.218@gmail.com","689756789"}
	};
}

	@BeforeMethod
	private void launch() {
		chromeBrowserLaunch();
		launchUrl("https://mail.google.com/");
		toMaximize();
	}
	
	@AfterMethod
	private void quit() {
		toQuit();
	}
	
	@Test(dataProvider="credentials")
	private void tc1(String user,String pass) throws AWTException {
		Gmail f=new Gmail();
		toInput(f.getTxtUser(),user);
		toRobotEnter();
		toInput(f.getTxtPass(),pass);
		toRobotEnter();		
}
}