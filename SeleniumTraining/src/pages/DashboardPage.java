package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashboardPage {
	
	WebDriver driver;
	
	//Constructor
	public DashboardPage (WebDriver driver) {
		this.driver =  driver;
	}
	
	//Validate the confirmation
	public String ValidateConfirmationPage() {
		//6.- Get confirmation
				WebElement  messageElement = driver.findElement(By.id("conf_message"));
				String message = messageElement.getText();
				System.out.println(message);
				
				return message;
				
	}
	
	
	//Change Password
	public void changePassword () {
		WebElement  messageElement = driver.findElement(By.linkText("Change_password:"));
		
		messageElement.click();
		System.out.println("You can change your password Here!");
	}

}
