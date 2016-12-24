package com.comcast.orderlab.dataflow.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcast.orderlab.common.pages.CustomerInfo;
import com.comcast.orderlab.config.Configurations;

public class SelectEquipement {

	WebDriver driver;

	public SelectEquipement(WebDriver driver) {
		this.driver = driver; }

	@FindBy(xpath=Configurations.LeaseModemRad)
	public WebElement LeaseModemRad;
	
	@FindBy(xpath=Configurations.OwnedModemRad)
	public WebElement OwnedModemRad;
	
	@FindBy(xpath=Configurations.DeviceNext)
	public WebElement DeviceNext;
	
	
	
	public CustomerInfo selectLeaseEquipment()
	
	{
		LeaseModemRad.click();
		DeviceNext.click();
		return PageFactory.initElements(driver, CustomerInfo.class);
		
	}
	public CustomerInfo selectPurchasedEquipment()
	
	{
		
		OwnedModemRad.click();
		DeviceNext.click();
		return PageFactory.initElements(driver, CustomerInfo.class);
		
	}
	
	
	
}
