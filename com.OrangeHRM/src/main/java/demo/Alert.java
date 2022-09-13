package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//*[contains(text(),' alert box:')]")).click();
		String s = driver.switchTo().alert().getText();
		System.out.println(s);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println(e);
			e.printStackTrace();
		}
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel')]")).click();

		driver.findElement(By.xpath("//button[contains(text(),'confirm box')]")).click();
		String st = driver.switchTo().alert().getText();
		System.out.println(st);
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'prompt box')]")).click();
		driver.switchTo().alert().accept();
		
		driver.findElement(By.tagName(""));
	}

}
