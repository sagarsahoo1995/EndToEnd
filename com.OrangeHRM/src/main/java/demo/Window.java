package demo;

import java.util.HashSet;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Windows.html");
		driver.findElement(By.xpath("//*[text()='    click   ']")).click();
		System.out.println(driver.getTitle());
		Set<String> window = driver.getWindowHandles();
		String parent = driver.getWindowHandle();
		System.out.println("Parent Window: "+parent);

		for (String str : window) {

			System.out.println(str);

			String s = driver.switchTo().window(str).getTitle();
			System.out.println(s);
			if (s.equalsIgnoreCase("Frames & windows")) {

				driver.close();
			}

		}

	}

}
