package org.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseParent {

	public static WebDriver driver;
	public static Actions a;
	public static Robot r;
	public static Alert al;
	public static Select s;
	public static JavascriptExecutor js;

	// browserLaunch, urlLaunch, maximize
	// getUrl, getTitle, sendKeys, click, quit
	// actions dragAndDrop, doubleClick
	// robot

	public static void chromeBrowserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	public static void ieBrowserLaunch() {
		WebDriverManager.iedriver().setup();
		driver = new ChromeDriver();
	}
	public static void firefoxBrowserLaunch() {
		WebDriverManager.firefoxdriver().setup();
		driver = new ChromeDriver();
	}

	public static void launchUrl(String url) {
		driver.get(url);
	}

	public static void toMaximize() {
		driver.manage().window().maximize();
	}

	public static String toGetUrl() {
		String url = driver.getCurrentUrl();
		return url;
	}

	public static String toGetTitle() {
		String url = driver.getTitle();
		return url;
	}

	public static void toInput(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void toClick(WebElement element) {
		element.click();
	}

	public static void toQuit() {
		driver.quit();
	}

	public static void toDragAndDrop(WebElement source, WebElement target) {
		a = new Actions(driver);
		a.dragAndDrop(source, target).perform();
	}

	public static void toDoubleClick(WebElement target) {
		a = new Actions(driver);
		a.doubleClick(target).perform();
	}

	public static void toContextClick(WebElement target) {
		a = new Actions(driver);
		a.contextClick(target).perform();
	}

	public static void getsnap(String fileName) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\\\Users\\\\HP\\\\eclipse-workspace\\\\Selenium\\\\dset\\" + fileName + ".png");
		FileUtils.copyFile(src, dest);
	}

	public static String toGetAttribute(WebElement element) {
		String value = element.getAttribute("value");
		return value;
	}

	public static String excelRead(String fileName, String sheetName, int rowNo, int cellNo) throws IOException {
		File f = new File("C:\\Users\\HP\\eclipse-workspace\\MavenPjt\\TestDataFiles\\" + fileName + ".xlsx");
		FileInputStream input = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(input);
		Sheet s = w.getSheet(sheetName);
		Row r = s.getRow(rowNo);
		Cell c = r.getCell(cellNo);
		String value = c.getStringCellValue();
		return value;
	}

	public static void excelReadAllDatas(String fileName, String sheetName) throws IOException {
		File f = new File("C:\\Users\\HP\\eclipse-workspace\\MavenPjt\\TestDataFiles\\" + fileName + ".xlsx");
		FileInputStream input = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(input);
		Sheet s = w.getSheet(sheetName);

		int numberOfRows = s.getPhysicalNumberOfRows();
		for (int i = 0; i < numberOfRows; i++) {
			Row r = s.getRow(i);

			int numberOfCells = r.getPhysicalNumberOfCells();
			for (int j = 0; j < numberOfCells; j++) {
				Cell c = r.getCell(j);
				int cellType = c.getCellType();
				String value; // instance declaration
				if (cellType == 1) {
					value = c.getStringCellValue();
				} else if (DateUtil.isCellDateFormatted(c)) {
					Date d = c.getDateCellValue();
					SimpleDateFormat sim = new SimpleDateFormat("dd/MM/yyyy");
					value = sim.format(d);
				} else {
					double d = c.getNumericCellValue();
					long l = (long) d;
					value = String.valueOf(l);
				}
				System.out.println(value);
			}
		}
	}

	public static String toReadCell(String fileName, String sheetName, int rowNo, int cellNo) throws IOException {
		File f = new File("C:\\Users\\HP\\eclipse-workspace\\MavenPjt\\TestDataFiles\\" + fileName + ".xlsx");
		FileInputStream input = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(input);
		Sheet s = w.getSheet(sheetName);
		Row r = s.getRow(rowNo);
		Cell c = r.getCell(cellNo);
		int cellType = c.getCellType();
		String value; // instance declaration
		if (cellType == 1) {
			value = c.getStringCellValue();
		} else if (DateUtil.isCellDateFormatted(c)) {
			Date d = c.getDateCellValue();
			SimpleDateFormat sim = new SimpleDateFormat("dd/MM/yyyy");
			value = sim.format(d);
		} else {
			double d = c.getNumericCellValue();
			long l = (long) d;
			value = String.valueOf(l);
		}
		return value;
	}

	public static void excelWrite(String fileName, int rowNo, int cellNo, String value) throws IOException {
		File f = new File("C:\\Users\\HP\\eclipse-workspace\\MavenPjt\\TestDataFiles\\" + fileName + ".xlsx");
		Workbook w = new XSSFWorkbook();
		Sheet s = w.createSheet();
		Row r = s.createRow(rowNo);
		Cell c = r.createCell(cellNo);
		c.setCellValue("Java");
		FileOutputStream output = new FileOutputStream(f);
		w.write(output);
	}

	public static void excelUpdate(String fileName, String sheetName, int rowNo, int cellNo, String oldValue,
			String newValue) throws IOException {
		File f = new File("C:\\Users\\HP\\eclipse-workspace\\MavenPjt\\TestDataFiles\\" + fileName + ".xlsx");
		FileInputStream input = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(input);
		Sheet s = w.getSheet(sheetName);
		Row r = s.getRow(rowNo);
		Cell c = r.getCell(cellNo);
		String value = c.getStringCellValue();
		if (value.contains(oldValue)) {
			c.setCellValue(newValue);
		}
		FileOutputStream output = new FileOutputStream(f);
		w.write(output);
	}
	
	
	public static void toswitchWindow() {
		String parentId = driver.getWindowHandle();
		System.out.println(parentId);
		Set<String> allWindowsId = driver.getWindowHandles();
		System.out.println(allWindowsId);
		for (String eachId : allWindowsId) {
			if (!eachId.equals(parentId)) {
				driver.switchTo().window(eachId);
			}
		}
	}

	public static void toAnyWindow(int num) {
		String parentId = driver.getWindowHandle();
		System.out.println(parentId);
		Set<String> allWindowsId = driver.getWindowHandles();
		System.out.println(allWindowsId);
		int count = 0;
		for (String eachId : allWindowsId) {
			if (count == num) {
				driver.switchTo().window(eachId);
			}
			count++;
		}
	}

	public static void toSelect(WebElement element, int num) {
		s = new Select(element);
		s.selectByIndex(num);
	}

	public static void toRobotEnter() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	public static void toRobotTab() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
	}

	public static void sendInJavaExe(String value1, WebElement element) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value'," + value1 + ")", element);
		// value1 in single quote
	}
	public static void clickInJavaExe(WebElement element) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
	}
	public static void scrollDownJavaExe(WebElement element) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}	
	public static void scrollUpJavaExe(WebElement element) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)", element);
	}	
	public static String getValueJavaExe(WebElement element) {
		js = (JavascriptExecutor) driver;
		Object o=js.executeScript("return arguments[0].getAttribute('value')", element);
	    String s=(String)o;
		System.out.println(s);
		return s;
	}	
	public static void toAlertInput(String value) {
	al=driver.switchTo().alert();
	al.sendKeys(value);
}
}