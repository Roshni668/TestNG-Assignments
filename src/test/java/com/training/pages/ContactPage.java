package com.training.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.training.base.BasePage;

public class ContactPage extends BasePage{
	public ContactPage(WebDriver driver) {
		super(driver);
		}

	@FindBy(xpath = "//*[@id=\"Contact_Tab\"]/a")
	public WebElement contactsLink;
	
	@FindBy(xpath = "//*[@id=\"hotlist\"]/table/tbody/tr/td[2]/input")
	public WebElement newButton;
	
	@FindBy(xpath = "//*[@id=\"name_lastcon2\"]")
	public WebElement lastName;
	
	@FindBy(xpath = "//*[@id=\"con4\"]")
	public WebElement accountName;
	
	@FindBy(xpath = "//*[@id=\"topButtonRow\"]/input[1]")
	public WebElement saveButton;

	@FindBy(xpath = "//*[@id=\"filter_element\"]/div/span/span[2]/a")
	public WebElement newViewLink;
	
	@FindBy(xpath = "//*[@id=\"fname\"]")
	public WebElement viewName;

	@FindBy(xpath = "//*[@id=\"devname\"]")
	public WebElement viewUniqueName;
	
	@FindBy(xpath = "//*[@id=\"editPage\"]/div[1]/table/tbody/tr/td[2]/input[1]")
	public WebElement viewUniqueSaveButton; 
	
	@FindBy(xpath = "//*[@id=\"fcf\"]")
	public WebElement viewDropdown; 
	
	@FindBy(xpath = "//*[@id=\"fcf\"]/option[9]")
	public WebElement recentlyCreated;
	
	@FindBy(xpath = "//*[@id=\"fcf\"]/option[5]")
	public WebElement myContacts;
	
	@FindBy(xpath = "//*[@id=\"bodyCell\"]/div[3]/div[1]/div/div[2]/table/tbody/tr[2]/th") 
	public WebElement  recentContactsName;
	
	@FindBy(xpath = "//*[@id=\"editPage\"]/div[1]/table/tbody/tr/td[2]/input[2]")
	public WebElement cancleButton;
	

}
