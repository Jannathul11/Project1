package org.sample;

import java.awt.AWTException;


import org.base.BaseParent;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.pojo.myItinerary;

public class HotelBooking extends BaseParent {

	public static String val;
	
	public static void main(String[] args) throws AWTException, Exception {
		chromeBrowserLaunch();
		launchUrl("http://adactinhotelapp.com/HotelAppBuild2/");
		toMaximize();
		WebElement txtUser= driver.findElement(By.id("username"));
		toInput(txtUser, "ArshiYas");
		WebElement txtPass = driver.findElement(By.xpath("//input[@type='password']"));
		toInput(txtPass, "hello@123");
		WebElement logIn = driver.findElement(By.id("login"));
		toClick(logIn);
		
		WebElement place= driver.findElement(By.id("location"));
		toSelect(place, 4);
		WebElement hotel= driver.findElement(By.id("hotels"));
		toSelect(hotel, 1);
		WebElement room= driver.findElement(By.id("room_type"));
		toSelect(room, 1);
		WebElement roomNo= driver.findElement(By.id("room_nos"));
		toSelect(roomNo, 1);
		
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement checkIn= driver.findElement(By.id("datepick_in"));
		js.executeScript("arguments[0].setAttribute('value','29/05/2021')",checkIn)	;	
		
		WebElement checkOut= driver.findElement(By.id("datepick_out"));
		js.executeScript("arguments[0].setAttribute('value','30/05/2021')",checkOut);	
	 	
     	
     	WebElement adult= driver.findElement(By.id("adult_room"));
		toSelect(adult, 2);
		WebElement child= driver.findElement(By.id("child_room"));
		toSelect(child, 2);
		toRobotTab();
		toRobotEnter();
		
		WebElement radio= driver.findElement(By.id("radiobutton_0"));
		toClick(radio);
		WebElement cont = driver.findElement(By.id("continue"));
		toClick(cont);    

		WebElement firstNa= driver.findElement(By.id("first_name"));
		toInput(firstNa,"Arshi");
		WebElement lastNa= driver.findElement(By.id("last_name"));
		toInput(lastNa,"Ibrahim");
		WebElement address = driver.findElement(By.id("address"));
		toInput(address, "No:8, 3rd street, Jothi Nagar, Chennai-600059");
		WebElement cardNo = driver.findElement(By.id("cc_num"));
		toInput(cardNo, "7867890095432178");
		WebElement cardType= driver.findElement(By.id("cc_type"));
		toSelect(cardType, 2);
		WebElement expMonth= driver.findElement(By.id("cc_exp_month"));
		toSelect(expMonth, 2);
		WebElement expYear= driver.findElement(By.id("cc_exp_year"));
		toSelect(expYear, 11);
		WebElement cvv= driver.findElement(By.id("cc_cvv"));
		toInput(cvv,"321");
		toRobotTab();
		toRobotEnter();
		
		Thread.sleep(5000);
		WebElement down = driver.findElement(By.id("hotel_name"));
		scrollDownJavaExe(down);
		
		myItinerary i=new myItinerary();
		String s=toGetAttribute(i.getOrderNum());
		System.out.println(s);
		
		
		WebElement lastbtn = driver.findElement(By.id("my_itinerary"));
		toClick(lastbtn);
		
		excelUpdate("Adactin", "Sheet1", 9, 1,"empty",s) ;
			
		
}	

}
		
		
		
		
		
	

	

