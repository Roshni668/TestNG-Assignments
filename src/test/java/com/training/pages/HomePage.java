package com.training.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.training.base.BasePage;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	WebDriver driver;
	
	@FindBy(id = "Home")
	public WebElement home;
	
	@FindBy(xpath = "//*[@id=\"ptBody\"]/div/div[2]/span[1]/h1/a")
	public WebElement firstLastNameLink;
	
	@FindBy(xpath = "//*[@id=\"AllTab_Tab\"]/a/img")
	public WebElement plusSign;
	
	@FindBy(xpath = "//*[@id=\"bodyCell\"]/div[3]/div[1]/table/tbody/tr/td[2]/input")
	public WebElement customizeTab;
	
	@FindBy(xpath = "//*[@id=\"duel_select_0\"]/option[2]")
	public WebElement appLauncherAvailableTabs;

	@FindBy(xpath = "//*[@id=\"duel_select_0_right\"]/img")
	public WebElement add;

	@FindBy(xpath = "//*[@id=\"bottomButtonRow\"]/input[1]")
	public WebElement save;
	
	@FindBy(xpath = "//*[@id=\"duel_select_1\"]/option[10]")
	public WebElement appLauncherSelectTabs;
	
	@FindBy(xpath = "//*[@id=\"duel_select_0_left\"]/img")
	public WebElement remove;
	
	@FindBy(xpath = "//*[@id=\"homeCalendarSection\"]/div/div[2]/table/tbody/tr/td[2]/div/div[2]/table/tbody/tr[4]/td[6]")
	public WebElement todayDate;
	
	@FindBy(className = "mCalendar")
	public WebElement calendarElement;
	
	@FindBy(tagName = "td")
	public List<WebElement> dateElements;
	
	@FindBy(xpath = "//*[@id=\"p:f:j_id25:j_id61:28:j_id64\"]/a")
	public WebElement pm8Link;
	
	@FindBy(xpath = "//*[@id=\"ep\"]/div[2]/div[4]/table/tbody/tr[2]/td[2]/div/a/img")
	public WebElement subjectComboIcon;
	
	@FindBy(xpath = "/html/body/div[2]/ul/li[5]/a")
	public WebElement other;
	
	@FindBy(xpath = "//*[@id=\"bottomButtonRow\"]/input[1]")
	public WebElement saveNewEvent;
	
	@FindBy(xpath = "//*[@id=\"p:f:j_id25:j_id61:20:j_id64\"]/a")
	public WebElement pm4Link;
	
	@FindBy(xpath = "//*[@id=\"EndDateTime_time\"]")
	public WebElement endDropdown;
	
	@FindBy(xpath = "//*[@id=\"timePickerItem_38\"]")
	public WebElement endTime;
	

}
