package com.comcast.orderlab.dataflow.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.comcast.orderlab.config.Configurations;

public class SelectDataPlan {


	WebDriver driver;

	public SelectDataPlan(WebDriver driver) {
		this.driver = driver; }


	@FindBy(xpath=Configurations.selectVoice)
	public WebElement selectVoice;
	
	@FindBy(xpath=Configurations.selectVideo)
	public WebElement selectVideo;
	
	@FindBy(xpath=Configurations.ShowOffers)
	public WebElement ShowOffers;
	
	@FindBy(xpath=Configurations.selectData)
	public WebElement selectData;
	
		
	public SelectDataOffers selectDataOnlyPlan()
	
	{
		WebDriverWait wait = new WebDriverWait(driver,10000);
		wait.until(ExpectedConditions.elementToBeClickable(ShowOffers));
				
				
		WebElement Voice =  selectVoice;
		Voice.click();
		
		WebElement Video =  selectVideo;
		Video.click();	

		ShowOffers.click();
		
		return PageFactory.initElements(driver, SelectDataOffers.class);
		
	}
	
	public SelectDataOffers selectVoiceOnlyPlan()
	
	{
		WebDriverWait wait = new WebDriverWait(driver,10000);
		wait.until(ExpectedConditions.elementToBeClickable(ShowOffers));
				
				
		WebElement Data =  selectData;
		Data.click();
		
		WebElement Video =  selectVideo;
		Video.click();	

		ShowOffers.click();
		
		return PageFactory.initElements(driver, SelectDataOffers.class);
		
	}
	
	public SelectDataOffers selectVideoOnlyPlan()
	
	{
		WebDriverWait wait = new WebDriverWait(driver,10000);
		wait.until(ExpectedConditions.elementToBeClickable(ShowOffers));
				
				
		WebElement Voice =  selectVoice;
		Voice.click();
		
		WebElement Data =  selectData;
		Data.click();	

		ShowOffers.click();
		
		return PageFactory.initElements(driver, SelectDataOffers.class);
		
	}
	
}
