package org.PlanCanadaTestAutomation.tests;

import java.io.IOException;

import org.PlanCanadaTestAutomation.baseClass.TestBase;
import org.PlanCanadaTestAutomation.pageObject.TestTribute_HomePage;
import org.PlanCanadaTestAutomation.utilities.ExtentReport;
import org.PlanCanadaTestAutomation.utilities.JiraPolicy;
import org.PlanCanadaTestAutomation.utilities.ReadPropertyFiles;
import org.PlanCanadaTestAutomation.utilities.XLUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Tester extends TestBase {

	
		
	/*
	 * @BeforeMethod public void beforeMethod() { // System log
	 * System.out.println("Start Test: PlanCanada_TestTribute__TC_02_DDT"); }
	 */
		
		
		//test steps below

		@JiraPolicy(logTicketReady = true)
		@Test(priority = 1, enabled = true)
		public void donationTest() throws InterruptedException  
		{
			//WebDriverWait mywait = new WebDriverWait(driver, 5000);
			// String billingName, String billingCard, int ccMonth, int ccYear, String ccCVV
			//log start of test case
			//logger.info("---starting PlanCanada_TestTribute_TC03--- ");
			logger.info("--- starting tester classs ---");
			
			//read property file for URL data
			ReadPropertyFiles readPro = new ReadPropertyFiles();

			String TributeSiteURL = readPro.getTributeSiteURL();
			String TributeSiteAmt = readPro.getTributeDonationAmt();
			String TributeSiteFname = readPro.getTributeFname();
			String TributeSiteLname = readPro.getTributeLname();
			String TributeSiteEmail = readPro.getTributeEmail();	
			String TributeMessage = readPro.getTributeMessage();
			String TributeBillingAddress = readPro.getBillingAddress();
			String TributeBillingApt = readPro.getBillingApt();
			String TributeBillingCity = readPro.getBillingCity();
			String TributePostalCode = readPro.getBillingPostalCode();
			String TributeBillingName = readPro.getBillingName();
			String TributeCardNumber = readPro.getBillingCardNumber();
			String TributeCardCVV = readPro.getBillingCardCVV();	
			
			//initialize report
			ExtentReport.initialisation("PlanCanada_TestTribute_TC03");
			TestTribute_HomePage objTestTribute01 = new TestTribute_HomePage();
			
			//perform steps using excel data
			//objTestTribute01.goToTestTribute(TributeSiteURL);
	
			//driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div/div/div/div[2]/div[2]/div/div[2]/ul/li[3]/a")).click();
			//Thread.sleep(2000);
			//driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div/div/div/div[2]/div[2]/div/div[2]/a")).click();

			//objTestTribute01.fillOutInfo(TributeSiteAmt, TributeSiteFname, TributeSiteLname, TributeSiteEmail);
			//objTestTribute01.fillTributeMessage(TributeMessage);
			//driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div[2]/div/div/div[1]/div/form/div/div/div[2]/div[1]/div/div[1]/div[12]/div/div/div/div[1]/div[2]/div[1]/input")).sendKeys("Anten");
			//driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div[2]/div/div/div[1]/div/form/div/div/div[2]/div[1]/div/div[1]/div[12]/div/div/div/div[1]/div[2]/div[2]/input")).sendKeys("Deg");
			//driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div[2]/div/div/div[1]/div/form/div/div/div[2]/div[1]/div/div[1]/div[12]/div/div/div/div[2]/div/div/input")).sendKeys("adegie@plancanada.ca");
			//objTestTribute01.fillBillingInfo(TributeBillingAddress, TributeBillingApt, TributeBillingCity, TributePostalCode);
			//objTestTribute01.fillPaymentInfo(TributeBillingName, TributeCardNumber, TributeCardCVV);
			
			//objTestTribute01.donateSubmit();
	
			Assert.assertTrue(false);
			Thread.sleep(5000);
			driver.close();
			
			//log end of testcase
			//logger.info("--- Finished PlanCanada_TestTribute_TC02_DDT ---");
			logger.info("--- Finished tester class ---");
			
		}
		
		


}
	

