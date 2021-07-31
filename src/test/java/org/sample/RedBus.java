package org.sample;
import org.base.BaseParent;
import org.junit.Before;
import org.junit.Test;
import org.pojo.RedBusPhn;
import org.pojo.RedBusSignIn;

public class RedBus extends BaseParent {

	@Before
	public void launch() {
		chromeBrowserLaunch();
		launchUrl("https://www.redbus.in/");
		toMaximize();
	}

	@Test
	public void tc1() throws Exception {
    
		RedBusSignIn f = new RedBusSignIn();

    Thread.sleep(5000);
	toClick(f.getClk());
	toClick(f.getSignIn());
	
	toswitchWindow();
	
	RedBusPhn p = new RedBusPhn();
    sendInJavaExe("9384053513",p.getRedBusPhn());
    
    
	
	}
	
	
	
	
	
	
	
}

	

/*toInput(f.getFrom(),"Chennai");
String s = toGetAttribute(f.getFrom());
Assert.assertTrue("source place is true", s.equalsIgnoreCase("chennai"));

toInput(f.getTo(),"Madurai"); 
String t = toGetAttribute(f.getTo());
Assert.assertEquals("destination is true", t,"Madurai");	
	
toClick(f.getSrchBtn());

}  */
