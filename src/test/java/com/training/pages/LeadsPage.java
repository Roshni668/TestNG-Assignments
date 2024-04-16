package com.training.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.training.base.BasePage;

public class LeadsPage extends BasePage{
	
	public LeadsPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(id="username")
	WebElement username;

	@FindBy(id="password")
	WebElement password;

	@FindBy(id="Login")
	WebElement login;

WebDriver driver;
@FindBy(xpath = "//*[@id=\"Lead_Tab\"]/a")
public WebElement leadsLink;

@FindBy(xpath = "//*[@id=\"hotlist_mode\"]")
public WebElement RecentLeadsDropdown;

@FindBy(xpath = "//*[@id=\"hotlist_mode\"]/option[2]")
public WebElement unreadLeads;

@FindBy(xpath = "//*[@id=\"fcf\"]/option[4]")
public WebElement todayLeds;

@FindBy(xpath = "//*[@id=\"filter_element\"]/div/span/span[1]/input")
public WebElement goButton;

@FindBy(xpath = "//*[@id=\"hotlist\"]/table/tbody/tr/td[2]/input")
public WebElement newButton;

@FindBy(xpath = "//*[@id=\"name_lastlea2\"]")
public WebElement lastName;

@FindBy(xpath = "//*[@id=\"lea3\"]")
public WebElement companyName;

@FindBy(xpath = "//*[@id=\"topButtonRow\"]/input[1]")
public WebElement saveButton;

@FindBy(xpath = "//*[@id=\"fcf\"]")
public WebElement viewDropdown;

@FindBy(xpath="//a[@title='Logout']")
WebElement Logout;

public boolean creatTodayLeads(WebDriver driver) throws InterruptedException {
	boolean isViewSelected = false;
	Actions action = new Actions(driver);
	if(RecentLeadsDropdown.isDisplayed()) {
		action.moveToElement(RecentLeadsDropdown).click().build().perform();
		unreadLeads.click();
		Thread.sleep(2000);
		isViewSelected = true;
	}
	return isViewSelected;
	}
public boolean goVerify(WebDriver driver) throws InterruptedException {
	boolean isGoSelected = false;
	Actions action = new Actions(driver);
	if(goButton.isDisplayed()) {
		action.moveToElement(goButton).click().build().perform();
		Thread.sleep(1000);
		isGoSelected = true;
	}
	return isGoSelected;
}

//public boolean sessionVerify(WebDriver driver) {
//	boolean isVerified = false;
//	return isVerified;
//	
//}
public boolean todayLeadPage(WebDriver driver) throws InterruptedException {
	boolean isTodayLeadPage = false;
	Actions action = new Actions(driver);
	if(viewDropdown.isDisplayed()) {
		action.moveToElement(viewDropdown).click().build().perform();
		todayLeds.click();
		Thread.sleep(1000);
		goButton.click();
		
		isTodayLeadPage = true;
	}
	return isTodayLeadPage;
}
public boolean selectLogout(WebDriver driver) {
	LoginPage lp = new LoginPage(driver);
	boolean isSelectLogout = false;
	if(Logout.isDisplayed()) {
		Logout.click();
		lp.loginIntoApp(driver);
		isSelectLogout = true;
	}
	System.out.println("Logout");
	return isSelectLogout;
		}


public boolean creatNewLead(WebDriver driver) throws InterruptedException, IOException {
		boolean isCreatNewLead = false;
		Actions action = new Actions(driver);
		if(newButton.isDisplayed()) {
			action.moveToElement(newButton).click().build().perform();
			lastName.sendKeys("ABCD");
			companyName.sendKeys("ABCD");
			saveButton.click();
			isCreatNewLead = true;
		}
		return isCreatNewLead;
}







}
