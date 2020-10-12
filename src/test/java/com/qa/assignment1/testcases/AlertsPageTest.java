package com.qa.assignment1.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.assignment1.base.TestBase;
import com.qa.assignment1.pages.AlertsPage;
import com.qa.assignment1.pages.RegisterPage;
import com.qa.assignment1.util.TestUtil;

public class AlertsPageTest extends TestBase{
	AlertsPage alertsPage;
	TestUtil testUtil;
	RegisterPage registerPage;
	
	public AlertsPageTest(){
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		
		alertsPage = new AlertsPage();
		testUtil = new TestUtil();
		registerPage = new RegisterPage();
		alertsPage = registerPage.navigateToAlertsPage();
	}
	
	@Test(priority = 1)
	public void alertPageTitleTest() {
		log.info("****************************** starting test case *****************************************");
		log.info("****************************** AlertsPageTitleTest *****************************************");
		String title = alertsPage.validateAlertsPageTitle();
		Assert.assertEquals(title, "Alerts");
		log.info("****************************** ending test case *****************************************");
		log.info("****************************** AlertsPageTitleTest *****************************************");
}
	@Test(priority=2, enabled = false)
	public void verifyAlertwithOKButtonTest() throws InterruptedException{
		alertsPage.AlertwithOKButton();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		log.info("****************************** Browser is closed *****************************************");
	}
}