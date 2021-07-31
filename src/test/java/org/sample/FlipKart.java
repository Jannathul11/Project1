package org.sample;

import org.base.BaseParent;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.pojo.FlipKrt;

public class FlipKart extends BaseParent {

	@Before
	public void launch() {
		chromeBrowserLaunch();
		launchUrl("https://www.flipkart.com/account/login");
		toMaximize();
	}

	@Test
	public void tc1() throws Exception {
    
	FlipKrt f = new FlipKrt();

	toInput(f.getTxtBox(),toReadCell("Book1", "Sheet1", 1, 0));
	String s = toGetAttribute(f.getTxtBox());
	Assert.assertTrue("Username is true", s.contains("anu"));
	
	toInput(f.getPassBox(),toReadCell("Book1", "Sheet1", 1, 1)); 
	String t = toGetAttribute(f.getPassBox());
	Assert.assertEquals("Password is true", t,"12");	

	}

}
