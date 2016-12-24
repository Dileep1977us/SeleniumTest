package com.comcast.orderlab.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.comcast.orderlab.common.pages.CustomerInfo;
import com.comcast.orderlab.common.pages.Install;
import com.comcast.orderlab.common.pages.OrderLabTestCore;
import com.comcast.orderlab.common.pages.Payment;
import com.comcast.orderlab.common.pages.SearchAddress;
import com.comcast.orderlab.common.pages.Submit;
import com.comcast.orderlab.dataflow.pages.SelectDataOffers;
import com.comcast.orderlab.dataflow.pages.SelectDataPlan;
import com.comcast.orderlab.dataflow.pages.SelectEquipement;
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

	public static void main(String Address,String Apt,String Zip,String salutation,String firstname,String lastname	,String phone,String dob,String email,String ssn,String pwd,String answer,String card,String exp,String	year,String cvv) throws InterruptedException 
	
	{
		
		SearchAddress addressSearch = PageFactory.initElements(driver, SearchAddress.class);
		SelectDataPlan dataplan =addressSearch.searchAddress(Address, Apt, Zip);
		SelectDataOffers dataOffer = dataplan.selectDataOnlyPlan();
		SelectEquipement Eqp = dataOffer.X1Exconomy();
		CustomerInfo CI =Eqp.selectPurchasedEquipment();
		Install Install =CI.customerInfo(salutation, firstname, lastname, phone, dob, email, ssn, pwd, answer, card, exp, year, cvv);
		Payment MakePayment = Install.selectPro();
		Submit OrderSubmit = MakePayment.ccPayemnt(firstname, lastname, card, exp, year, cvv);
		OrderSubmit.submitOrder();
		
	}
	
	@DataProvider
	
	public Object [][] getData(){
	
	return testExcel.getData("CreateDataOnlyAccounts");//Sheet Name of the test case

	}
}
