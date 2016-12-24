package com.comcast.orderlab.common.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.comcast.orderlab.config.Configurations;

public class Install {

	WebDriver driver;

	public Install(WebDriver driver) {
		this.driver = driver; }
	
	@FindBy(xpath=Configurations.Calender)
	public WebElement Calender;
	
	@FindBy(xpath=Configurations.InstallSel)
	public WebElement InstallSel;
	
	@FindBy(xpath=Configurations.DateCell)
	public WebElement DateCell;
	
	@FindBy(xpath=Configurations.DateRad)
	public WebElement DateRad;
	
	@FindBy(xpath=Configurations.Date)
	public WebElement Date;
	
	@FindBy(xpath=Configurations.Cell)
	public WebElement Cell;
	
	@FindBy(xpath=Configurations.Cell1)
	public WebElement Cell1;
	
	@FindBy(xpath=Configurations.Pro)
	public WebElement Pro;
	
	@FindBy(xpath=Configurations.Self)
	public WebElement Self;
	
	
	
	public Payment selectPro() throws InterruptedException
	{

		Pro.click();
		for(int row=1;row<=7;row++)
		{
			int xx=row;
			String DateCellXpath=Configurations.DateCell.replace("{row}",Integer.toString(xx));
					
					boolean exit=false;
					
					for(int col=1;col<=7;col++)
						{
							int yy=col;
							String DateCellXpath1=DateCellXpath.replace("{col}",Integer.toString(yy));
							
							WebElement Cell=driver.findElement(By.xpath(DateCellXpath1));
							String dateAvail=Cell.getAttribute("rel");
							System.out.println(xx);
							System.out.println(yy);
							System.out.println(dateAvail);
							System.out.println(Cell);
							System.out.println(DateCellXpath1);
							
							if(dateAvail != null)
							{
								
								System.out.println ("Xpath"+DateCellXpath1);
								driver.findElement(By.xpath(DateCellXpath1)).click();
									
									//System.out.println ("Xpath"+DateCellXpath1);
								exit=true;
								
								break;
																		
							
							}
							
							//System.out.println ("Date Avail"+dateAvail);
								//System.out.println(xyz);
						    //driver.findElement(By.xpath(dateAvail)).click();
							
				}
			if(exit) break;
		}

		InstallSel.click();
		//Thread.sleep(15000);
		return PageFactory.initElements(driver, Payment.class);
	}
	
	
}
