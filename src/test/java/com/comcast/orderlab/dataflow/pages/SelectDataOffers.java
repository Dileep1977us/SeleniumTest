package com.comcast.orderlab.dataflow.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcast.orderlab.config.Configurations;

public class SelectDataOffers {

	WebDriver driver;

	public SelectDataOffers(WebDriver driver) {
		this.driver = driver; }
	
	@FindBy(xpath=Configurations.X1ExconomyPlus)
	public WebElement X1ExconomyPlus;
	
	@FindBy(xpath=Configurations.Extreme105Internet)
	public WebElement Extreme105Internet;


	
	public SelectEquipement X1Exconomy()
	
	{
		X1ExconomyPlus.click();
		return PageFactory.initElements(driver, SelectEquipement.class);
		
	}
	
	public SelectEquipement Extreme()
	
	{
		Extreme105Internet.click();
		return PageFactory.initElements(driver, SelectEquipement.class);
		
	}
	
}
