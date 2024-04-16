package com.training.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.base.BaseTest;
import com.training.pages.HomePage_SeleniumFirebasAppPage;
import com.training.pages.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HomeTest_SeleniumFirebaseAppTest extends BaseTest{
	
	LoginPage loginpage;
	 WebDriver driver;
	 HomePage_SeleniumFirebasAppPage homepage;
	@BeforeMethod
	public void beforeMethod() {
		 driver = getDriver();
	      driver.get("https://selenium-prd.firebaseapp.com/");
	      loginpage= new LoginPage(driver);
	      homepage = new HomePage_SeleniumFirebasAppPage(driver);
	}
	
	
	/*  launch the browser
	 *  enter the url 
	 *  enter the username
	 *  enter the password
	 *  click login button
	 */
	@Test
	public void testfnamelastName() {
	//Sequence of steps
      loginpage.enterintoUsername("admin123@gmail.com");
      loginpage.enterintoPassword("admin123");
      loginpage.clickLogin();
      homepage.clickonHome();
      homepage.enterintoName("Jnanesh");
      homepage.enterintoFatherName("Mahadevaswamy");
      
      
	}
	
	
	public void testlastName() {
		//Sequence of steps
	      loginpage.enterintoUsername("admin123@gmail.com");
	      loginpage.enterintoPassword("admin123");
	      loginpage.clickLogin();
	      homepage.clickonHome();
	      homepage.enterintoFatherName("Mahadevaswamy");
	      
	      
		}

	@AfterMethod
	public void teardown() {
		
		close();
	}
	
}
