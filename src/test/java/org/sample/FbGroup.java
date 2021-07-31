package org.sample;

import org.base.BaseParent;
import org.pojo.Facebk;
import org.testng.annotations.Test;

public class FbGroup extends BaseParent {
	
	
	@Test(groups= {"@sanity","@regression"})
	private void tc1() {
		chromeBrowserLaunch();
		launchUrl("https://en-gb.facebook.com/");
		toMaximize();
		Facebk f=new Facebk();
		toInput(f.getTxtUser(),"Arshi");
		toInput(f.getTxtPass(), "3445");
		toClick(f.getLogIn());
		toQuit();
	}
	@Test()
	private void tc2() {
		chromeBrowserLaunch();
		launchUrl("https://en-gb.facebook.com/");
		toMaximize();
		Facebk f=new Facebk();
		toInput(f.getTxtUser(),"Balu");
		toInput(f.getTxtPass(), "34489");
		toClick(f.getLogIn());
		toQuit();
	}
	@Test(groups="@sanity")
	private void tc3() {
		chromeBrowserLaunch();
		launchUrl("https://en-gb.facebook.com/");
		toMaximize();
		Facebk f=new Facebk();
		toInput(f.getTxtUser(),"Hari");
		toInput(f.getTxtPass(), "3445");
		toClick(f.getLogIn());
		toQuit();
	}
	@Test(groups="@smoke")
	private void tc5() {
		chromeBrowserLaunch();
		launchUrl("https://en-gb.facebook.com/");
		toMaximize();
		Facebk f=new Facebk();
		toInput(f.getTxtUser(),"Stella");
		toInput(f.getTxtPass(), "3445");
		toClick(f.getLogIn());
		toQuit();
	}
	@Test(groups="@regression")
	private void tc4() {
		chromeBrowserLaunch();
		launchUrl("https://en-gb.facebook.com/");
		toMaximize();
		Facebk f=new Facebk();
		toInput(f.getTxtUser(),"Anu");
		toInput(f.getTxtPass(), "3445");
		toClick(f.getLogIn());
		toQuit();
}
}	
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	

