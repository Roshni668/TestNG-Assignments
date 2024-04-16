package com.training.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.training.base.BasePage;

public class LoginPage extends BasePage{
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}


@FindBy(id="username")
WebElement username;

@FindBy(id="password")
WebElement password;

@FindBy(id="Login")
WebElement login;

@FindBy(id="error")
WebElement wrongPassword;

@FindBy(id="rememberUn")
WebElement rememberMe;

@FindBy(xpath="//a[@id='forgot_password_link']")
WebElement forgotpassword;

@FindBy(id = "un")
WebElement forgotUserName;

@FindBy(id = "//a[text()='Return to Login']")
WebElement returnToLoginButton;

@FindBy(id="userNavLabel")
WebElement myProfile;

@FindBy(xpath="//a[contains(text(),'Logout')]")
WebElement logout;


public void enterintoUsername(String strusername) {
	waitforElement(username);
	username.sendKeys(strusername);
	}

public void enterintoPassword(String strpassword) {
	password.sendKeys(strpassword);
	}
public void clickLogin() {
	login.click();
	}
public void selectRemberMeCheckBox() {
	rememberMe.click();
}
public void loginInToAppWithNoPassword() {
	password.clear();
}
public void gotoUserMenu() {
//	Actions action = new Actions(driver);
//	action.moveToElement(RoshniPatel).build().perform();
	myProfile.click();
	}
public void Logout() {
	logout.click();
}
public void loginIntoAppWithForgotPassword(String strusername) {
	waitforElement(username);
	username.sendKeys(strusername);
	forgotpassword.click();
}
public void loginIntoAppWithIncorrectDetail(String WrongUsename,String Wrongpassword) {
	username.sendKeys(WrongUsename);
	password.sendKeys(Wrongpassword);
}

public void loginIntoApp(WebDriver driver) {
	
	
}


}
