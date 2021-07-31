package org.sample;
import java.util.Date;

import org.base.BaseParent;


import org.pojo.Facebk;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG1 extends BaseParent {
	@BeforeClass
	private void startDate() {
		Date d = new Date();
		System.out.println("start time is:" + d);
	}

	@AfterClass
	private void endDate() {
		Date d = new Date();
		System.out.println("End time :" + d);
	}

	@BeforeMethod
	private void launch() {
		chromeBrowserLaunch();
		launchUrl("https://en-gb.facebook.com/");
		toMaximize();
	}

	@AfterMethod
	private void quit() {
		toQuit();
	}
	@Test(priority=-2)
	private void tc1() {
		Facebk f=new Facebk();
		toInput(f.getTxtUser(),"Arshi");
		toInput(f.getTxtPass(), "3445");
		toClick(f.getLogIn());
	
	
	
	
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

