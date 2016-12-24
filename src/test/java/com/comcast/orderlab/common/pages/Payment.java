package com.comcast.orderlab.common.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.comcast.orderlab.config.Configurations;

public class Payment {
	
	WebDriver driver;

	public Payment(WebDriver driver) {
		this.driver = driver; }
	
	@FindBy(xpath=Configurations.PaymentInformation)
	public WebElement PaymentInformation;
	
	@FindBy(xpath=Configurations.SetupPayment)
	public WebElement SetupPayment;
	
	@FindBy(xpath=Configurations.CardNumber)
	public WebElement CardNumber;
	
	@FindBy(xpath=Configurations.ExpMonth)
	public WebElement ExpMonth;
	
	@FindBy(xpath=Configurations.ExpYear)
	public WebElement ExpYear;
	
	@FindBy(xpath=Configurations.Cvv)
	public WebElement Cvv;
	
	@FindBy(xpath=Configurations.CardFirst)
	public WebElement CardFirst;
	
	@FindBy(xpath=Configurations.CardLast)
	public WebElement CardLast;
	
	@FindBy(xpath=Configurations.PaymentNext)
	public WebElement PaymentNext;
	
	
	public Submit ccPayemnt(String firstname,String lastname, String card,String exp,String	year,String cvv)
	{
		
		SetupPayment.click();
		CardNumber.sendKeys(card);
		CardNumber.sendKeys(Keys.TAB);
		
		ExpMonth.sendKeys(exp);
		ExpMonth.sendKeys(Keys.TAB);
		
		ExpYear.sendKeys(year);
		ExpYear.sendKeys(Keys.TAB);
		
		Cvv.sendKeys(cvv);
		Cvv.sendKeys(Keys.TAB);
		
		CardFirst.sendKeys(firstname);
		CardFirst.sendKeys(Keys.TAB);
		
		CardLast.sendKeys(lastname);
		CardLast.sendKeys(Keys.TAB);
		
		PaymentNext.click();
		
		return PageFactory.initElements(driver, Submit.class);
		
		
	}
	

}
