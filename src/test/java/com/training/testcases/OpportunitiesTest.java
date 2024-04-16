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
import com.training.pages.OpportunitiesPage;
import com.training.pages.UserMenuPage;
import com.training.utilities.PropertiesFile;

public class OpportunitiesTest extends BaseTest{
	LoginPage loginpage;
	 WebDriver driver;
	 PropertiesFile prop;
	 OpportunitiesPage opp;
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
	 
	 @Test (priority = 1)
		public void opportunities_TC15() throws IOException, InterruptedException {
			
			opp = new OpportunitiesPage(driver);
			opp.opportunitiesLink.click();
			Thread.sleep(4000);
			System.out.println("Dropdown with Opportunities is displayed");         
			Log.info("Dropdown verified");
		}
	 @Test (priority = 2)
	 public void editOpportunitiesTest_TC16() throws IOException, InterruptedException {
			
			opp = new OpportunitiesPage(driver);
			opp.opportunitiesLink.click();
			Thread.sleep(4000);
			Assert.assertTrue(opp.creatNewOppertunity(driver), "");
			Log.info("created new oppertunity");
		}
	 @Test (priority = 3)
		public void pipelineTest_TC17() throws IOException, InterruptedException {
			
			opp = new OpportunitiesPage(driver);
			opp.opportunitiesLink.click();
			Thread.sleep(4000);
			Assert.assertTrue(opp.clickPipeline(driver), "");
			Log.info("Selected pipeline");
		}

	 @Test (priority = 4)
		public void stuckOppertunityLinkTest_TC18() throws IOException, InterruptedException {
			
			opp = new OpportunitiesPage(driver);
			opp.opportunitiesLink.click();
			Thread.sleep(4000);
			Assert.assertTrue(opp.clickStuckOppertunity(driver), "");
			Log.info("Selected stuck oppertunity");
		}
	 @Test (priority = 5)
		public void quarterlySummaryLinkTest_TC19() throws IOException, InterruptedException {
			
			opp = new OpportunitiesPage(driver);
			opp.opportunitiesLink.click();
			Thread.sleep(4000);
			Assert.assertTrue(opp.clickQuarterlySummary(driver), "");
			Log.info("Selected quarterly summary");
		}
			
	 @AfterMethod
		public void teardown() {
			//screen.takescreenshot(driver);
			close();
		}
}
