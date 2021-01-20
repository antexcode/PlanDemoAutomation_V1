package org.PlanCanadaTestAutomation.utilities;

import org.PlanCanadaTestAutomation.baseClass.TestBase;
import org.openqa.selenium.JavascriptExecutor;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.PlanCanadaTestAutomation.baseClass.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Scroller extends TestBase  {
	
	//method to move to bottom of page
	public static void scrollToBottom()  
	{
	
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}

	
	//method to move to top of page
	public static void scrollToTop()  
	{
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,0)");	
	}
	
	//method to move to specific element
	public static void scrollToElement(String xPathLocator)  
	{
		
		WebElement element = driver.findElement(By.xpath(xPathLocator));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);		
	}
}
