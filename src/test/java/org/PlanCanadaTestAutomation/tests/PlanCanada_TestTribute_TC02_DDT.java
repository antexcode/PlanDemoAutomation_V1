package org.PlanCanadaTestAutomation.tests;

import java.io.IOException;

import org.PlanCanadaTestAutomation.baseClass.TestBase;
import org.PlanCanadaTestAutomation.pageObject.TestTribute_HomePage;
import org.PlanCanadaTestAutomation.utilities.ExtentReport;
import org.PlanCanadaTestAutomation.utilities.ReadPropertyFiles;
import org.PlanCanadaTestAutomation.utilities.XLUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PlanCanada_TestTribute_TC02_DDT extends TestBase {

	
		
	/*
	 * @BeforeMethod public void beforeMethod() { // System log
	 * System.out.println("Start Test: PlanCanada_TestTribute__TC_02_DDT"); }
	 */
		
		
		//test steps below
		@Test(dataProvider="DonationData2")
		public void donationTest(String amt, String fName, String lName, String email, String street, String apt, String city, String postal, String billingName, String billingCard, String ccMonth, String ccYear, String cvv) throws InterruptedException  
		{
			//WebDriverWait mywait = new WebDriverWait(driver, 5000);
			// String billingName, String billingCard, int ccMonth, int ccYear, String ccCVV
			//log start of test case
			logger.info("---starting PlanCanada_TestTribute_TC02_DDT--- ");
			
			//read property file for URL data
			ReadPropertyFiles readPro = new ReadPropertyFiles();
			String TributeSiteURL = readPro.getTributeSiteURL();
			
			//initialize report
			ExtentReport.initialisation("PlanCanada_TestTribute__TC_02_DDT");
			TestTribute_HomePage objTestTribute01 = new TestTribute_HomePage();
			
			//perform steps using excel data
			objTestTribute01.goToTestTribute(TributeSiteURL);
			//driver.get("https://give.plancanada.ca/TestTribute");
			//Thread.sleep(2000);
			//driver.findElement(By.xpath("/html/body/header/div/nav/div/a")).click();
			objTestTribute01.goToDonationPage();
			objTestTribute01.fillOutInfo(amt, fName, lName, email);
			objTestTribute01.fillBillingInfo(street, apt, city, postal);
			objTestTribute01.fillPaymentInfo(billingName, billingCard, cvv);
			objTestTribute01.donateSubmit();
			 	
			Thread.sleep(3000);
			
			//log end of testcase
			logger.info("--- Finished PlanCanada_TestTribute_TC02_DDT ---");
			
		}
		
		
		//data provider below
		@DataProvider(name="DonationData2")
		public String[][] getData() throws IOException 
		
		{ 
			String path=System.getProperty("user.dir")+"/ExcelFile/DonationData2.xlsx";
		
			int totalrows=XLUtils.getRowCount(path, "Sheet1"); 
			int totalcols=XLUtils.getCellCount(path, "Sheet1", 1); 
			
			String donationData[][]=new String[totalrows][totalcols];

			for(int i=1;i<=totalrows;i++)
			{
				for(int j=0;j<totalcols;j++)
				{
					donationData[i-1][j]=XLUtils.getCellData(path, "Sheet1", i, j); //1,0
				} 
			} 
			
			return donationData;
		
		}

}
	

