package org.PlanCanadaTestAutomation.baseClass;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.Date;
import java.util.StringTokenizer;
import java.util.concurrent.TimeUnit;

import javax.servlet.http.Cookie;

import org.PlanCanadaTestAutomation.utilities.ExtentReport;
import org.apache.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import bsh.This;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.apache.log4j.Logger;
import org.apache.log4j.*;



public class TestBase {

	// initialize WebDriver
	public static WebDriver driver;
	
	//define logger class
	public Logger logger = LogManager.getLogger(this.getClass());
	
	
	@Parameters("browser")
	@BeforeClass

	// Setup Cross Browsing
	public static void setUp(String browser) {

		// Chrome Browser Driver Initialize
		if (browser.equalsIgnoreCase("chrome")) {
			
			//to use without selenium standalone
			//System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\org.PlanCanadaTestAutomation\\Drivers\\chromedriver.exe");
			//driver = new ChromeDriver();


			//cookie and chrome data
			//String chromeProfilePath = "C:\\Users\\con_adeige\\AppData\\Local\\Google\\Chrome\\User Data\\Default";
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("user-data-dir=chromeProfilePath");
			//WebDriver driver = new ChromeDriver(chromeOptions);
			

			//start driver 
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(chromeOptions);
			driver.manage().window().maximize();
			//driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);

			
			
		} 
		
		else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		}

		// IE Browser Driver Initialize
		else if (browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Selenium\\org.PlanCanadaTestAutomation\\Drivers\\msedgedriver.exe");
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		} else {
			System.out.println("Driver not found !!!");
		}
	}
	
	@AfterClass
	public static void tearDown() throws InterruptedException {
		//wait below added as experiment. 
		//driver.wait(3);
		driver.quit();
	}

	@BeforeSuite
	public void beforeSuite() {
		// Extent Report Start Up in Before Suite
		ExtentReport.startUp();
	}

	@AfterSuite
	public void afterSuite() {
		// Entent Report End in After Suite
		ExtentReport.endTest();
	}

	// Launch Browser and URL
	public void openURL(String url) {

		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
}
