package demo;

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class RadioButton {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/insurance/v1/register.php");
		driver.manage().window().maximize();
		JavascriptExecutor js =  (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");
		
		// 1st way 
		// Create a list of all the radio button
		List<WebElement> drop = driver.findElements(By.xpath("//*[@name='licencetype']"));
		//Check the total number of radio button
		System.out.println(drop.size());
		drop.get(1).click();
		
		// 2nd Way
		WebElement year = driver.findElement(By.xpath("//*[@id='user_occupation_id']"));
		// introduce select class as constructor
		Select value = new Select(year);
		value.selectByIndex(5);
		Thread.sleep(3000);
		value.selectByValue("9");
		Thread.sleep(3000);
		value.selectByVisibleText("Teacher");
		
		//3rd way 
		List<WebElement> drop1 = driver.findElements(By.xpath("//*[@id='user_licenceperiod']/option"));
		for(int i =0; i<drop1.size();i++) {
			
			WebElement dropvalue = drop1.get(i);
			System.out.println(dropvalue);
			String value1 = dropvalue.getText();
			System.out.println(value1);
			if(value1.equalsIgnoreCase("6")) {
				dropvalue.click();
				
			}
			
		}
	}

}
