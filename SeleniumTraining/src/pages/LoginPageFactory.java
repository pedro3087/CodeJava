package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactory {
	
	
	WebDriver driver;
	
	//Define Webelements at class level ----------------------------
	
	@FindBy (name = "ctl00$MainContent$txtUserName")
	WebElement userNameBox;
	
	@FindBy (name = "ctl00$MainContent$txtPassword")
	WebElement passElementBox;
	
	@FindBy (name = "ctl00$MainContent$btnLogin")
	WebElement loginElementButton;
	 
	
	
	//Steps - - - - - - - - - - - - - - - - - - - - - -
	public void setUserName (String username) {
		userNameBox.sendKeys(username);
		
	}
	
	public void serPassword(String password) {
		passElementBox.sendKeys(password);
	}
	
	public void clickSubmit() {
		loginElementButton.click();
	}
		
	//Actions - - - - - - - - - - - - - - - - - - - - - 
	public void logInAction(String username, String password) {
		setUserName(username);
		serPassword(password);
		clickSubmit();
	}
	
	
	//Constructor initializes the state of the driver
	public LoginPageFactory (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
