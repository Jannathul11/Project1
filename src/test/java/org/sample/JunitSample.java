package org.sample;

import java.util.Date;

import org.base.BaseParent;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.pojo.Adactin;

public class JunitSample extends BaseParent {
	@BeforeClass
	public static void startDate() {
		Date d = new Date();
		System.out.println("start time is:" + d);
	}

	@AfterClass
	public static void endDate() {
		Date d = new Date();
		System.out.println("End time :" + d);
	}

	@Before
	public void launch() {
		chromeBrowserLaunch();
		launchUrl("http://adactinhotelapp.com/");
		toMaximize();
	}

	@After
	public void quit() {
		toQuit();
	}
	@Test
	public void tc1() {
		Adactin a=new Adactin();
		toInput(a.getTxtUser(), "Jaya");
		toInput(a.getTxtPass(), "12345");
		}
	@Test
	public void tc2() {
		Adactin a=new Adactin();
		toInput(a.getTxtUser(), "Gayu");
		toInput(a.getTxtPass(), "12#j5");
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
