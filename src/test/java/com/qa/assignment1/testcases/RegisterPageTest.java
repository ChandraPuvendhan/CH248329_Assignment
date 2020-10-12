package com.qa.assignment1.testcases;


	import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.assignment1.base.TestBase;
import com.qa.assignment1.pages.RegisterPage;
import com.qa.assignment1.util.TestUtil;

	public class RegisterPageTest extends TestBase{
		
		RegisterPage registerPage;
		TestUtil testUtil;
		String sheetName = "register";
		
		public RegisterPageTest(){
			super();
		}

		@BeforeMethod
		public void setUp() {
			initialization();
			log = Logger.getLogger(RegisterPageTest.class);
			testUtil = new TestUtil();
			registerPage = new RegisterPage();

		}
		
		@Test(priority = 1)
		public void registerPageTitleTest() {
			
			log.info("****************************** starting test case *****************************************");
			log.info("****************************** RegisterPageTitleTest *****************************************");
			String title = registerPage.validateRegisterPageTitle();
			Assert.assertEquals(title, "Register");
			log.info("****************************** ending test case *****************************************");
			log.info("****************************** RegisterPageTitleTest *****************************************");
		}
		

		
		@DataProvider
		public Object[][] getAssignment1TestData(){
			Object data[][] = TestUtil.getTestData(sheetName);
			return data;
		}
		
		@Test(priority=4, dataProvider="getAssignment1TestData")
		public void validateRegisterNewContact(String firstName, String lastName){

			registerPage.registerNewContact(firstName, lastName);
			
		}
		@AfterMethod
		public void tearDown() {
			/*
			 * close(): WebDriver’s close() method closes the web browser window that the user is currently working
on or we can also say the window that is being currently accessed by the WebDriver. The command
neither requires any parameter nor does is return any value.
quit(): Unlike close() method, quit() method closes down all the windows that the program has opened.
Same as close() method, the command neither requires any parameter nor does is return any value
			 */
			driver.quit();
			log.info("****************************** Browser is closed *****************************************");
		}
	}
