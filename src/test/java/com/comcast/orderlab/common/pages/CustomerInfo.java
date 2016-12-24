package com.comcast.orderlab.common.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.comcast.orderlab.config.Configurations;

public class CustomerInfo {

	WebDriver driver;

	public CustomerInfo(WebDriver driver) {
		this.driver = driver; }
	
	@FindBy(xpath=Configurations.SalutationActual)
	public WebElement SalutationActual;
	
	//@FindBy(xpath=Configurations.Salutation)
	//public WebElement Salutation;
	
	@FindBy(xpath=Configurations.FirstName)
	public WebElement FirstName;
	
	@FindBy(xpath=Configurations.LastName)
	public WebElement LastName;
	
	@FindBy(xpath=Configurations.Phone)
	public WebElement Phone;
	
	@FindBy(xpath=Configurations.Month)
	public WebElement Month;
	
	@FindBy(xpath=Configurations.Day)
	public WebElement Day;
	
	@FindBy(xpath=Configurations.Year)
	public WebElement Year;
	
	@FindBy(xpath=Configurations.Email)
	public WebElement Email;
	
	@FindBy(xpath=Configurations.Ssn1)
	public WebElement Ssn1;
	
	@FindBy(xpath=Configurations.Ssn2)
	public WebElement Ssn2;
	
	@FindBy(xpath=Configurations.Ssn3)
	public WebElement Ssn3;
	
	@FindBy(xpath=Configurations.Email1)
	public WebElement Email1;
	
	@FindBy(xpath=Configurations.ChkEmail)
	public WebElement ChkEmail;
	
	@FindBy(xpath=Configurations.Pwd1)
	public WebElement Pwd1;
	
	@FindBy(xpath=Configurations.Pwd2)
	public WebElement Pwd2;
	
	@FindBy(xpath=Configurations.RecoveryQuestion)
	public WebElement RecoveryQuestion;
	
	@FindBy(xpath=Configurations.Drink)
	public WebElement Drink;
	
	@FindBy(xpath=Configurations.Ques)
	public WebElement Ques;
	
	@FindBy(xpath=Configurations.RecoveryAnswer)
	public WebElement RecoveryAnswer;
	
	@FindBy(xpath=Configurations.ContinueSecurely)
	public WebElement ContinueSecurely;
	
	@FindBy(xpath=Configurations.EmailSuccess)
	public By EmailSuccess;
	
	@FindBy(xpath=Configurations.stAddress)
	public WebElement stAddress;
	
	public Install customerInfo(String salutation,String firstname,String lastname	,String phone,String dob,String email,String ssn,String pwd,String answer,String card,String exp,String	year,String cvv) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver,10000);
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(ChkEmail));
		SalutationActual.click();
		for(int count=0;count<3;count++)
		{
			int pos=count+1;
			String objElementXpath=Configurations.Salutation.replace("{count}",Integer.toString(pos));
			WebElement we=driver.findElement(By.xpath(objElementXpath));
			
			String strText=we.getAttribute("rel");
			if(strText.equals(salutation))
			{
				we.click();						
				break;
			}
			
			
		}
		
		FirstName.sendKeys(firstname);
		FirstName.sendKeys(Keys.TAB);
		LastName.sendKeys(lastname);
		LastName.sendKeys(Keys.TAB);
		Phone.sendKeys(phone);
		Phone.sendKeys(Keys.TAB);
		Month.sendKeys(dob.substring(0,2));
		Month.sendKeys(Keys.TAB);
		Day.sendKeys(dob.substring(2,4));
		Day.sendKeys(Keys.TAB);
		Year.sendKeys(dob.substring(4,8));
		Year.sendKeys(Keys.TAB);
		Email.sendKeys(email);
		Email.sendKeys(Keys.TAB);
		Ssn1.sendKeys(ssn.substring(0,3));
		Ssn1.sendKeys(Keys.TAB);
		Ssn2.sendKeys(ssn.substring(3,5));
		Ssn2.sendKeys(Keys.TAB);
		Ssn3.sendKeys(ssn.substring(5,9));
		Ssn3.sendKeys(Keys.TAB);
		wait.until(ExpectedConditions.elementToBeClickable(ChkEmail));
		ChkEmail.click();
		Pwd1.sendKeys(pwd);
		Pwd2.sendKeys(pwd);
		RecoveryQuestion.click();
		WebElement Que=Ques;
		Que.click();
		RecoveryAnswer.click();
		RecoveryAnswer.sendKeys(answer);
		RecoveryAnswer.sendKeys(Keys.TAB);
		ContinueSecurely.click();
		return PageFactory.initElements(driver, Install.class);
		
	}
	
	
}
