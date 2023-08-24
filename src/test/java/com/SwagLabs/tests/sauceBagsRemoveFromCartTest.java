package com.SwagLabs.tests;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.SwagLabs.basetest.basetest;
import com.SwagLabs.pages.homePage;
import com.SwagLabs.pages.loginPage;

public class sauceBagsRemoveFromCartTest extends basetest{
	
	@BeforeTest
	public void login() throws IOException, InterruptedException {
		openBrowser();
		openSwagLabsUrl();
		loginPage Loginpage = new loginPage();
		
		Loginpage.enterUsername();
		Loginpage.enterPassword();
		Loginpage.clickOnLoginBtn();
		
	}
	
	@Test
	public void sauceBagsRemoveFromCart() throws InterruptedException {
		
		homePage Homepage = new homePage();
		Homepage.clickOnRemoveCartForSauceBags();
		Homepage.clickOnMenuButton();
		Homepage.clickOnLogoutButton();
			
		
	}
	
	@AfterTest
	public void closingBrowserWindow() {
		quitBrowser();
		
	}

}
