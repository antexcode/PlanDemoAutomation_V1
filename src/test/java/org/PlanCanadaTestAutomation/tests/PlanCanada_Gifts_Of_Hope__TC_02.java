package org.PlanCanadaTestAutomation.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import org.PlanCanadaTestAutomation.pageObject.PlanCanada_Screen;

import org.PlanCanadaTestAutomation.baseClass.TestBase;
import org.PlanCanadaTestAutomation.utilities.ExtentReport;
import org.PlanCanadaTestAutomation.utilities.ReadPropertyFiles;

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
