package com.comcast.orderlab.common.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.comcast.orderlab.config.Configurations;

public class Submit {
	
	WebDriver driver;

	public Submit(WebDriver driver) {
		this.driver = driver; }
	
	@FindBy(xpath=Configurations.RecPayment)
	public WebElement RecPayment;
	
	@FindBy(xpath=Configurations.Ecobil)
	public WebElement Ecobil;
	
	@FindBy(xpath=Configurations.SubmitOrder)
	public WebElement SubmitOrder;
	
	
	public void submitOrder()
	{
		WebElement Recurring = RecPayment;
		Recurring.click();
		
		WebElement Eco = Ecobil;
		Eco.click();
		SubmitOrder.click();
	}
	
	
	
	

}
