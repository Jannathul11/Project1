package org.sample;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class RetrieveIncldgInt {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\HP\\eclipse-workspace\\MavenPjt\\TestDataFiles\\Book1.xlsx");
		FileInputStream input = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(input);
		Sheet s = w.getSheet("Sheet1");

		int numberOfRows = s.getPhysicalNumberOfRows();
			for (int i = 0; i < numberOfRows; i++) {
			Row r = s.getRow(i);
			
			int numberOfCells = r.getPhysicalNumberOfCells();
				for (int j = 0; j < numberOfCells; j++) {
				Cell c = r.getCell(j);
				int cellType = c.getCellType();
				String value; //instance decl
				if(cellType==1) {
					value=c.getStringCellValue();
				}
				else if(DateUtil.isCellDateFormatted(c)) {
					Date d = c.getDateCellValue();
					SimpleDateFormat sim=new SimpleDateFormat("dd/MM/yyyy");
					value =sim.format(d);
				}
				else {
					double d=c.getNumericCellValue();
					long l=(long) d;
					value=String.valueOf(l);
				}
					System.out.println(value);
							
					
				
}

}
}
}