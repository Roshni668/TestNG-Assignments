package com.training.testcases;

import java.io.IOException;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.base.BaseTest;
import com.training.log.Log;
import com.training.pages.LoginPage;
import com.training.pages.UserMenuPage;
import com.training.utilities.PropertiesFile;
import com.training.utilities.ScreenshotUtility;

public class UserMenuTest extends BaseTest{
	LoginPage loginpage;
	 WebDriver driver;
	 PropertiesFile prop;
	 UserMenuPage ump;
	// ScreenshotUtility screen = new ScreenshotUtility();
	 
	 @BeforeMethod
	public void beforeMethod() {
		 driver = getDriver(); 
		prop = new PropertiesFile();
		 String url = prop.getproperties("url");
		 driver.get(url);
	      loginpage= new LoginPage(driver);
	      String username = prop.getproperties("username");
	      loginpage.enterintoUsername(username);
	      String password = prop.getproperties("password");
	      loginpage.enterintoPassword(password);
	      loginpage.clickLogin();
	      DOMConfigurator.configure("log4j.xml");
	}

	 @Test
	 public void testUserMenuDropdown_TC5() {
//		 String username = prop.getproperties("username");
//	      loginpage.enterintoUsername(username);
//	      String password = prop.getproperties("password");
//	      loginpage.enterintoPassword(password);
//	      loginpage.clickLogin();
	      loginpage.gotoUserMenu();
	        boolean DropdownOptionsDisplayed = true;
	        Assert.assertTrue(DropdownOptionsDisplayed, "User menu not displayed");
	    }
	 
	 @Test 
		public void developerConsoleTest_TC8() throws InterruptedException, IOException {
			
			ump = new UserMenuPage(driver);
			ump.userMenu.click();
			Log.info("Selected developer console");
	 }

	 @Test
		public void logoutTest_TC9() throws InterruptedException, IOException {
			
			ump = new UserMenuPage(driver);
			ump.userMenu.click();
			Assert.assertTrue(ump.selectLogout(driver), "");
			Log.info("Selected logout");
		}


	@AfterMethod
	public void teardown() {
		//screen.takescreenshot(driver);
		close();
	}
		 
}
