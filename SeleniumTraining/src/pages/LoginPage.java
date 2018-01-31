package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	WebDriver driver;
	 
	
	public void setUserName (String username) {
		
		WebElement  emailElement = driver.findElement(By.name("ctl00$MainContent$txtUserName"));
		//3.- enter email address
		emailElement .sendKeys(username);
		
	}
	
	public void serPassword(String password) {
		
		WebElement  passElement = driver.findElement(By.name("ctl00$MainContent$txtPassword"));
		//4.- Enter Password
				passElement.sendKeys(password);
	}

	
	public void clickSubmit() {
		WebElement  buttonLoginElement = driver.findElement(By.name("ctl00$MainContent$btnLogin")); 
		//5.- Click button
		buttonLoginElement.click();
	}
	
	//Constructor initializes the state of the driver
	public LoginPage (WebDriver driver) {
		this.driver = driver;
		
	}
	
}
