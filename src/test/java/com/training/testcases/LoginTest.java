package com.training.testcases;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.w3c.dom.DOMConfiguration;

import com.training.base.BaseTest;
import com.training.log.Log;
import com.training.pages.LoginPage;
import com.training.utilities.PropertiesFile;
import com.training.utilities.ScreenshotUtility;



public class LoginTest extends BaseTest{
	
	LoginPage loginpage;
	 WebDriver driver;
	 PropertiesFile prop;
	 ScreenshotUtility screen = new ScreenshotUtility();
	
	 @BeforeMethod
	public void beforeMethod() {
		 driver = getDriver(); 
		prop = new PropertiesFile();
		 String url = prop.getproperties("url");
		 driver.get(url);
	      loginpage= new LoginPage(driver);
	      DOMConfigurator.configure("log4j.xml");
	}
	
	@Test(priority = 2)
	public void login_TC2() {
	//Sequence of steps
	 Log.startTestCase("Login Testcase Login to Salesforce");
	  String username = prop.getproperties("username");
      loginpage.enterintoUsername(username);
      Log.info("Successfully entered the username"+username);
      String password = prop.getproperties("password");
      loginpage.enterintoPassword(password);
      loginpage.clickLogin();
      System.out.println("Login succesful");
	}

	
	@Test(priority = 1)
	public void loginPagePassword_TC1() {
	//Sequence of steps
		Log.startTestCase("Login Testcase NoPassword");
	  String username = prop.getproperties("username");
      loginpage.enterintoUsername(username);
      loginpage.loginInToAppWithNoPassword();
      loginpage.clickLogin();
      Log.warn("Please enter your password.");
     // Log.endTestCase("Invalid Testcases");
      
    }
     @Test(priority = 3) 
	public void rememberme_TC3() throws InterruptedException {
    	 Log.startTestCase("Login Testcase Login to Salesforce");
   	  String username = prop.getproperties("username");
         loginpage.enterintoUsername(username);
         Log.info("Successfully entered the username"+username);
         String password = prop.getproperties("password");
         loginpage.enterintoPassword(password);
    	 loginpage.selectRemberMeCheckBox();
    	 loginpage.clickLogin();
    	 //Thread.sleep(2000);
    	 loginpage.gotoUserMenu();
    	 //Thread.sleep(2000);
    	 loginpage.Logout();
    	 //Thread.sleep(2000);
    	 Log.info("Usernmae displayed correctly");
    	 System.out.println("Username displayed correctly");
    	 
	}
	@Test(priority = 4)
	public void loginTestForgotPassword_TC4A() {
		Log.startTestCase("Login Testcae Forgot Password");
		String username=prop.getproperties("username");
		loginpage.loginIntoAppWithForgotPassword(username);
		System.out.println("Forgot Password");

	}
	
	@Test(priority = 5)
	public void loginTestWrongDetail_TC4B() {
		Log.startTestCase("Login Testcae Wrong Username and password");
		
		
		String username = prop.getproperties("WrongUsename");
	      loginpage.enterintoUsername(username);
	      Log.info("Successfully entered the username"+username);
	      String password = prop.getproperties("Wrongpassword");
	      loginpage.enterintoPassword(password);
	      loginpage.clickLogin();
	      System.out.println("Your login attempt has failed. The username or password may be incorrect, or your location or login time may be restricted.");
	}
	
	@AfterMethod
	public void teardown() {
		screen.takescreenshot(driver);
		close();
	}
	
}
