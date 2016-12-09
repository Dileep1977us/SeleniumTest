package com.comcast.orderlab.dataflow.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SelectDataOffers {

	WebDriver driver;

	public SelectDataOffers(WebDriver driver) {
		this.driver = driver; }


	
	public SelectDataAddOn selectDataOffers()
	
	{
		
		return PageFactory.initElements(driver, SelectDataAddOn.class);
		
	}
	
}
