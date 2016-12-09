package com.comcast.orderlab.common.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.comcast.orderlab.config.Configurations;
import com.comcast.orderlab.util.testExcel;


public class LoginPage   {
	
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver; }

	
	@FindBy(xpath=Configurations.username)
	public WebElement username;
	
	@FindBy(xpath=Configurations.password)
	public WebElement password;
	
	@FindBy(xpath=Configurations.signin)
	public WebElement signin;
	
	@FindBy(xpath=Configurations.errorMsg)
	public WebElement errorMsg;
	


	
	public SearchAddress doLogin(String UserName, String Password)
	{
		//WebDriverWait wait = new WebDriverWait(driver, 10000);
       
		
		username.sendKeys(UserName);
		password.sendKeys(Password);
		signin.click();
		
		boolean erroPresent= false;
		try
		{
		    WebElement error = errorMsg;
		    erroPresent = error.isDisplayed();		
		}
		catch (Exception ex) {
			erroPresent= false;
		}
		System.out.println(erroPresent);
	
		Assert.assertFalse(erroPresent);

		return PageFactory.initElements(driver, SearchAddress.class);
		
		//System.out.println(Title1);
		

	}



}
