package org.PlanCanadaTestAutomation.tests;

import java.io.IOException;
import java.sql.Driver;

import javax.servlet.http.Cookie;

import org.PlanCanadaTestAutomation.baseClass.TestBase;
import org.PlanCanadaTestAutomation.pageObject.SalesForce_ObjectPage;
import org.PlanCanadaTestAutomation.pageObject.TestTribute_HomePage;
import org.PlanCanadaTestAutomation.utilities.ExtentReport;
import org.PlanCanadaTestAutomation.utilities.ReadPropertyFiles;
import org.PlanCanadaTestAutomation.utilities.XLUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SalesForce_TC01 extends TestBase {

		
		
		
		//LOG
	  	@BeforeMethod public void beforeMethod()
	  	{ 
	  	System.out.println("Start Test: SalesForce_TC01"); 
	  	}
	 
		
		
		//test steps below
		@Test()
		public void salesForceTest() throws InterruptedException  
		{
			//WebDriverWait mywait = new WebDriverWait(driver, 5000);
			// String billingName, String billingCard, int ccMonth, int ccYear, String ccCVV
			//log start of test case
			logger.info("---starting SalesForce_TC01--- ");
			
			//read property file for URL data
			ReadPropertyFiles readPro = new ReadPropertyFiles();
			String sf_url = readPro.get_SF_url();
			String sf_username = readPro.get_SFusername();
			String sf_pass = readPro.get_SFpassword();
			String sf_label = readPro.get_TableLabel();
			String sf_plural = readPro.get_TablePlural();
			String sf_TableDesc= readPro.get_TableDesc();
			
			//initialize report
			ExtentReport.initialisation("SalesForce_TC01");
			SalesForce_ObjectPage sfPage1 = new SalesForce_ObjectPage();
			
			//perform steps using excel data			
			sfPage1.goToSalesForceDev(sf_url);
			sfPage1.login(sf_username, sf_pass);
			//driver.switchTo().alert().dismiss();
			Thread.sleep(1000);
			sfPage1.objectsActions();
			sfPage1.newObject(sf_label, sf_plural, sf_TableDesc);
			sfPage1.sf_logout();
			
			driver.close();
			/*
			WebDriverWait wait = new WebDriverWait(driver, 100);
			WebElement waitElement = wait.until(ExpectedConditions.elementToBeClickable(By.id(>someid>)));
			if(ExpectedConditions.attributeToBeNotEmpty(element,"value"))
			{
			  //continue with the automation flow
			}
		*/
			
					
			
			//driver.get("https://give.plancanada.ca/TestTribute");
			//Thread.sleep(2000);
			//driver.findElement(By.xpath("/html/body/header/div/nav/div/a")).click();
			Thread.sleep(7000);
			
			//log end of testcase
			logger.info("--- Finished SalesForce_TC01 ---");
			
		}



		private Object WebDriverWait(WebDriver driver, int i) {
			// TODO Auto-generated method stub
			return null;
		}
		
		
		/*
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
		
		*/

}
	

