package org.PlanCanadaTestAutomation.pageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import org.PlanCanadaTestAutomation.baseClass.TestBase;
import org.PlanCanadaTestAutomation.locators.Locators.planCanadaLocators;
import org.PlanCanadaTestAutomation.locators.Locators.testTributeLocators;
import org.PlanCanadaTestAutomation.utilities.ExtentReport;
import org.PlanCanadaTestAutomation.utilities.ScreenCaptureUtilies;


public class TestTribute_HomePage extends TestBase implements testTributeLocators {

	Actions action = new Actions(driver);
	//WebDriverWait wait = new WebDriverWait(driver, 5);
	

	// TestTribute page object from locators
	@FindBy(xpath = GOOGLE_SEARCH_TEXT_BOX)
	WebElement googleSearchTextBox_field;
	@FindBy(xpath = DONATE_BTN)
	WebElement tributeDonate_btn;	
	@FindBy(xpath = DONATE_AMT)
	WebElement tribueDonate_Amt_field;	
	@FindBy(xpath = DONATE_FNAME)
	WebElement tributeDonate_Fname_field;	
	@FindBy(xpath = DONATE_LNAME)
	WebElement tributeDonate_Lname_field;	
	@FindBy(xpath = DONATE_EMAIL)
	WebElement tributeDonate_email_field;	
	@FindBy(xpath = TRIBUTE_MESSAGE_LINK)
	WebElement tributeMessage_link;	
	@FindBy(xpath = TRIBUTE_MESSAGE_BOX)
	WebElement tributeMessage_field;
	@FindBy(xpath = TRIBUTEE_FNAME)
	WebElement tribute_Fname_field;	
	@FindBy(xpath = TRIBUTEE_LNAME)
	WebElement tribute_Lname_field;
	@FindBy(xpath = TRIBUTEE_EMAIL)
	WebElement tribute_email_field;
	@FindBy(xpath = BILLING_DONATE_ADDRESS)
	WebElement billing_address_field;
	@FindBy(xpath = BILLING_DONATE_APT)
	WebElement billing_apt_field;
	@FindBy(xpath = BILLING_DONATE_CITY)
	WebElement billing_city_field;		
	@FindBy(xpath = BILLING_DONATE_PROVINCE)
	WebElement billing_province_field;
	@FindBy(xpath = BILLING_POSTAL_CODE)
	WebElement billing_postalCode_field;
	@FindBy(xpath = BILLING_DONATE_COUNTRY)
	WebElement billing_country_field;
	
	@FindBy(xpath = BILLING_NAME) 
	WebElement billing_name_field;
	  
	@FindBy(xpath = BILLING_CARD_NUMBER_FRAME) 
	WebElement  billing_cardNumber_frame;
	  
	@FindBy(xpath = BILLING_CARD_NUMBER_FIELD)
	WebElement  billing_cardNumber_field;
	  
		
		/*
		 * @FindBy(id = "billingDonateMonthframe") WebElement billing_cardMonth_frame;
		 * 
		 * @FindBy(id = "expire-month") WebElement billing_cardMonth_field;
		 * 
		 * @FindBy(id = "billingDonateYearframe") WebElement billing_cardYear_frame;
		 * 
		 * @FindBy(id = "expire-year") WebElement billing_cardYear_field;
		 */
		 		  
			
		/*
		 * @FindBy(xpath = BILLING_CARD_CVV_FRAME) WebElement billing_cardCvv_frame;
		 * 
		 * @FindBy(xpath = BILLING_CARD_CVV_FIELD) WebElement billing_cardCvv_field;
		 */
			  
		/*
		 * @FindBy(xpath = TRIBUTE_DONATE_BTN)
		 * 
		 * WebElement tribute_Donate_btn;
		 */
			 
		 
	
	
	public TestTribute_HomePage() {
		PageFactory.initElements(driver, this);
	}


	//Go to Plan Canada Test Tribute WebSite
	public void goToTestTribute(String SiteURL) {
		driver.get(SiteURL);
		//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		ScreenCaptureUtilies.captureScreenshot(driver, "Plan Canada Test Tribute Home Page");
		ExtentReport.logStat(Status.PASS, "Successfully navigated To Plan Canada Test Tribute Homepage");
	}
	
	//Go to donation page
	public void goToDonationPage()
	{
		tributeDonate_btn.click();
		//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		ScreenCaptureUtilies.captureScreenshot(driver, "Plan Canada Test Tribute Donation Page");
		ExtentReport.logStat(Status.PASS, "Successfully navigated To Test Tribute Donation Page");
	}
	
	
	//Fill out donation amount and name info
	public void fillOutInfo(String Amt, String Fname, String Lname, String Email)
	{
		tribueDonate_Amt_field.sendKeys(Amt);
		tributeDonate_Fname_field.sendKeys(Fname);
		tributeDonate_Lname_field.sendKeys(Lname);
		tributeDonate_email_field.sendKeys(Email);
		//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		ScreenCaptureUtilies.captureScreenshot(driver, "Donate settings info");
		ExtentReport.logStat(Status.PASS, "Successfully filled out donate settings infos");		
	}
	
	//Click Tribute message box and fill out
	public void fillTributeMessage(String TributeMessage)
	{

		tributeMessage_link.click();
		tributeMessage_field.sendKeys(TributeMessage);
		//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
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
		//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
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
      monthDropDown.selectByIndex(5); 

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
      //driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS); 
	  ScreenCaptureUtilies.captureScreenshot(driver,"Payment form");
	  ExtentReport.logStat(Status.PASS,"Successfully filled out Payment form"); }
	 
	
	  //click donate button
	  public void donateSubmit() 
	  {
	  
	        //submit
	        driver.switchTo().defaultContent();
	        driver.findElement(By.id("sendDonation")).click();
	        driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS); 
	       
			//wait for confirmation of donation and pass/fail
			  if(driver.findElements(By.xpath("/html/body/div[5]/div/div[2]/div/div[2]/div/div/div[1]/div/div/h3")).size()> 0) 
			  { 
				  Assert.assertTrue(true);
				  ExtentReport.test.pass("Donation successful");
			  
			  } 
			  else 
			  { 
				  ExtentReport.test.fail("Failed to donate successfully");
			  }
			 
			//screenshot for final page
	        ScreenCaptureUtilies.captureScreenshot(driver,"final donation form");
	        
	  }
	 
	
}


