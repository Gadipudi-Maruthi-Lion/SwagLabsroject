package com.SwagLabs.pages;

import org.openqa.selenium.By;

import com.SwagLabs.basetest.basetest;

public class loginPage extends basetest {
	
	By username_textbox = By.xpath("//input[@id=\"user-name\"]");
	By password_textbox = By.xpath("//input[@id=\"password\"]");
	By login_btn = By.xpath("//input[@id=\"login-button\"]");
	
	
	public void enterUsername() {	
		driver.findElement(username_textbox).sendKeys(prop.getProperty("username"));
	}
	
	public void enterPassword() {
		driver.findElement(password_textbox).sendKeys(prop.getProperty("password"));
	}
	
	public void clickOnLoginBtn() throws InterruptedException {
		driver.findElement(login_btn).click();
		Thread.sleep(3000);
		String actUrl = driver.getCurrentUrl();
		String expUrl = "https://www.saucedemo.com/inventory.html";
		if(actUrl.equals(expUrl)) {
			System.out.println("User Logged into Swag Labs Successfully");
		}else {
			System.out.println("User Logged in is failed");
		}
		
	}
	

}
