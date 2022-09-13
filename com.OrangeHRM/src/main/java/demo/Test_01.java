package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_01 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.yahoo.com/?YY=28789&order=down&sort=date&pos=0&.src=ym");
		String title = driver.getTitle();
		System.out.println(title);
		String currentURL = driver.getCurrentUrl();
		System.out.println(currentURL);
		String pageSouce = driver.getPageSource();
		// System.out.println(pageSouce);
		Point text = driver.findElement(By.xpath("//*[@for='persistent']")).getLocation();
		System.out.println(text);
		String attribute = driver.findElement(By.xpath("//*[@for='persistent']")).getAttribute("for");
		System.out.println(attribute);
		// driver.navigate().back();
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   boolean	 a =  true;

	}

}
