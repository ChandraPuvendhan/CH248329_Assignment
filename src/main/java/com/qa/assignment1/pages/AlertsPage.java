package com.qa.assignment1.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.assignment1.base.TestBase;

public class AlertsPage extends TestBase{
	
	//Page Factory - OR:
	
	@FindBy(xpath = "//a[@href='#OKTab']")
	WebElement okTab;
	
	@FindBy(xpath = "//button[@onclick='alertbox()']")
	WebElement alertboxBtn;
	
	@FindBy(xpath = "//a[contains(text(),'Alert with OK & Cancel')]")
	WebElement okCancel;
	
	@FindBy(xpath = "//button[@onclick='confirmbox()']")
	WebElement confirmboxBtn;
	
	@FindBy(xpath = "//p[@id='demo']")
	WebElement msgokCancel;
	
	@FindBy(xpath = "//a[contains(text(),'Alert with Textbox')]")
	WebElement textboxAlert;
	
	@FindBy(xpath = "//button[@class='btn btn-info']")
	WebElement promptboxBtn;
	
	@FindBy(xpath = "//p[@id='demo1']")
	WebElement msginputBox;
	
	//Initializing the Page Objects
	
	public AlertsPage() {
		PageFactory.initElements(driver, this);
	}

	//Actions:
	public String validateAlertsPageTitle() {
		return driver.getTitle();
	}

	public Alert switchToAlert() {
		return driver.switchTo().alert();
	}
	
	public void AlertwithOKButton() throws InterruptedException{
		driver.findElement(By.xpath("//*[@id='OKTab']/button")).click(); // click
        // on
        // the
        // button



driver.switchTo().alert().accept(); // this will close alert box by
// clicking OK button
//		okTab.click();
//		  try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//
//		  driver.switchTo().alert().accept();// this will close alert box by clicking OK button
//		String result = driver.findElement(By.id("result")).getText();
//		Assert.assertEquals(result, "You clicked: Ok");
	}
	
}
