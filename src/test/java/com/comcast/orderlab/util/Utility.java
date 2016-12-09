package com.comcast.orderlab.util;

public class Utility {

	
	public boolean isExecutable(String Tcid, Xls_Reader xls)
	{
		String sheetName = "testcases";
		for(int rowNum=2;rowNum<=xls.getRowCount(sheetName);rowNum++){
		//System.out.println(xls.getCellData(sheetName, "Tcid", rowNum));
		
			if(xls.getCellData(sheetName, "test_name", rowNum).equalsIgnoreCase(Tcid))	
			{
				if(xls.getCellData(sheetName, "Runmode", rowNum).equalsIgnoreCase("Y"))	
					
					return true;
					else
					return false;
					//System.out.println(xls.getCellData(sheetName, "Tcid", rowNum));
					
					}
		
		}
		
		return false;
	}
}
