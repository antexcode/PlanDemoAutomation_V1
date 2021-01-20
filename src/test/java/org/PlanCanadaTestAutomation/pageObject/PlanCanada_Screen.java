package org.PlanCanadaTestAutomation.pageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;

import org.PlanCanadaTestAutomation.baseClass.TestBase;
import org.PlanCanadaTestAutomation.locators.Locators.planCanadaLocators;
import org.PlanCanadaTestAutomation.utilities.ExtentReport;
import org.PlanCanadaTestAutomation.utilities.ScreenCaptureUtilies;

public class PlanCanada_Screen extends TestBase implements planCanadaLocators {

	Actions action = new Actions(driver);

	// All Locators from PlanCanada Screen Locators
	@FindBy(xpath = GOOGLE_SEARCH_TEXT_BOX)
	WebElement googleSearchTextBox_field;
	@FindBy(xpath = DONATE_NAV)
	WebElement donateDev_field;
	@FindBy(xpath = GIFTS_OF_HOPE)
	WebElement giftsOfHope_field;
	@FindBy(xpath = ADD_TO_CART_SCHOOL_MEALS_BUTTON)
	WebElement addToCartSchoolMealsButton_field;
	@FindBy(xpath = CHECKOUT_BUTTON)
	WebElement checkOutButton_field;
	@FindBy(xpath = CHECKOUT_AS_GUEST_BUTTON)
	WebElement checkOutAsGuestButton_field;
	@FindBy(xpath = CHECKOUT_AS_GUEST_EMAIL)
	WebElement checkOutAsGuestEmail_field;
	@FindBy(xpath = SELECT_DELIVERY_METHOD_DROPDOWN)
	WebElement selectDeliveryMethodDropdown_field;
	@FindBy(xpath = DELIVERY_METHOD_NO_CARD)
	WebElement deliveryMethodNoCard_field;
	@FindBy(xpath = PROCEED_TO_PAYMENT_BUTTON)
	WebElement proceedToPaymentButton_field;

	public PlanCanada_Screen() {
		PageFactory.initElements(driver, this);
	}

	// Search and Go to Plan Canada WebSite
	public void goToPlanCanada(String keysToSend) {
		googleSearchTextBox_field.sendKeys(keysToSend);
		ScreenCaptureUtilies.captureScreenshot(driver, "Search Plan Canada in Google");
		driver.manage().timeouts().implicitlyWait(55, TimeUnit.SECONDS);
		googleSearchTextBox_field.sendKeys(Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(55, TimeUnit.SECONDS);
		ScreenCaptureUtilies.captureScreenshot(driver, "Open Plan Canada Website");
		driver.get("https://plancanada.ca/");
		driver.manage().timeouts().implicitlyWait(55, TimeUnit.SECONDS);
		ScreenCaptureUtilies.captureScreenshot(driver, "Plan Canada Home Page");
		ExtentReport.logStat(Status.PASS, "Successfully Navigate To Plan Canada Website !!!");
	}

	// Navigate To Gifts Of Hope
	public void goToGiftsOfHope() {
		action.moveToElement(donateDev_field).perform();
		ScreenCaptureUtilies.captureScreenshot(driver, "Donate Dropdown");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		giftsOfHope_field.click();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		ScreenCaptureUtilies.captureScreenshot(driver, "GIFTS OF HOPE Page");
		ExtentReport.logStat(Status.PASS, "Successfully Navigate To Gifts Of Hope Page !!!");
	}

	// Add to Cart for School Meals
	public void addToCartSchoolMeals() {
		addToCartSchoolMealsButton_field.click();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		ScreenCaptureUtilies.captureScreenshot(driver, "Shopping Card Popup");
		ExtentReport.logStat(Status.PASS, "Successfully Add To Cart School Meals !!!");
	}

	// Checkout items
	public void checkoutItem(String guestEmail) {
		checkOutButton_field.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		ScreenCaptureUtilies.captureScreenshot(driver, "Checkout As Guest Screen");
		checkOutAsGuestEmail_field.sendKeys(guestEmail);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		checkOutAsGuestButton_field.click();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		ScreenCaptureUtilies.captureScreenshot(driver, "Customise your cards screen");
		ExtentReport.logStat(Status.PASS, "Successfully Checkout the items !!!");
	}

	// Customise your cards
	public void customiseYourCard() {
		selectDeliveryMethodDropdown_field.click();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		ScreenCaptureUtilies.captureScreenshot(driver, "Select Delivery Method Dropdown");
		deliveryMethodNoCard_field.click();
		ExtentReport.logStat(Status.PASS, "Successfully display Proceed To Payment button !!!");
	}
}
