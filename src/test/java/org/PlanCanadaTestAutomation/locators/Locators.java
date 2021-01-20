package org.PlanCanadaTestAutomation.locators;

public interface Locators {


	// PlanCanada Screen Locators
	public interface planCanadaLocators {
		String GOOGLE_SEARCH_TEXT_BOX = "//*[@id='tsf']/div[2]/div[1]/div[1]/div/div[2]/input";
		String DONATE_NAV = "//*[@id='donateNav']/a[1]";
		String GIFTS_OF_HOPE = "//*[@id='donateNav']/section/ul/li[3]/a";
		String ADD_TO_CART_SCHOOL_MEALS_BUTTON = "//*[@id='add-to-cart-183']/div[2]/button";
		String CHECKOUT_BUTTON = "//*[@id='minicart-checkout-button']";
		String CHECKOUT_AS_GUEST_EMAIL = "//*[@id='Email']";
		String CHECKOUT_AS_GUEST_BUTTON = "//*[@id='mainContent']/div[2]/div/div/div/div[1]/form/div/div[1]/span/button";
		String SELECT_DELIVERY_METHOD_DROPDOWN = "//*[@id='delTypeToggle']/span";
		String DELIVERY_METHOD_NO_CARD = "//*[@id='deliverymethod_4']";
		String PROCEED_TO_PAYMENT_BUTTON = "//a[contains(text(),'Proceed to payment')]";
	}
	
	// locators for TestTribute -  https://give.plancanada.ca/TestTribute 
	public interface testTributeLocators {
		String GOOGLE_SEARCH_TEXT_BOX = "//*[@id='tsf']/div[2]/div[1]/div[1]/div/div[2]/input";
		String DONATE_BTN = "/html/body/header/div/nav/div/a";
		String DONATE_AMT = "//input[@id='donationAmountNumber']";
		String DONATE_FNAME = "//input[@id='firstName']";
		String DONATE_LNAME = "//input[@id='lastName']";
		String DONATE_EMAIL = "//input[@id='email']";		
		String TRIBUTE_MESSAGE_LINK = "//div[@id='notifyTributeBtn']";		
		String TRIBUTE_MESSAGE_BOX = "//textarea[@id='tributeNotificationMessage']";		
		String TRIBUTEE_FNAME = "//*[@id=\"57259-167393-_-TributeeFirstName\"]";		
		String TRIBUTEE_LNAME = "//input[@id='57259-167394-_-TributeeLastName']";
		String TRIBUTEE_EMAIL = "//input[@id='TributeEmail']";
		String BILLING_DONATE_ADDRESS = "//input[@id='billingDonateAddress']";
		String BILLING_DONATE_APT = "//input[@id='billingDonateAddressApt']";		
		String BILLING_DONATE_CITY = "//input[@id='billingDonateCity']";		
		String BILLING_DONATE_PROVINCE = "//select[@id='billingDonateStateCa']";		
		String BILLING_POSTAL_CODE = "//input[@id='billingDonateZip']";		
		String BILLING_DONATE_COUNTRY = "//select[@id='billingDonateCountry']";		
		String BILLING_NAME = "/html/body/div[5]/div/div[2]/div/div[2]/div/div/div[1]/div/form/div/div/div[2]/div[2]/div/div/div[2]/div/input[2]";
		String BILLING_CARD_NUMBER_FRAME = "/html/body/div[5]/div/div[2]/div/div[2]/div/div/div[1]/div/form/div/div/div[2]/div[2]/div/div/div[2]/div/div/div[1]/div/iframe";
		String BILLING_CARD_NUMBER_FIELD = "/html/body/form/div/input";	  
		
		
		/*
		 * String BILLING_CARD_MONTH_FRAME = "billingDonateMonthframe"; String
		 * BILLING_CARD_MONTH_FIELD = "expire-month";
		 * 
		 * String BILLING_CARD_YEAR_FRAME = "billingDonateYearframe"; String
		 * BILLING_CARD_YEAR_FIELD = "expire-year";
		 */
		 
				
		/*
		 * String BILLING_CARD_CVV_FRAME = "//iframe[@id='billingDonateCvvframe']";
		 * String BILLING_CARD_CVV_FIELD = "//[@id=\'cvv']";
		 */
				  
		String TRIBUTE_DONATE_BTN = "//*[@id=\'sendDonation']";
 				
	}
	
	
	// locators for Sales force 
	public interface sfLocators {
		
		String SF_LOGIN_BTM_MAIN = "/html/body/div[5]/div/div/header/div[3]/div/div/div[1]/div[1]/div[2]/button";
		String SF_LOGIN_BTN = "/html/body/div[1]/div[1]/div/div/div[2]/div[3]/form/input[3]";
		String CAMPAIGN_OBJ = "/html/body/div[4]/div[1]/div[2]/div[2]/div/div[2]/div/section/div/div[2]/div/div/div/div[2]/div/div[2]/div/table/tbody/tr[11]/th/a";
		String PAGE_LAYOUTS_LINK = "/html/body/div[4]/div[1]/div[2]/div[2]/div/div[2]/div/section/div/div[2]/div/div/div/div[2]/div/div/div[1]/div/ul/li[3]/a";
		String FIRST_LAYOUT_LINK = "/html/body/div[4]/div[1]/div[2]/div[2]/div/div[2]/div/section/div/div[2]/div/div/div/div[2]/div/div/div[2]/div/div/div/div/div/section/div/div[2]/div/div/table/tbody/tr/td[1]/a/span";
		String SF_USERNAME_FIELD = "/html/body/div[1]/div[1]/div/div/div[2]/div[3]/form/div[2]/div/input[1]";
		String SF_PW_FIELD = "/html/body/div[1]/div[1]/div/div/div[2]/div[3]/form/input[2]";
	
	}
	
	
}




