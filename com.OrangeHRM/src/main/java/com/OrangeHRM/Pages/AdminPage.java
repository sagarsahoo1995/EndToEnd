package com.OrangeHRM.Pages;

import java.util.*;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.OrangeHRM.CommonPage.CommonPage;

public class AdminPage extends CommonPage {

	// locator user name
	@FindBy(id = "txtUsername")
	WebElement un;
	// Password
	@FindBy(id = "txtPassword")
	WebElement pass;
	// login button
	@FindBy(id = "btnLogin")
	WebElement button;

	// Admin Tab

	@FindBy(xpath = "//b[contains(text(),'Admin')]")
	WebElement admin;
	

	@FindBy(css = "#btnAdd")
	WebElement addButton;

	@FindBy(xpath = "//*[@id='systemUser_userType']/option")
	List<WebElement> userROle;

	@FindBy(name = "systemUser[employeeName][empName]")
	WebElement eName;

	@FindBy(id = "systemUser_userName")
	WebElement uName;

	@FindBy(xpath = "//*[@id='systemUser_status']")
	WebElement status;

	@FindBy(id = "systemUser_password")
	WebElement Password;

	@FindBy(xpath = "//input[contains(@id,'systemUser_co')]")
	WebElement cPassword;

	@FindBy(css = "#btnSave")
	WebElement saveButton;

	@FindBy(xpath = "//*[@id='resultTable']/tbody/tr/td[2]/a")
	List<WebElement> webTable;

	@FindBy(id = "btnCancel")
	WebElement cancel;

	@FindBy(xpath = "//*[@id='menu_admin_Job']")
	WebElement job;

	@FindBy(xpath = "//*[@class='selected']/ul/li/a")
	List<WebElement> jobSelect;

	@FindBy(id = "menu_admin_viewPayGrades")
	WebElement selectJob;

// initiate page factory
	public AdminPage() {

		PageFactory.initElements(driver, this);

	}

	public void login() {
		driver.get(prop.getProperty("url"));
		un.sendKeys(prop.getProperty("username"));
		pass.sendKeys(prop.getProperty("password"));
		button.click();
	}

	public void admin() {

		admin.click();
	}

	public void addUser() {
		addButton.click();
		for (int i = 0; i < userROle.size(); i++) {
			WebElement drop = userROle.get(i);
			String values = drop.getText();
			System.out.println(values);

			if (values.equalsIgnoreCase("ESS")) {
				drop.click();

			}
			eName.clear();
			eName.sendKeys("Bob Dole");
			uName.clear();
			String userName = "Sagar" + new Random().nextInt(1000);
			uName.sendKeys(userName);

			// Handle Drop-down using select class

			Select d1 = new Select(status);

			d1.selectByVisibleText("Disabled");

			Password.sendKeys("1234");
			cPassword.sendKeys("1234");
			saveButton.click();

		}

	}

	public void openUser() {

		for (int i = 0; i < webTable.size(); i++) {
			WebElement table = webTable.get(i);

			String values = table.getText();
			// JavascriptExecutor js = (JavascriptExecutor) driver;
			// js.executeScript("window.scrollBy(0,400)");
			// System.out.println(values);

			if (values.equalsIgnoreCase("Admin")) {

				table.click();

			}
			//cancel.click();

		}

	}

	public void job() {

		Actions action = new Actions(driver);
		action.moveToElement(job).build().perform();
		selectJob.click();

		/*
		 * for (int i = 0; i < jobSelect.size(); i++) {
		 * 
		 * WebElement we = jobSelect.get(i); String values = we.getText();
		 * System.out.println(values);
		 * 
		 * if (values.equalsIgnoreCase("Pay Grades")) { we.click();
		 * 
		 * }
		 * 
		 * }
		 */

	}

}
