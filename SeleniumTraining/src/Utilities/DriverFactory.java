package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {


	public static WebDriver open(String browserType){
		
		ChromeDriver driver;
		
		
		if (browserType.equalsIgnoreCase("chrome") ) {
			System.setProperty("webdriver.chrome.driver", "C:\\CodeJava\\Software\\chromedriver.exe");
			 driver = new ChromeDriver();
			System.out.println("Using Chrome Browser");
			
		}
		else if (browserType.equalsIgnoreCase ("fireFox")){
			System.setProperty("webdriver.chrome.driver", "C:\\CodeJava\\Software\\chromedriver.exe");
			 driver = new ChromeDriver();
		
		}else {
			System.setProperty("webdriver.chrome.driver", "C:\\CodeJava\\Software\\chromedriver.exe");
			 driver = new ChromeDriver();
		}
		return driver;
		
	}

}
