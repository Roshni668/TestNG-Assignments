package com.training.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.training.base.BasePage;

public class HomePage_SeleniumFirebasAppPage extends BasePage{
	

@FindBy(xpath="//a[text()='Home']")
WebElement hometab;

@FindBy(id="name")
WebElement Name;

@FindBy(id="lname")
WebElement FatherName;



public HomePage_SeleniumFirebasAppPage(WebDriver driver) {
	super(driver);
}

public void clickonHome() {
	waitforElement(hometab);
	hometab.click();
}

public void enterintoName(String strName) {
	Name.sendKeys(strName);
	
}

public void enterintoFatherName(String strFName) {
	
	FatherName.sendKeys(strFName);
}

}
