package org.sample;

import org.base.BaseParent;
import org.junit.Before;
import org.junit.Test;
import org.pojo.AdactInRadio;
import org.pojo.Adactin;
import org.pojo.AdactinAddress;
import org.pojo.AdactinLocation;
import org.pojo.myItinerary;


public class AdactinFromExcel extends BaseParent {

	@Before
	public void launch() {
		chromeBrowserLaunch();
		launchUrl("http://adactinhotelapp.com/");
		toMaximize();
	}

	@Test
	public void tc1() throws Exception {
		Adactin a = new Adactin();

		toInput(a.getTxtUser(), toReadCell("Adactin", "Sheet1", 0, 1));
		toInput(a.getTxtPass(), toReadCell("Adactin", "Sheet1", 1, 1));
		toClick(a.getLogIn());

		AdactinLocation b=new AdactinLocation();
		
		toSelect(b.getPlace(),4 );
		toSelect(b.getHotel(), 1);
		toSelect(b.getRoom(), 1);
		toSelect(b.getRoomNo(),1);
		toInput(b.getCheckIn(),toReadCell("Adactin", "Sheet1", 2, 1));
		toInput(b.getCheckOut(),toReadCell("Adactin", "Sheet1", 3, 1));
		toSelect(b.getAdult(), 2);
		toSelect(b.getChild(), 2);
		toRobotTab();
		toRobotEnter();
	
		AdactInRadio c=new AdactInRadio();
		
		toClick(c.getRadio());
		toClick(c.getCont());
	
		AdactinAddress d=new AdactinAddress();
		
		toInput(d.getFirst(),toReadCell("Adactin", "Sheet1", 4, 1));
		toInput(d.getLast(),toReadCell("Adactin", "Sheet1", 5, 1));
		toInput(d.getAddr(),toReadCell("Adactin", "Sheet1", 6, 1));
		toInput(d.getCcNo(),toReadCell("Adactin", "Sheet1", 7, 1));
		toSelect(d.getCcType(), 2);
		toSelect(d.getExpMonth(), 2);
		toSelect(d.getExpYr(), 11);
		toInput(d.getCvv(),toReadCell("Adactin", "Sheet1", 8, 1));
		toClick(d.getBookNow());
		Thread.sleep(6000);
							
		myItinerary i=new myItinerary();
		
		scrollDownJavaExe(i.getTitle());
        
        String s=toGetAttribute(i.getOrderNum());
		System.out.println(s);
		excelUpdate("Adactin", "Sheet1", 9, 1,"empty",s) ;
		
		toClick(i.getMyItinry());
	
	
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

