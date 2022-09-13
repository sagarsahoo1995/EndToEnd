package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_paytm {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://paytm.com/");
		driver.findElement(By.xpath("//span[contains(text(),'Sign In')]")).click();
		

	}

}
