package com.training.pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.training.base.BasePage;
import com.training.utilities.UserMenuPropertiFile;

public class UserMenuPage extends BasePage{

	public UserMenuPage(WebDriver driver) {
		super(driver);
	}
	//usermenu dropdown
	@FindBy(id="username")
	WebElement username;

	@FindBy(id="password")
	WebElement password;

	@FindBy(id="Login")
	WebElement login;
	
	@FindBy(id="userNavLabel")
	public WebElement userMenu;
	
	@FindBy(xpath = "//div[@id='userNav-menuItems']/a")
	WebElement userMenuOptions;
	
	
	 // My Profile
	@FindBy(xpath="//a[contains(text(),'My Profile')]")
	WebElement myProfile;
		
	@FindBy(xpath =  "//*[@id=\"chatterTab\"]/div[2]/div[2]/div[1]/h3/div/div/a/img")
		public WebElement editProfileButton;
		
		@FindBy(xpath = "//*[@id=\"contactInfoContent\"]")
		public WebElement editProfilePopWindow;
		
		@FindBy(xpath = "//*[@id=\"aboutTab\"]/a")
		public WebElement aboutTab;
		
		@FindBy(xpath = "//*[@id=\"contactTab\"]/a")
		public WebElement contactTab;
		
		@FindBy(xpath = "//*[@id=\"lastName\"]")
		public WebElement aboutTabLastName;
		
		@FindBy(xpath = "//*[@id=\"TabPanel\"]/div/div[2]/form/div/input[1]")
		public WebElement saveAllButton;
		
		@FindBy(xpath = "//*[@id=\"email\"]")
		public WebElement userProfilePageNameDisplay;
		
		// Developer Console
		@FindBy(xpath="//a[contains(text(),'Developer Console')]")
		WebElement developerconsole;
		
		//logout
		@FindBy(xpath="//a[@title='Logout']")
		WebElement Logout;
		
		// PostLink
		@FindBy(css = "#publishereditablearea")
		public WebElement postLink;
		
		@FindBy(xpath = "/html/body")
		public WebElement postTextArea;
		
		@FindBy(xpath = "//*[@id=\"publishersharebutton\"]")
		public WebElement shareButton;
		// FileLink
		@FindBy(id = "//*[@id=\"publisherAttachLinkPost\"]/span[1]")
		public WebElement fileLink;
		
		@FindBy(id = "//*[@id=\"publisherAttachLinkPost\"]/span[1]")
		public WebElement contentPost;

		@FindBy(css = "#chatterUploadFileAction")
		public WebElement uploadFile;
		
		@FindBy(css = "#chatterFile")
		public WebElement fileOpen;
		
		@FindBy(css = "#publishersharebutton")
		public WebElement publish;
		
		@FindBy(xpath = "//input[@value='Cancel Upload']")
		public WebElement cancelUpload;
		
		@FindBy(id = "uploadLink")
		public WebElement updateButton;
		
	   // Photo link
		@FindBy(xpath = "//*[@id=\"publisherAttachLinkPost\"]/span[1]")
		public WebElement photolink;
		
		@FindBy(id = "j_id0:uploadFileForm:uploadInputFile")
		public WebElement uploadPhoto;
		
		@FindBy(name = "j_id0:uploadFileForm:uploadBtn")
		public WebElement uploadButton;
		
		@FindBy(id = "publishersharebutton")
		public WebElement photoShareButton;
		
		@FindBy(id = "uploadPhotoContentId")
		public WebElement photoUploadIFrame;
		
		@FindBy(xpath = "//input[@id='j_id0:uploadFileForm:uploadBtn']")
		public WebElement photoSaveButton;
		
		@FindBy(xpath = "//input[@id='j_id0:j_id7:save']")
		public WebElement photoSaveButton2; 
		
	    // My Settings
	    // PersonalLink	
		@FindBy(xpath = "//*[@id=\"PersonalInfo_font\"]")  
		public WebElement personalLink;
		
		@FindBy(xpath = "//*[@id=\"LoginHistory_font\"]")
		public WebElement loginHistoryLink;
		
		@FindBy(xpath = "//a[contains(text(),'Download login history for last six months, includ')]")
		public WebElement loginHistoryDownload;
		
		@FindBy(id = "//*[@id=\"RelatedUserLoginHistoryList_body\"]/table")
		public WebElement loginDisplay;
		
