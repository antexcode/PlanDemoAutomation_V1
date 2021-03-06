package org.PlanCanadaTestAutomation.pageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import org.PlanCanadaTestAutomation.baseClass.TestBase;
import org.PlanCanadaTestAutomation.locators.Locators.planCanadaLocators;
import org.PlanCanadaTestAutomation.locators.Locators.sfLocators;
import org.PlanCanadaTestAutomation.locators.Locators.testTributeLocators;
import org.PlanCanadaTestAutomation.utilities.ExtentReport;
import org.PlanCanadaTestAutomation.utilities.ScreenCaptureUtilies;

public class SalesForce_ObjectPage extends TestBase implements sfLocators {

	private static final String SF_LOGIN_BTN_MAIN = null;

	Actions action = new Actions(driver);
	//WebDriverWait wait = new WebDriverWait(driver, 5);
	
	// TestTribute page object from locators
	@FindBy(xpath = CAMPAIGN_OBJ)
	WebElement campaignObj;
	
	
	public void SF_HomePage() 
	{
		PageFactory.initElements(driver, this);
	}


	//Go to SF dev homepage and login button on same page 
	public void goToSalesForceDev(String SF_URL) throws InterruptedException {
		driver.get(SF_URL);
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		//Thread.sleep(5000);
		//driver.navigate().refresh();
		//driver.findElement(By.xpath(SF_LOGIN_BTN_MAIN)).click();
		//driver.findElement(By.xpath("/html/body/div[5]/div/div/header/div[3]/div/div/div[1]/div[1]/div[2]/button")).click();
		//driver.findElement(By.xpath(SF_LOGIN_BTN)).click();
		ScreenCaptureUtilies.captureScreenshot(driver, "Sales Force Dev. Page");
		ExtentReport.logStat(Status.PASS, "Successfully navigated To Sales Force Dev.");
	}
	

