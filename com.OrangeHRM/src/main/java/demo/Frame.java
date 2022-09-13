package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
	
	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://classic.freecrm.com/index.html");
		driver.findElement(By.name("username")).sendKeys("sagarsahoo");
		driver.findElement(By.name("password")).sendKeys("sagarsahoo@1995");
		driver.findElement(By.xpath("//*[@value='Login']")).click();
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		
	}

}
