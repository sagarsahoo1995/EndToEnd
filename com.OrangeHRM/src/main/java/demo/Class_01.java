package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class_01 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		WebDriver	driver = new ChromeDriver();
	     driver.get("https://www.selenium.dev/documentation/webdriver/browser/alerts/");
	    // driver.navigate().to("https://www.selenium.dev/documentation/webdriver/browser/alerts/");
	     driver.navigate().back();
	     driver.close();
	    
	     

	}

}
