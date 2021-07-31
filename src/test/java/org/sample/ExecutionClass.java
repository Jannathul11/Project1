package org.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExecutionClass {

	public static void main(String[] args) {
		
		//configure browser
		WebDriverManager.chromedriver().setup();
		
		//instanciate
		WebDriver driver=new ChromeDriver();
		
		//launch
		driver.get("https://www.facebook.com/");

	}

}
