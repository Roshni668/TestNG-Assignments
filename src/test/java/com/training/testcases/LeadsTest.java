package com.training.testcases;

import java.io.IOException;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.training.base.BaseTest;
import com.training.log.Log;
import com.training.pages.AccountPage;
import com.training.pages.LeadsPage;
import com.training.pages.LoginPage;
import com.training.utilities.PropertiesFile;
import com.training.utilities.ScreenshotUtility;

public class LeadsTest extends BaseTest{
	 WebDriver driver;
	 PropertiesFile prop;
	 ScreenshotUtility screen = new ScreenshotUtility();
	 LeadsPage lp;
	
	@BeforeClass
	public void navigateToHome() throws IOException, InterruptedException {
		{
			 driver = getDriver(); 
			prop = new PropertiesFile();
			 String url = prop.getproperties("url");
			 driver.get(url);
		      LoginPage loginpage = new LoginPage(driver);
		      String username = prop.getproperties("username");
		      loginpage.enterintoUsername(username);
		      String password = prop.getproperties("password");
		      loginpage.enterintoPassword(password);
		      loginpage.clickLogin();
		      DOMConfigurator.configure("log4j.xml");
		}
	}
	
	@Test (priority = 1)
	public void leads_TC20() throws IOException, InterruptedException {
		
		lp = new LeadsPage(driver);
		lp.leadsLink.click();
		Thread.sleep(3000);
	}
	@Test (priority = 2)
	public void dropdownVerifyTest_TC21() throws IOException, InterruptedException {
		
		System.out.println("Dropdown is verified");
		Log.info("Dropdown is verified");
	}
	@Test (priority = 3)
	public void dropdownVerifyTest_TC22() throws IOException, InterruptedException {
		
		lp = new LeadsPage(driver);
		lp.leadsLink.click();
		Thread.sleep(3000);
		Assert.assertTrue(lp.creatTodayLeads(driver), "");
		Log.info("Selected my unread leads");
		lp.selectLogout(driver);
		
	}


	@Test (priority = 4)
	public void todayLeadVerifyTest_TC23() throws IOException, InterruptedException {
		
		lp = new LeadsPage(driver);

		lp.leadsLink.click();
		Thread.sleep(3000);
		Assert.assertTrue(lp.todayLeadPage(driver), "");
		Log.info("Selected today lead page");
	}
	@Test (priority = 5)
	public void newLeadVerifyTest_TC24() throws IOException, InterruptedException {
		
		lp = new LeadsPage(driver);
		lp.leadsLink.click();
		Thread.sleep(3000);
		Assert.assertTrue(lp.creatNewLead(driver), "");
		Log.info("created new lead");
	}
	
@AfterMethod
	public void teardown() {
		//screen.takescreenshot(driver);
		close();
	}
}
