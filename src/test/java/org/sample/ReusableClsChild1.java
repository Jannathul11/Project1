package org.sample;

import org.base.BaseParent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ReusableClsChild1 extends BaseParent {

	public static void main(String[] args) {
		
		chromeBrowserLaunch();
		launchUrl("http://demo.automationtesting.in/Alerts.html");
		toMaximize();
		WebElement simple= driver.findElement(By.xpath("//a[text()='Alert with OK ']"));
		toClick(simple);
		

	}

}
