package com.OrangeHRM.CommonPage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class CommonPage {

	public static WebDriver driver;
	public static Properties prop;

	public CommonPage() {

		prop = new Properties();

		try {
			FileInputStream fis = new FileInputStream("./Utility\\config.properties");

			try {
				prop.load(fis);
			} catch (IOException e) {

				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

	}

	public  void initilization() {

		String browserName = prop.getProperty("browser");

		if (browserName.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		if (browserName.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.gecko.driver", "./Drivers\\geckodriver.exe");

			driver = new FirefoxDriver();

		}
		if (browserName.equalsIgnoreCase("IE")) {

			System.setProperty("webdriver.ie.driver", "/Drivers\\IEDriverServer.exe");

			driver = new InternetExplorerDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}

}
