package org.sample;


import org.base.BaseParent;

public class ExcelReadAllChild extends BaseParent {

	public static void main(String[] args) throws Exception {
		
/*      excelReadAllDatas("TestData","Data");
		excelReadAllDatas("Book1","Sheet1");
		String value= toReadCell("Book1","Sheet1",0,1);
		System.out.println("\n"+value);          
		excelWrite("store", 0, 0, "Java");
		System.out.println("Done");       */            
		
		excelUpdate("store", "Data", 0, 0, "Java", "Python");
        System.out.println("updated");
	}    
		
}
