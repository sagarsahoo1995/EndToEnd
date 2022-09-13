package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class Demo {

	WebDriver driver;

	/*
	 * public static void main(String[] args) {
	 * 
	 * System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
	 * WebDriver driver =new ChromeDriver();
	 * driver.get("https://opensource-demo.orangehrmlive.com/");
	 * 
	 * }
	 */
	//@BeforeMethod

	public void set() {
		/*
		 * System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		 * driver = new ChromeDriver();
		 */
		System.setProperty("webdriver.gecko.driver", "./Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();

	}

	//@Test
	public void a() {
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

}
