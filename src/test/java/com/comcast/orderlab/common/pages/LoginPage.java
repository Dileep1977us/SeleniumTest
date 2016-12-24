package com.comcast.orderlab.common.pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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
	


	
	public SearchAddress doLogin(String UserName, String Password) throws IOException
	{
		//WebDriverWait wait = new WebDriverWait(driver, 10000);
       
		
		username.sendKeys(UserName);
		password.sendKeys(Password);
		signin.click();
		
		/*
		
		boolean erroPresent= false;
		try
		{
			String error = errorMsg.getText();
			System.out.println(error);
			erroPresent= true;
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File("c:\\Invalid Login.jpg"));		
		}
		catch (Exception ex) {
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File("c:\\capturescreen2.jpg"));
		}
		System.out.println(erroPresent);
		//System.out.println(error);
	
		Assert.assertFalse(erroPresent);*/
		
		

		return PageFactory.initElements(driver, SearchAddress.class);
		
		//System.out.println(Title1);
		

	}



}