	//login page
	public void login(String sf_username, String sf_pass) throws InterruptedException
	{
			
		//driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		driver.findElement(By.xpath(SF_USERNAME_FIELD)).sendKeys(sf_username);
		driver.findElement(By.xpath(SF_PW_FIELD)).sendKeys(sf_pass);
		driver.findElement(By.xpath(SF_LOGIN_BTN)).click();
		driver.manage().getCookies();
		Thread.sleep(5000);
					
	}
	
	
	//objects actions
	public void objectsActions() throws InterruptedException  {
		
		//driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/div[2]/div/div[2]/div/section/div/div[2]/div/div/div/div[2]/div/div[2]/div/table/tbody/tr[13]/th/a")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/div[2]/div/div[2]/div/section/div/div[2]/div/div/div/div[2]/div/div/div[1]/div/ul/li[3]/a")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/div[2]/div/div[2]/div/section/div/div[2]/div/div/div/div[2]/div/div/div[2]/div/div/div/div/div/section/div/div[2]/div/div/table/tbody/tr/td[1]/a/span")).click();
		Thread.sleep(2000);
		

		//driver.switchTo().frame("/html/body/div[4]/div[1]/div[2]/div[2]/div/div[2]/div/section/div/div[2]/div/div/div/div[2]/div/div/div[2]/div/div/div/div/div/force-aloha-page/div/iframe");
		//driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div[2]/div[1]/div/div/div[2]/div/div/div[1]/div/div/div/input")).sendKeys("card");
		}
	
	
	//new obj
	public void newObject(String label, String plural, String desc) throws InterruptedException
	{
		
		
	driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/header/div[3]/div/div[2]/div/div/ul[2]/li[3]/div/div[1]/div/div/a")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/header/div[3]/div/div[2]/div/div/ul[2]/li[3]/div/div[2]/div/ul/li/a")).click();
	
	Thread.sleep(2000);
	
	//fill table
	driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/div[2]/div/div[2]/div/section/div/div[2]/div/div/div/div[2]/div/div/force-aloha-page/div/iframe")));
	
	driver.findElement(By.xpath("/html/body/form/div/div[2]/div[3]/table/tbody/tr[2]/td[2]/div/input")).sendKeys(label);
	
	driver.findElement(By.xpath("/html/body/form/div/div[2]/div[3]/table/tbody/tr[3]/td[2]/div/input")).sendKeys(plural);

	driver.findElement(By.xpath("/html/body/form/div/div[2]/div[3]/table/tbody/tr[9]/td[2]/textarea")).sendKeys(desc);
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/form/div/div[2]/div[3]/table/tbody/tr[3]/td[2]/div/input")).sendKeys(Keys.ENTER);

		//save
	//Actions sfActions = new Actions(driver);
	
	ScreenCaptureUtilies.captureScreenshot(driver, "Sales Force new object");
	ExtentReport.logStat(Status.PASS, "Successfully created Sales Force object");
	
	
	//driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/div[2]/div/div[2]/div/section/div/div[2]/div/div/div/div[2]/div/div/force-aloha-page/div/iframe")));
	//driver.findElement(By.xpath("/html/body/form/div/div[1]/table/tbody/tr/td[2]/input[1]")).click();
	}
	
	//log out
	public void sf_logout() throws InterruptedException
	{
		
	Thread.sleep(3000);		
	driver.switchTo().defaultContent();
	driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/header/div[2]/span/div[2]/ul/li[8]/span/button/div/span[1]/div")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[1]/div[1]/div/div[2]/div/a[2]")).click();
	
	ScreenCaptureUtilies.captureScreenshot(driver, "Sales Force Dev. Page");
	ExtentReport.logStat(Status.PASS, "Finished test on Sales Force Dev.");
	
	}
	
	
	//
	/*
	//Go to donation page
	public void goToDonationPage()
	{
		tributeDonate_btn.click();
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		ScreenCaptureUtilies.captureScreenshot(driver, "Plan Canada Test Tribute Donation Page");
		ExtentReport.logStat(Status.PASS, "Successfully navigated To Test Tribute Donation Page");
	}
	
	
	//Fill out donation amount and name info
	public void fillOutInfo(String Amt, String Fname, String Lname, String Email)
	{
		tribueDonate_Amt_field.sendKeys(Amt);
	
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		ScreenCaptureUtilies.captureScreenshot(driver, "Donate settings info");
		ExtentReport.logStat(Status.PASS, "Successfully filled out donate settings infos");		
	}
	
	//Click Tribute message box and fill out
	public void fillTributeMessage(String TributeMessage)
	{

		tributeMessage_link.click();
		tributeMessage_field.sendKeys(TributeMessage);
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		ScreenCaptureUtilies.captureScreenshot(driver, "Tribute Message Field");
		ExtentReport.logStat(Status.PASS, "Successfully opened and filled out tribute message field");		
	}
	
	//go to billing address form
	public void fillBillingInfo(String TributeAddress, String TributeApt, String TributeCity, String TributePostalCode )
	{

		billing_address_field.sendKeys(TributeAddress);
		billing_apt_field.sendKeys(TributeApt);
		billing_city_field.sendKeys(TributeCity);
		//billing_province_field.sendKeys();
		
		//province dropdown
		Select provinces = new Select(driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div[2]/div/div/div[1]/div/form/div/div/div[2]/div[1]/div/div[1]/div[13]/div[2]/div/div[1]/select")));
		provinces.selectByIndex(4);
		
		billing_postalCode_field.sendKeys(TributePostalCode);	
		//billing_country_field.sendKeys();
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		ScreenCaptureUtilies.captureScreenshot(driver, "Billing address form");
		ExtentReport.logStat(Status.PASS, "Successfully filled out billing address form");		
	}
	
	  //go to Payment form
	  public void fillPaymentInfo(String TributeBillingName, String TributeCardNumber, String cvv)
	  {
	  
	  //credit card name and number
	  billing_name_field.sendKeys(TributeBillingName);
	  driver.switchTo().frame(billing_cardNumber_frame);
	  billing_cardNumber_field.sendKeys(TributeCardNumber);
	  
      //cc month
      driver.switchTo().defaultContent();
      driver.switchTo().frame(driver.findElement(By.id("billingDonateMonthframe")));
      Select monthDropDown = new Select(driver.findElement(By.id("expire-month")));
      monthDropDown.selectByIndex(4); 

      //cc year
      driver.switchTo().defaultContent();
      driver.switchTo().frame(driver.findElement(By.id("billingDonateYearframe")));
      Select yearDropDown = new Select (driver.findElement(By.id("expire-year")));
      yearDropDown.selectByIndex(4);

		
      //cvv
      driver.switchTo().defaultContent();
      driver.switchTo().frame(driver.findElement(By.id("billingDonateCvvframe")));
      driver.findElement(By.id("cvv")).sendKeys(cvv);
    
  
	  //wait and take reports 
	  driver.manage().timeouts().implicitlyWait(45,TimeUnit.SECONDS); 
	  ScreenCaptureUtilies.captureScreenshot(driver,"Payment form");
	  ExtentReport.logStat(Status.PASS,"Successfully filled out Payment form"); }
	 
	
	  //click donate button
	  public void donateSubmit() 
	  {
	  
	        //submit
	        driver.switchTo().defaultContent();
	        driver.findElement(By.id("sendDonation")).click();
	        //wait.wait(000);
	        ScreenCaptureUtilies.captureScreenshot(driver,"final donation form");
	        
	  }
	 
	*/
}


