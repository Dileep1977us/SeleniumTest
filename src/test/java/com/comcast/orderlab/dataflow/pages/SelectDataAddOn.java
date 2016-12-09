package com.comcast.orderlab.dataflow.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SelectDataAddOn {
	
	WebDriver driver;

	public SelectDataAddOn(WebDriver driver) {
		this.driver = driver; }


	
	public SelectEquipement selectAddOn()
	
	{
		
		return PageFactory.initElements(driver, SelectEquipement.class);
		
	}
	
}