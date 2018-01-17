package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
 
public final class LogIn {

	public static void main(String[] args) {
		
		String email = "tim@testemail.com";
		String password = "trpass"; 
		String browserType = "chrome"; 
		
		//1.-Define Driver
		WebDriver driver;
		driver = utilities.DriverFactory.open(browserType);		
	
		//2.- Navigate to web application
		driver.get("http://sdettraining.com/trguitransactions/AccountManagement.aspx");
		
		//Define web elements
		
		WebElement  emailElement = driver.findElement(By.name("ctl00$MainContent$txtUserName"));
		WebElement  passElement = driver.findElement(By.name("ctl00$MainContent$txtPassword"));
		WebElement  buttonLoginElement = driver.findElement(By.name("ctl00$MainContent$btnLogin")); 
	
		String  pageTitleElement = driver.getTitle();
		
		
		//3.- enter email address
		emailElement .sendKeys(email);
		
		//4.- Enter Password
		passElement.sendKeys(password);
		
		//5,- Click Login
		buttonLoginElement.click();
		
		//6.- Get confirmation
		WebElement  messageElement = driver.findElement(By.id("conf_message"));
		String message = messageElement.getText();
		System.out.println(message);
		
		
		if (pageTitleElement.contains("SDET")){
			System.out.println(pageTitleElement);						
		}
				
		//7.- Close Browser
		driver.close();
		
	}

}
