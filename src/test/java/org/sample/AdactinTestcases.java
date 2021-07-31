package org.sample;
import org.base.BaseParent;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.pojo.AdactInRadio;
import org.pojo.Adactin;
import org.pojo.AdactinAddress;
import org.pojo.AdactinLocation;
import org.pojo.myItinerary;

public class AdactinTestcases  extends BaseParent {

	@Before
	public void launch() throws Exception {
		chromeBrowserLaunch();
		launchUrl("http://adactinhotelapp.com/");
		toMaximize();
		
		Adactin a = new Adactin();

		toInput(a.getTxtUser(), toReadCell("AdactinTC", "Sheet1", 0, 1));
		toInput(a.getTxtPass(), toReadCell("AdactinTC", "Sheet1", 1, 1));
		toClick(a.getLogIn());
	}
	
	@After
	public void quit() {
		toQuit();
	}

	@Test
	public void tc1() throws Exception {
		
		AdactinLocation b=new AdactinLocation();
		
		toSelect(b.getPlace(),4 );
		toSelect(b.getHotel(), 1);
		toSelect(b.getRoom(), 1);
		toSelect(b.getRoomNo(),1);
		toInput(b.getCheckIn(),toReadCell("AdactinTC", "Sheet1", 2, 1));
		toInput(b.getCheckOut(),toReadCell("AdactinTC", "Sheet1", 3, 1));
		toSelect(b.getAdult(), 2);
		toSelect(b.getChild(), 2);
		toRobotTab();
		toRobotEnter();
	
		AdactInRadio c=new AdactInRadio();
		
		toClick(c.getRadio());
		toClick(c.getCont());
	
		AdactinAddress d=new AdactinAddress();
		
		toInput(d.getFirst(),toReadCell("AdactinTC", "Sheet1", 4, 1));
		toInput(d.getLast(),toReadCell("AdactinTC", "Sheet1", 5, 1));
		toInput(d.getAddr(),toReadCell("AdactinTC", "Sheet1", 6, 1));
		toInput(d.getCcNo(),toReadCell("AdactinTC", "Sheet1", 7, 1));
		toSelect(d.getCcType(), 2);
		toSelect(d.getExpMonth(), 2);
		toSelect(d.getExpYr(), 11);
		toInput(d.getCvv(),toReadCell("AdactinTC", "Sheet1", 8, 1));
		toClick(d.getBookNow());
		Thread.sleep(6000);
							
		myItinerary i=new myItinerary();
		
		scrollDownJavaExe(i.getTitle());
        
        String s=toGetAttribute(i.getOrderNum());
		System.out.println(s);
		excelUpdate("AdactinTC", "Sheet1", 9, 1,"order1",s) ;
		toClick(i.getMyItinry());
	
	
	}
	@Test
	public void tc2() throws Exception {
		
		AdactinLocation b=new AdactinLocation();
		
		toSelect(b.getPlace(),3 );
		toSelect(b.getHotel(),2);
		toSelect(b.getRoom(),2);
		toSelect(b.getRoomNo(),1);
		toInput(b.getCheckIn(),toReadCell("AdactinTC", "Sheet1", 2, 2));
		toInput(b.getCheckOut(),toReadCell("AdactinTC", "Sheet1", 3, 2));
		toSelect(b.getAdult(), 2);
		toSelect(b.getChild(), 1);
		toRobotTab();
		toRobotEnter();
	
		AdactInRadio c=new AdactInRadio();
		
		toClick(c.getRadio());
		toClick(c.getCont());
	
		AdactinAddress d=new AdactinAddress();
		
		toInput(d.getFirst(),toReadCell("AdactinTC", "Sheet1", 4, 2));
		toInput(d.getLast(),toReadCell("AdactinTC", "Sheet1", 5, 2));
		toInput(d.getAddr(),toReadCell("AdactinTC", "Sheet1", 6, 2));
		toInput(d.getCcNo(),toReadCell("AdactinTC", "Sheet1", 7, 2));
		toSelect(d.getCcType(), 2);
		toSelect(d.getExpMonth(), 2);
		toSelect(d.getExpYr(), 10);
		toInput(d.getCvv(),toReadCell("AdactinTC", "Sheet1", 8, 2));
		toClick(d.getBookNow());
		Thread.sleep(6000);
							
		myItinerary i=new myItinerary();
		
		scrollDownJavaExe(i.getTitle());
        
        String s=toGetAttribute(i.getOrderNum());
		System.out.println(s);
		excelUpdate("AdactinTC", "Sheet1", 9, 2,"order2",s) ;
		toClick(i.getMyItinry());
	}
	@Test
	public void tc3() throws Exception {
		
		AdactinLocation b=new AdactinLocation();
		
		toSelect(b.getPlace(),2 );
		toSelect(b.getHotel(),3);
		toSelect(b.getRoom(),2);
		toSelect(b.getRoomNo(),1);
		toInput(b.getCheckIn(),toReadCell("AdactinTC", "Sheet1", 2, 3));
		toInput(b.getCheckOut(),toReadCell("AdactinTC", "Sheet1", 3, 3));
		toSelect(b.getAdult(), 1);
		toSelect(b.getChild(), 1);
		toRobotTab();
		toRobotEnter();
	
		AdactInRadio c=new AdactInRadio();
		
		toClick(c.getRadio());
		toClick(c.getCont());
	
		AdactinAddress d=new AdactinAddress();
		
		toInput(d.getFirst(),toReadCell("AdactinTC", "Sheet1", 4, 3));
		toInput(d.getLast(),toReadCell("AdactinTC", "Sheet1", 5, 3));
		toInput(d.getAddr(),toReadCell("AdactinTC", "Sheet1", 6, 3));
		toInput(d.getCcNo(),toReadCell("AdactinTC", "Sheet1", 7, 3));
		toSelect(d.getCcType(), 1);
		toSelect(d.getExpMonth(), 2);
		toSelect(d.getExpYr(), 10);
		toInput(d.getCvv(),toReadCell("AdactinTC", "Sheet1", 8, 3));
		toClick(d.getBookNow());
		Thread.sleep(6000);
							
		myItinerary i=new myItinerary();
		
		scrollDownJavaExe(i.getTitle());
        
        String s=toGetAttribute(i.getOrderNum());
		System.out.println(s);
		excelUpdate("AdactinTC", "Sheet1", 9, 3,"order3",s) ;
		toClick(i.getMyItinry());
	}
	@Test
	public void tc4() throws Exception {
		
		AdactinLocation b=new AdactinLocation();
		
		toSelect(b.getPlace(),3 );
		toSelect(b.getHotel(),2);
		toSelect(b.getRoom(),2);
		toSelect(b.getRoomNo(),1);
		toInput(b.getCheckIn(),toReadCell("AdactinTC", "Sheet1", 2, 4));
		toInput(b.getCheckOut(),toReadCell("AdactinTC", "Sheet1", 3, 4));
		toSelect(b.getAdult(), 2);
		toSelect(b.getChild(), 1);
		toRobotTab();
		toRobotEnter();
	
		AdactInRadio c=new AdactInRadio();
		
		toClick(c.getRadio());
		toClick(c.getCont());
	
		AdactinAddress d=new AdactinAddress();
		
		toInput(d.getFirst(),toReadCell("AdactinTC", "Sheet1", 4, 4));
		toInput(d.getLast(),toReadCell("AdactinTC", "Sheet1", 5, 4));
		toInput(d.getAddr(),toReadCell("AdactinTC", "Sheet1", 6, 4));
		toInput(d.getCcNo(),toReadCell("AdactinTC", "Sheet1", 7, 4));
		toSelect(d.getCcType(), 2);
		toSelect(d.getExpMonth(), 6);
		toSelect(d.getExpYr(), 7);
		toInput(d.getCvv(),toReadCell("AdactinTC", "Sheet1", 8, 4));
		toClick(d.getBookNow());
		Thread.sleep(6000);
							
		myItinerary i=new myItinerary();
		
		scrollDownJavaExe(i.getTitle());
        
        String s=toGetAttribute(i.getOrderNum());
		System.out.println(s);
		excelUpdate("AdactinTC", "Sheet1", 9, 4,"order4",s) ;
		toClick(i.getMyItinry());
	}
	@Test
	public void tc5() throws Exception {
		
		AdactinLocation b=new AdactinLocation();
		
		toSelect(b.getPlace(),5);
		toSelect(b.getHotel(),2);
		toSelect(b.getRoom(),2);
		toSelect(b.getRoomNo(),1);
		toInput(b.getCheckIn(),toReadCell("AdactinTC", "Sheet1", 2, 5));
		toInput(b.getCheckOut(),toReadCell("AdactinTC", "Sheet1", 3, 5));
		toSelect(b.getAdult(), 2);
		toSelect(b.getChild(), 3);
		toRobotTab();
		toRobotEnter();
	
		AdactInRadio c=new AdactInRadio();
		
		toClick(c.getRadio());
		toClick(c.getCont());
	
		AdactinAddress d=new AdactinAddress();
		
		toInput(d.getFirst(),toReadCell("AdactinTC", "Sheet1", 4, 5));
		toInput(d.getLast(),toReadCell("AdactinTC", "Sheet1", 5, 5));
		toInput(d.getAddr(),toReadCell("AdactinTC", "Sheet1", 6, 5));
		toInput(d.getCcNo(),toReadCell("AdactinTC", "Sheet1", 7, 5));
		toSelect(d.getCcType(), 2);
		toSelect(d.getExpMonth(), 2);
		toSelect(d.getExpYr(), 10);
		toInput(d.getCvv(),toReadCell("AdactinTC", "Sheet1", 8, 5));
		toClick(d.getBookNow());
		Thread.sleep(6000);
							
		myItinerary i=new myItinerary();
		
		scrollDownJavaExe(i.getTitle());
        
        String s=toGetAttribute(i.getOrderNum());
		System.out.println(s);
		excelUpdate("AdactinTC", "Sheet1", 9, 5,"order5",s) ;
		toClick(i.getMyItinry());
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

