package org.PlanCanadaTestAutomation.tests;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.PlanCanadaTestAutomation.baseClass.TestBase;
import org.PlanCanadaTestAutomation.utilities.ExtentReport;
import org.PlanCanadaTestAutomation.utilities.ReadPropertyFiles;
import org.PlanCanadaTestAutomation.pageObject.TestTribute_HomePage;

public class PlanCanada_TestTribute_TC01 extends TestBase {

	ReadPropertyFiles readPro = new ReadPropertyFiles();

	// Get relevant data from Property Files.
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

	
	@BeforeMethod
	public void beforeMethod() {
		// Start Test
		System.out.println("Start Test: PlanCanada_TestTribute__TC_01");

	}

	@Test
	public void planCanada_testTribute__TC_01() throws InterruptedException {
		ExtentReport.initialisation("PlanCanada_TestTribute__TC_01");
		TestTribute_HomePage objTestTribute01 = new TestTribute_HomePage();


		// Below steps to perform demo actions
		objTestTribute01.goToTestTribute(TributeSiteURL);
		objTestTribute01.goToDonationPage();
		objTestTribute01.fillOutInfo(TributeSiteAmt, TributeSiteFname, TributeSiteLname, TributeSiteEmail);
		objTestTribute01.fillTributeMessage(TributeMessage);
		objTestTribute01.fillBillingInfo(TributeBillingAddress, TributeBillingApt, TributeBillingCity, TributePostalCode);
		//objTestTribute01.fillPaymentInfo(TributeBillingName, TributeCardNumber, TributeCardCVV);
		Thread.sleep(50000);
	}	

}






/*



public class PlanCanada_Gifts_Of_Hope__TC_02 extends TestBase {

	ReadPropertyFiles readPro = new ReadPropertyFiles();

	// Get the Data from Property Files.
	String url = readPro.getGoogleURL();
	String keysToSend = readPro.getPlanCanadaText();
	String guestEmail = readPro.getGuestEmail();

	@BeforeMethod
	public void beforeMethod() {
		// Start Test
		System.out.println("Start Test: PlanCanada_Gifts_Of_Hope__TC_02");

		// Launch Browser and URL
		openURL(url);
	}

	@Test
	public void planCanada_Gifts_Of_Hope__TC_02() {
		ExtentReport.initialisation("PlanCanada_Gifts_Of_Hope__TC_02");
		PlanCanada_Screen objPlanCanada = new PlanCanada_Screen();


		// Below created the scripts step for Donate >> Gifts of Hope
		objPlanCanada.goToPlanCanada(keysToSend);
		objPlanCanada.goToGiftsOfHope();
		objPlanCanada.addToCartSchoolMeals();
		System.out.println(guestEmail);
		objPlanCanada.checkoutItem(guestEmail);
		objPlanCanada.customiseYourCard();
	}

	@AfterMethod
	public void afterMethod() {
		// End Test
		System.out.println("End Test: PlanCanada_Gifts_Of_Hope__TC_02");
	}
}
*/
