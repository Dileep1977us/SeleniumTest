package com.comcast.orderlab.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.comcast.orderlab.common.pages.LoginPage;
import com.comcast.orderlab.common.pages.OrderLabTestCore;
import com.comcast.orderlab.common.pages.SearchAddress;
import com.comcast.orderlab.dataflow.pages.SelectDataPlan;
import com.comcast.orderlab.util.testExcel;


public class CreateDataOnlyAccounts extends OrderLabTestCore {

	@BeforeTest
	public void isSkip()
	
	{
		if
		( ! testExcel.isExecutable("CreateDataOnlyAccounts"))//tc id from test suite
		{
		 throw new SkipException("Skipping the Test Case");
		}
		
	}
	
	@Test(dataProvider = "getData")

	public static void main(String StAddress, String Apt,String Zip,String Salutation,String FirstName,
			String LastName,String Phone,String DOB,String Email,
			String Ssn,String Pwd,String RecoveryAnswer,String CardNumb,String ExpMon,String ExpYear,String Cvv) throws InterruptedException {
		// TODO Auto-generated method stub
		
		SearchAddress addressSearch = PageFactory.initElements(driver, SearchAddress.class);
		SelectDataPlan dataplan =addressSearch.searchAddress(StAddress, Apt, Zip, Salutation, FirstName, LastName, Phone, DOB, Email, Ssn, Pwd, RecoveryAnswer, CardNumb, ExpMon, ExpYear, Cvv);
		dataplan.selectDataPlan();
	}
	
	@DataProvider
	
	public Object [][] getData(){
	
	return testExcel.getData("CreateDataOnlyAccounts");//Sheet Name of the test case

	}
}
