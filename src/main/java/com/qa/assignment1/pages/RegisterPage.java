package com.qa.assignment1.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.assignment1.base.TestBase;

public class RegisterPage extends TestBase{

	//Page Factory - OR:


	@FindBy(xpath = "//input[@placeholder='First Name']")
	WebElement fname;

	@FindBy(xpath = "//input[@placeholder='Last Name']")
	WebElement lname;

	@FindBy(xpath = "//textarea[@class='form-control ng-pristine ng-untouched ng-valid']")
	WebElement address;

	@FindBy(xpath = "//input[@type='email']")
	WebElement email;

	@FindBy(xpath = "//input[@type='tel']")
	WebElement phone;

	@FindBy(xpath = "//input[@value='Male']")
	WebElement male;

	@FindBy(xpath = "//input[@value='feMale']")
	WebElement female;

	@FindBy(xpath = "//input[@id='checkbox1']")
	WebElement cricket;


	@FindBy(xpath = "//a[contains(text(),'SwitchTo')]")
	WebElement switchtoMenu;

	@FindBy(xpath = "//a[contains(text(),'Alerts')]")
	WebElement alertsSubmenu;


	//Initializing the Page Objects

	public RegisterPage() {
		PageFactory.initElements(driver, this);
	}

	//Actions:
	public String validateRegisterPageTitle() {
		return driver.getTitle();
	}
	public AlertsPage navigateToAlertsPage() {
		switchtoMenu.click();
		alertsSubmenu.click();
		return new AlertsPage();
	}

	public void registerNewContact(String firstName, String lastName) {
		fname.sendKeys(firstName);
		lname.sendKeys(lastName);
	}
}
