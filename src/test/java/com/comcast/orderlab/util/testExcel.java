
package com.comcast.orderlab.util;

import com.comcast.orderlab.common.pages.OrderLabTestCore;

public class testExcel extends OrderLabTestCore{

	public static Xls_Reader excel = new Xls_Reader(System.getProperty("user.dir")+"\\src\\test\\java\\com\\comcast\\orderlab\\testdata\\testdata.xlsx"); 
	public static boolean isExecutable(String tcid)
	{
		
		for(int rowNum=2;rowNum<=excel.getRowCount("TestCases");rowNum++)
		{
			if(excel.getCellData("TestCases", "Tcid", rowNum).equals(tcid))
			  {
				if(excel.getCellData("TestCases", "Runmode", rowNum).equalsIgnoreCase("Y"))
					{
							return true;
					}
				
				else
	
					{
							return false;
					}
			  }
			
					
		}
		return false;
	}
	
public static Object[][] getData(String sheetName){
		
		int rows = excel.getRowCount(sheetName);
		int cols= excel.getColumnCount(sheetName);
		
		Object[][] data = new Object[rows-1][cols];
		
		for(int rowNum = 2 ; rowNum <= rows ; rowNum++){ //2
			
			
			
			for(int colNum=0 ; colNum< cols; colNum++){
				data[rowNum-2][colNum]=excel.getCellData(sheetName, colNum, rowNum); //-2
			}
		}
		
		return data;
	}
}