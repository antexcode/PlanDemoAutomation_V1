package org.PlanCanadaTestAutomation.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadPropertyFiles {

	Properties configProperty;
	Properties dataProperty;

	public ReadPropertyFiles() {
		File src = new File("./Configuration/config.properties");
		File src1 = new File("./Configuration/testdata.properties");

		try {
			FileInputStream fis = new FileInputStream(src);
			configProperty = new Properties();
			configProperty.load(fis);

			FileInputStream fis1 = new FileInputStream(src1);
			dataProperty = new Properties();
			dataProperty.load(fis1);
		} catch (Exception e) {
			System.out.println("Exception is" + e.getMessage());
		}
	}

	// Get Extent Report Path from Property File
	public String getExtentReportPath() {
		String extentReportPath = configProperty.getProperty("EXTENT_REPORT_PATH");
		return extentReportPath;
	}

	// Get Google URL from Property File
	public String getGoogleURL() {
		String googleURL = dataProperty.getProperty("GOOGLE_URL");
		return googleURL;
	}

	
	// Get Plan Canada Test from Property File
	public String getPlanCanadaText() {
	String planCanadaTest = dataProperty.getProperty("PLAN_CANADA_KEY");
	return planCanadaTest;
	}

	// Get Guest Email from Property File
	public String getGuestEmail(){
	String guestEmail = dataProperty.getProperty("GUEST_EMAIL");
	return guestEmail;

	}
	
	//Below getter methods for TEST TRIBUTE pages--------------------------------------------
	//Get URL for TributeSiteURL
	public String getTributeSiteURL()
	{
		String tributeSiteURL = dataProperty.getProperty("Tribute_SiteURL");
		return tributeSiteURL;		
	}
	
	//Get amount for TributeSiteURL donation
	public String getTributeDonationAmt()
	{
		String tributeDonationAmt = dataProperty.getProperty("Tribute_Donate_Amt");
		return tributeDonationAmt;		
	}
	
	//Get first name for TributeSiteURL donation
	public String getTributeFname()
	{
		String tributeFname = dataProperty.getProperty("Tribute_Fname");
		return tributeFname;		
	}
	
	//Get last name for TributeSiteURL donation
	public String getTributeLname()
	{
		String tributeLname = dataProperty.getProperty("Tribute_Lname");
		return tributeLname;		
	}
	
	//Get test email for TributeSiteURL donation
	public String getTributeEmail()
	{
		String tributeEmail = dataProperty.getProperty("Tribute_Email");
		return tributeEmail;		
	}
	
	//Get tribute message for TributeSiteURL donation
	public String getTributeMessage()
	{
		String tributeMessage = dataProperty.getProperty("Tribute_Message");
		return tributeMessage;		
	}
	
	//Get billing address for TributeSiteURL donation
	public String getBillingAddress()
	{
		String tributBillingAddress = dataProperty.getProperty("Tribute_BillingAddress");
		return tributBillingAddress;		
	}
	
	//Get billing APT for TributeSiteURL donation
	public String getBillingApt()
	{
		String tributBillingApt = dataProperty.getProperty("Tribute_BillingApt");
		return tributBillingApt;		
	}

	//Get billing address for TributeSiteURL donation
	public String getBillingCity()
	{
		String tributBillingCity = dataProperty.getProperty("Tribute_BillingCity");
		return tributBillingCity;		
	}
	
	//Get billing postalcode for TributeSiteURL donation
	public String getBillingPostalCode()
	{
		String TributeBillingPostalCode = dataProperty.getProperty("Tribute_BillingPostalCode");
		return TributeBillingPostalCode;		
	}
	
	//Get billing name for TributeSiteURL donation
	public String getBillingName()
	{
		String TributeBillingName = dataProperty.getProperty("Tribute_BillingName");
		return TributeBillingName;		
	}
	
	//Get billing card number for TributeSiteURL donation
	public String getBillingCardNumber()
	{
		String TributeCardNumber = dataProperty.getProperty("Tribute_CardNumber");
		return TributeCardNumber;		
	}
	
	//Get billing card number CVV for TributeSiteURL donation
	public String getBillingCardCVV()
	{
		String TributeCardCVV = dataProperty.getProperty("Tribute_CardCVV");
		return TributeCardCVV;		
	}
	
	
	//Get URL for SF----------------------------------------------------------------------------------
	//Get billing card number CVV for TributeSiteURL donation
	public String get_SF_url()
	{
		String sfURL  = dataProperty.getProperty("SF_URL");
		return sfURL;		
	}
	
	public String get_SFusername()
	{
		String sfUsername = dataProperty.getProperty("SF_USERNAME");
		return sfUsername;
	}
	
	public String get_SFpassword()
	{
		String sfPassword = dataProperty.getProperty("SF_PW");
		return sfPassword;
	}
	
	public String get_TableLabel()
	{
		String sfLabel = dataProperty.getProperty("SF_Label");
		return sfLabel;
	}
	
	public String get_TablePlural()
	{
		String sf_Plural = dataProperty.getProperty("SF_Plural");
		return sf_Plural;
	}
	
	
	public String get_TableDesc()
	{
		String sf_TableDesc = dataProperty.getProperty("SF_Desc");
		return sf_TableDesc;
	}
}
