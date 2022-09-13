package com.OrangeHRM.TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.OrangeHRM.CommonPage.CommonPage;
import com.OrangeHRM.Pages.AdminPage;

public class AdminTestCase extends CommonPage {

	AdminPage admin;

	public AdminTestCase() {

		super();
	}

	@BeforeMethod

	public void setUp() {
		initilization();
		admin = new AdminPage();

		admin.login();

	}

	@Test(priority = 1, description = "Smoke Testing ")

	public void login_into_portal() {

		admin.admin();
	}

	@Test(priority = 2, groups = "Regression")
	public void to_verify_add_user() {
		login_into_portal();// call non static to non static method
		admin.addUser();

	}

	@Test(priority = 3, groups = "Regression")
	public void open_added_user() {
		login_into_portal();
		admin.openUser();

	}

	@Test(priority = 4)
	public void open_job() {
		admin.admin();
		admin.job();

	}

	@AfterMethod
	public void tearUp() {

		driver.quit();
	}

}
