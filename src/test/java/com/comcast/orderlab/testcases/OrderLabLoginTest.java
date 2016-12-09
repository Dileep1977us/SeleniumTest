package com.comcast.orderlab.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.comcast.orderlab.common.pages.LoginPage;
import com.comcast.orderlab.common.pages.OrderLabTestCore;
import com.comcast.orderlab.util.testExcel;


public class OrderLabLoginTest extends OrderLabTestCore {

	@BeforeTest
	public void isSkip()
	
	{
		if
		( ! testExcel.isExecutable("OrderLabLoginTest"))//tc id from test suite
		{
		 throw new SkipException("Skipping the Test Case");
		}
		
	}
	
	@Test(dataProvider = "getData")

	public static void main(String UserName, String Password) throws InterruptedException {
		// TODO Auto-generated method stub

	LoginPage loginOrderlab = PageFactory.initElements(driver, LoginPage.class);
	loginOrderlab.doLogin(UserName, Password);
		

	}
	
	@DataProvider
	
	public Object [][] getData(){
	
	return testExcel.getData("OrderLabLoginTest");//Sheet Name of the test case

	}
}
