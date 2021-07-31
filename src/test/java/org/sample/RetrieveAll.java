package org.sample;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class RetrieveAll {

	public static void main(String[] args) throws IOException  {

		File f = new File("C:\\Users\\HP\\eclipse-workspace\\MavenPjt\\TestDataFiles\\TestData.xlsx");
		FileInputStream input = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(input);
		Sheet s = w.getSheet("Data");

		int numberOfRows = s.getPhysicalNumberOfRows();
			for (int i = 0; i < numberOfRows; i++) {
			Row r = s.getRow(i);
			
			int numberOfCells = r.getPhysicalNumberOfCells();
				for (int j = 0; j < numberOfCells; j++) {
				Cell c = r.getCell(j);
				System.out.println(c.getStringCellValue());
			}
			
		}

	}

}



