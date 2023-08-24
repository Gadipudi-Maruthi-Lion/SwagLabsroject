package com.SwagLabs.tests;

import java.io.IOException;

import com.SwagLabs.pages.loginPage;

public class swagLabsLogintest extends com.SwagLabs.basetest.basetest {
	

	public static void main(String[] args) throws IOException, InterruptedException {
		
		openBrowser();
		openSwagLabsUrl();
		loginPage Loginpage = new loginPage();
		
		Loginpage.enterUsername();
		Loginpage.enterPassword();
		Loginpage.clickOnLoginBtn();
		

	}

}
