package com.comcast.orderlab.common.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.comcast.orderlab.config.Configurations;
import com.comcast.orderlab.dataflow.pages.SelectDataOffers;
import com.comcast.orderlab.dataflow.pages.SelectDataPlan;

public class SearchAddress {

	WebDriver driver;

	public SearchAddress(WebDriver driver) {
		this.driver = driver; }

	@FindBy(xpath=Configurations.start)
	public WebElement start;
	
	@FindBy(xpath=Configurations.confirm)
	public WebElement confirm;
	
	@FindBy(xpath=Configurations.stAddress)
	public WebElement stAddress;
	
	@FindBy(xpath=Configurations.apt)
	public WebElement apt;
	
	@FindBy(xpath=Configurations.zip)
	public WebElement zip;
	
	@FindBy(xpath=Configurations.searchInput)
	public WebElement searchInput;
	
	@FindBy(xpath=Configurations.menu)
	public WebElement menu;
	
	@FindBy(xpath=Configurations.signOut)
	public WebElement signOut;
	
	@FindBy(xpath=Configurations.selectNC)
	public WebElement selectNC;
	
	@FindBy(xpath=Configurations.dealFinder)
	public WebElement dealFinder;
	
	
	
	
	public SelectDataPlan searchAddress(String StAddress, String Apt,String Zip,String Salutation,String FirstName,
			String LastName,String Phone,String DOB,String Email,
			String Ssn,String Pwd,String RecoveryAnswer,String CardNumb,String ExpMon,String ExpYear,String Cvv) throws InterruptedException
	{
		//Start New Order
		WebDriverWait wait = new WebDriverWait(driver,10000);
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(start));
		start.click();
		wait.until(ExpectedConditions.elementToBeClickable(confirm));
		confirm.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		stAddress.sendKeys(StAddress);
		apt.sendKeys(Apt);
		zip.sendKeys(Zip);
		wait.until(ExpectedConditions.elementToBeClickable(searchInput));
		searchInput.click();
		wait.until(ExpectedConditions.elementToBeClickable(selectNC));
		selectNC.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		

		boolean present= false;
		try
		{
		    WebElement lead = dealFinder;
		    present = lead.isDisplayed();		
		}
		catch (Exception ex) {
             present= false;
		}
		System.out.println(present);
		
		if(present)
		{
			dealFinder.click();
		}
		
		return PageFactory.initElements(driver, SelectDataPlan.class);
	}
}
