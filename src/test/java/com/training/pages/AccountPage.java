package com.training.pages;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.training.base.BasePage;
import com.training.utilities.AccountFile;

public class AccountPage extends BasePage{

	public AccountPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(id="username")
	WebElement username;

	@FindBy(id="password")
	WebElement password;

	@FindBy(id="Login")
	WebElement login;
WebDriver driver;
@FindBy(id="Account_Tab")
public WebElement accountLink;  

@FindBy(xpath = "//*[@id=\"hotlist\"]/table/tbody/tr/td[2]/input")
public WebElement newAccountLink; 

@FindBy(xpath = "//input[@id='acc2']")
public WebElement newAccountName;

@FindBy(xpath = "//select[@id='acc6']")
public WebElement type;

@FindBy(xpath = "//*[@id=\"acc6\"]/option[7]")
public WebElement technologyPartner;

@FindBy(xpath = "//select[@id='00Nak0000011nPX']")
public WebElement customerPriority;

@FindBy(xpath = "//*[@id=\"00NHu00000PEd4F\"]/option[2]")
public WebElement customerPriorityHigh;

@FindBy(xpath = "//*[@id=\"bottomButtonRow\"]/input[2]")  
public WebElement saveAndNewButton;

@FindBy(xpath = "//a[contains(text(),'Create New View')]")
public WebElement creatNewView;

@FindBy(xpath="//input[@id='fname']")
public WebElement viewName;

@FindBy(xpath = "//*[@id=\"devname\"]")  
public WebElement viewUniqueName;

@FindBy(xpath = "//*[@id=\"editPage\"]/div[1]/table/tbody/tr/td[2]/input[1]")
public WebElement newViewSaveButton;

@FindBy(xpath = "//a[@href='/ui/list/FilterEditPage?id=00BHu00000FL5Yo&retURL=%2F001&cancelURL=%2F001%2Fo']")
public WebElement edit;

@FindBy(xpath = "//*[@id=\"fname\"]")
public WebElement editViewName;

@FindBy(xpath = "//*[@id=\"fcol1\"]")
public WebElement accountName;

@FindBy(xpath = "//*[@id=\"fcol1\"]/option[3]")
public WebElement field;

@FindBy(xpath = "//*[@id=\"fop1\"]")
public WebElement operator;

@FindBy(xpath = "//*[@id=\"fop1\"]/option[2]")
public WebElement operatorValue;

@FindBy(xpath = "//*[@id=\"fval1\"]")
public WebElement value;

@FindBy(xpath = "//*[@id=\"editPage\"]/div[3]/table/tbody/tr/td[2]/input[1]")
public WebElement editSaveButton;

@FindBy(xpath = "//*[@id=\"toolsContent\"]/tbody/tr/td[2]/div/div/div/ul/li[4]/span/a")
public WebElement mergeAccount;

@FindBy(xpath = "//*[@id=\"srch\"]")
public WebElement findAccountChar;

@FindBy(xpath = "//*[@id=\"stageForm\"]/div/div[2]/div[4]/input[2]")  
public WebElement findAccountButton;

@FindBy(xpath = "//*[@id=\"cid0\"]") 
public WebElement check1;

@FindBy(xpath = "//*[@id=\"cid1\"]") //a[contains(text(),'Accounts with last activity > 30 days')]
public WebElement check2;

@FindBy(xpath = "//*[@id=\"stageForm\"]/div/div[2]/div[5]/div/input[1]")
public WebElement nextMergeButton;

@FindBy(xpath = "//*[@id=\"stageForm\"]/div/div[2]/div[5]/div/input[2]") 
public WebElement mergeButton;

@FindBy(xpath = "//a[contains(text(),'Accounts with last activity > 30 days')]") 
public WebElement AccountsLastActivity;

@FindBy(xpath = "//*[@id=\"ext-gen148\"]") 
public WebElement dateField;

@FindBy(xpath = "//div[@class='x-combo-list-item x-combo-selected']") 
public WebElement createdDate;  

@FindBy(xpath = "//*[@id=\"ext-gen154\"]") 
public WebElement to;  

@FindBy(xpath = "//*[@id=\"ext-gen279\"]") 
public WebElement today;  

@FindBy(xpath = "//*[@id=\"ext-gen49\"]") 
public WebElement unsavedReportPageSaveButton;  

@FindBy(xpath = "//*[@id=\"saveReportDlg_reportNameField\"]") 
public WebElement reportName;  

@FindBy(xpath = "//*[@id=\"saveReportDlg_DeveloperName\"]") 
public WebElement reportUniqueName;

@FindBy(xpath = "//*[@id=\"ext-gen309\"]") 
public WebElement reportSaveButton; 

@FindBy(xpath = "//button[@id='ext-gen63']") 
public WebElement runReport; 

@FindBy (id="fcf")
WebElement viewdropdn;
Select select;
public boolean creatNewAccount(WebDriver driver) throws IOException, InterruptedException {
	boolean isCreatNewAccount = false;
	Actions action = new Actions(driver);
	action.moveToElement(newAccountLink).click().build().perform();
	newAccountName.sendKeys("naccountname");
	Thread.sleep(2000);
	type.click();
	Thread.sleep(1000);
	technologyPartner.click();
	customerPriority.click();
	Thread.sleep(1000);
	customerPriorityHigh.click();
	saveAndNewButton.click();
	isCreatNewAccount = true;
	
	return isCreatNewAccount;
}

	public void selectText(WebElement ele,String text) {
		select=new Select(ele);
		((Select) ele).selectByVisibleText(text);
	}
	
public void creatNewView(WebDriver driver) throws IOException, InterruptedException {
	
	Actions action = new Actions(driver);
	action.moveToElement(creatNewView).click().build().perform();
	Thread.sleep(2000);
	creatNewView.click();
	viewName.sendKeys("Patel");
	newViewSaveButton.click();
	}

public boolean clickEdit(WebDriver driver) throws IOException, InterruptedException {
	boolean isEdit = false;
	viewdropdn.click();
	Select name=new Select(viewdropdn);
	name.selectByVisibleText("Patel");
	
	Thread.sleep(2000);
	Actions action = new Actions(driver);
	action.moveToElement(edit).click().build().perform();
	
			editViewName.sendKeys("editViewName");
			accountName.click();
			field.click();
			operator.click();
			operatorValue.click();
			value.clear();
			value.sendKeys("value");
			editSaveButton.click();
			isEdit = true;
		return isEdit;
}

	public boolean clickMergeAccount(WebDriver driver) throws IOException, InterruptedException {
	boolean isMergeAccount = true;
			Actions action = new Actions(driver);
			action.moveToElement(mergeAccount).click().build().perform();
			findAccountChar.sendKeys("Roshni");
			findAccountButton.click();
			check1.click();
			check2.click();
			nextMergeButton.click();
			mergeButton.click();
			return isMergeAccount;
	}
	
	public void enterintoviewname(String viewName2) {
		viewName.sendKeys(viewName2);
		
	}




	
	


}

