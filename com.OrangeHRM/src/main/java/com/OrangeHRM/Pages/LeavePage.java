package com.OrangeHRM.Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.OrangeHRM.CommonPage.CommonPage;

public class LeavePage extends CommonPage {

	// locator user name
	@FindBy(id = "txtUsername")
	WebElement un;
	// Password
	@FindBy(id = "txtPassword")
	WebElement pass;
	// login button
	@FindBy(id = "btnLogin")
	WebElement button;

	@FindBy(xpath = "//*[text()='Leave']")
	WebElement leavePage;

	@FindBy(xpath = "//*[@id='calFromDate']")
	WebElement fromDate;

	@FindBy(xpath = "//*[@id='calToDate']")
	WebElement ToDate;

	@FindBy(xpath = "//*[@class='ui-datepicker-month']/option")
	List<WebElement> month;

	@FindBy(xpath = "//*[@class='ui-datepicker-year']")
	WebElement year;

	@FindBy(xpath = "//*[@class='ui-datepicker-calendar']/tbody/tr/td")
	List<WebElement> date;

	@FindBy(xpath = "//*[@type='checkbox']")
	List<WebElement> checkbox;

	@FindBy(id = "btnSearch")
	WebElement search;

	public LeavePage() {

		PageFactory.initElements(driver, this);
	}

	public void login() {
		driver.get(prop.getProperty("url"));
		un.sendKeys(prop.getProperty("username"));
		pass.sendKeys(prop.getProperty("password"));
		button.click();
	}

	public void leave1() {

		leavePage.click();
	}

	public void search_leave() throws Exception {
		fromDate.clear();
		fromDate.sendKeys("2021-12-25");
		ToDate.clear();
		ToDate.click();
		// select
		for (int i = 0; i < month.size(); i++) {

			WebElement mon = month.get(i);
			String value = mon.getText();
			// System.out.println(value);
			if (value.equalsIgnoreCase("May")) {

				mon.click();
			}
			System.out.println(value);

			if (value.equalsIgnoreCase("Aug")) {

				break;
			}

		}

		Select yearValue = new Select(year);
		yearValue.selectByVisibleText("2022");

		for (int i = 0; i < date.size(); i++) {

			WebElement dateValue = date.get(i);
			String CurrentValue = dateValue.getText();
			if (CurrentValue.equalsIgnoreCase("15")) {

				dateValue.click();

			}

		}

		// select Check Box
		for (int i = 0; i < checkbox.size() - 1; i++) {

			WebElement checkBoxValue = checkbox.get(i);

			System.out.println(checkBoxValue);
			String Value = checkBoxValue.getAttribute("value");
			System.out.println(Value);

			if (checkBoxValue.isSelected()) {

				checkBoxValue.click();

			}

			if (Value.equalsIgnoreCase("-1")) {
				checkBoxValue.click();

			}

		}
		search.click();
		Thread.sleep(5000);
	}

}
