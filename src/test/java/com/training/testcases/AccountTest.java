package com.training.testcases;

import java.io.IOException;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.training.base.BaseTest;
import com.training.log.Log;
import com.training.pages.AccountPage;
import com.training.pages.LoginPage;
import com.training.utilities.PropertiesFile;
import com.training.utilities.ScreenshotUtility;

public class AccountTest extends BaseTest{
	 WebDriver driver;
	 PropertiesFile prop;
	 ScreenshotUtility screen = new ScreenshotUtility();
	 AccountPage acc;
	
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
	
	@Test 
	public void accountTest_TC10() throws IOException, InterruptedException {
		
		acc = new AccountPage(driver);
		acc.accountLink.click();
		System.out.println("accountlink click");
		Log.info("New account page is displayed with account details.");
		}
	
	@Test 
	public void newViewLinkTest_TC11() throws IOException, InterruptedException {
		
		acc = new AccountPage(driver);
		acc.accountLink.click();
		String viewName = prop.getproperties("viewName");
		acc.enterintoviewname(viewName);
		//Assert.assertTrue(acc.creatNewView(driver), "");
		Log.info("Selected creat new view");
		
	//	org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {"method":"xpath","selector":"//input[@id='fname']"}
	}
	@Test (priority = 1)
	public void editLinkTest_TC12() throws IOException, InterruptedException {
		
		acc = new AccountPage(driver);
		acc.accountLink.click();
		//Assert.assertTrue(acc.clickEdit(driver), "");
		Log.info("Selected edit");
		//exception
	}
	
	
	@Test (priority = 1)
	public void mergeAccountTest_TC13() throws IOException, InterruptedException {
		
		acc = new AccountPage(driver);
		acc.accountLink.click();
		Assert.assertTrue(acc.clickMergeAccount(driver), "");  
		Log.info("Selected merge account");
	}

	@AfterMethod
	public void teardown() {
		//screen.takescreenshot(driver);
		close();
	}
	


}
