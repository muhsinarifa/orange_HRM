package com.it.bd.tests;

import com.it.bd.drivers.BaseDriver;
import com.it.bd.drivers.PageDriver;
import com.it.bd.pages.LoginPage;

public class LoginTest extends BaseDriver{
	
	public void openUrl() {
		PageDriver.getCurrentDriver().manage().window().maximize();
		PageDriver.getCurrentDriver().get(url);
	}
	
	public void loginTest() {
		LoginPage loginPage = new LoginPage();
		loginPage.login();
		
	}
}