		@FindBy(id = "contactInfoContactId")
		public WebElement iFrameAbotTab;
		
	    // Display & LayoutLinnk	
		@FindBy(xpath = "//*[@id=\"DisplayAndLayout_font\"]")
		public WebElement displayLayoutLink;
		
		@FindBy(xpath = "//span[@id='CustomizeTabs_font']")
		public WebElement customizedTab;
		
		@FindBy(xpath = "//*[@id=\"bottomButtonRow\"]/input[1]")
		public WebElement saveCustomizedTab;
		
		@FindBy(xpath = "//*[@id=\"p4\"]/option[9]")
		public WebElement customApp;
		
		@FindBy(xpath = "//*[@id=\"duel_select_0\"]")
		public WebElement availableTab;
		
		@FindBy(xpath = "//*[@id=\"duel_select_1\"]/option[2]")
		public WebElement chatter;
		
		@FindBy(xpath = "//*[@id=\"duel_select_0\"]/option[76]")
		public WebElement reports;
		
		@FindBy(id = "//*[@id=\"duel_select_0_right\"]/img")
		public WebElement add;
		
		@FindBy(xpath = "//*[@id=\"bottomButtonRow\"]/input[1]")
		public WebElement save;
		
		@FindBy(id = "tabBar")
		public WebElement tabList; 
		
		@FindBy(xpath = "//*[@id=\"userNav-menuItems\"]/a[2]")
		public WebElement MySetting;
		
	    // EmailLink
		
		@FindBy(xpath = "//*[@id=\"EmailSetup_font\"]")
		public WebElement emailLink;
		
		@FindBy(xpath = "//*[@id=\"EmailSettings_font\"]")
		public WebElement myEmailSetting;
		
		@FindBy(xpath = "//*[@id=\"sender_name\"]")
		public WebElement emailName;
		
		@FindBy(xpath = "//*[@id=\"sender_email\"]")
		public WebElement emailAddress;
		
		@FindBy(xpath = "//*[@id=\"auto_bcc1\"]")
		public WebElement bccRadioButton;
		
		@FindBy(xpath = "//*[@id=\"bottomButtonRow\"]/input[1]")
		public WebElement saveOnEmail;
		
	    // Calendar and Remainders	
		@FindBy(xpath = "//*[@id=\"CalendarAndReminders_font\"]")
		public WebElement calendarAndRemainders; 
		
		@FindBy(xpath = "//*[@id=\"Reminders_font\"]")
		public WebElement activityRemainder;
		
		@FindBy(xpath = "//*[@id=\"testbtn\"]")
		public WebElement openTestRemainder;
		
		@FindBy(xpath = "//*[@id=\"summary\"]")
		public WebElement sampleEventPopup;
		
		@FindBy(css = "#displayBadge")
		public WebElement moderatorButton; 
		
		@FindBy(id = "profileTab_sfdc.ProfilePlatformFeed")
		public WebElement profilePage;
		
//		@FindBy(id = "contactTab")
//		public WebElement contactTab;
		
		@FindBy(xpath = "//div[@class='cxfeeditem feeditem'][1]//p")
		public WebElement firstPostText;
		
		@FindBy(xpath = "(//*[@class='contentFileTitle'])[1]")
		public WebElement verifyFilePostElement;


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
	public void gotoUserMenu() {
		userMenu.click();
	}
	
	public boolean DropdownOptionsDisplayed() {
         return userMenuOptions.isDisplayed();
    }
	
	public boolean selectMySetting() {
		boolean isSelectMySetting = false;
		if(MySetting.isDisplayed()) {
			MySetting.click();
			isSelectMySetting = true;
		}
		System.out.println("My Setting selected");
		return isSelectMySetting;
	}
	
	public boolean isMySettingPageVisible() {
		return isDisplayed();
	}
	public void clickPersonal(WebDriver driver) {
		//if(CommonUtils.waitForElement(driver, personalLink)) {
			personalLink.click();
			System.out.println("pesonal link Selected");
		}
	
	private boolean isDisplayed() {
		// TODO Auto-generated method stub
		return false;
	}
//Developer Console method

		public void selectDeveloperConsole(WebDriver driver) throws InterruptedException, IOException {
			developerconsole.click();
			driver.quit();
		}
		
		// Logout
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
}
	

	
	
	

