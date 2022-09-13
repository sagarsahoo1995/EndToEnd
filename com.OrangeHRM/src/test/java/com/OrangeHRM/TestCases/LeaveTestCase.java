package com.OrangeHRM.TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.OrangeHRM.CommonPage.CommonPage;
import com.OrangeHRM.Pages.LeavePage;

public class LeaveTestCase extends CommonPage {
	LeavePage leave;

	public LeaveTestCase() {

		super();

	}

	@BeforeMethod

	public void setUp() {
		initilization();
		leave = new LeavePage();
		leave.login();
	}

	@Test(priority = 1)
	public void click_on_leave() {

		leave.leave1();

	}

	@Test(priority = 2)
	public void to_verify_search() throws Exception {
		click_on_leave();
		leave.search_leave();

	}
	
	
	

	@AfterMethod
 
	public void tearUp() {

		driver.close();
	}
}
