package handson;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_01 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Backup\\Automation_Sagar\\com.WebAutomation\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("www.google.com");

	}

}
