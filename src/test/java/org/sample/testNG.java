package org.sample;
import org.base.BaseParent;
import org.pojo.Adactin;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class testNG extends BaseParent {
			
	@Test(priority=-2)
	private void tc2() {
		chromeBrowserLaunch();
		launchUrl("http://adactinhotelapp.com/");
		toMaximize();
		Adactin a=new Adactin();
		toInput(a.getTxtUser(), "Jaya");
		String user = toGetAttribute(a.getTxtUser());
		Assert.assertEquals("Jaya",user,"user name verification");
		
		toInput(a.getTxtPass(), "12345");
		String pass = toGetAttribute(a.getTxtPass());
		SoftAssert s=new SoftAssert();
		s.assertEquals("12345",pass,"user password verification");                 
		
		toQuit();
		s.assertAll();
		}
	
	@Test(enabled=false)
	private void tc1() {
		chromeBrowserLaunch();
		launchUrl("http://adactinhotelapp.com/");
		toMaximize();
		Adactin a=new Adactin();
		toInput(a.getTxtUser(), "Noor");
		String user = toGetAttribute(a.getTxtUser());
		Assert.assertEquals("Noor",user,"user name verification");
		
		toInput(a.getTxtPass(), "129j5");
		String pass = toGetAttribute(a.getTxtPass());
		SoftAssert s=new SoftAssert();
		s.assertEquals("129j5",pass,"user password verification");   
		
		toQuit();
		s.assertAll();
		}
	
	@Test
	private void tc3() {
		chromeBrowserLaunch();
		launchUrl("http://adactinhotelapp.com/");
		toMaximize();
		Adactin a=new Adactin();
		toInput(a.getTxtUser(), "hari");
		String user = toGetAttribute(a.getTxtUser());
		Assert.assertEquals("hari",user,"user name verification");
		
		toInput(a.getTxtPass(), "109j5");
		String pass = toGetAttribute(a.getTxtPass());
		SoftAssert s=new SoftAssert();
		s.assertEquals("12345",pass,"user password verification");   //fails
		
		toQuit();
		s.assertAll();
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
