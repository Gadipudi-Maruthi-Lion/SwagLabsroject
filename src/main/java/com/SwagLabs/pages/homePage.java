package com.SwagLabs.pages;

import org.openqa.selenium.By;

import com.SwagLabs.basetest.basetest;

public class homePage extends basetest{
	
	
	By menuBtn = By.xpath("//*[text()='Open Menu']");
	By logoutBtn = By.xpath("//*[text()='Logout']");
	
	By saucebagsAddToCart = By.xpath("//*[text()='Sauce Labs Backpack']//parent::a/parent::div/following-sibling::div/button[text()='Add to cart']");
	By saucebagsRemoveFromCart = By.xpath("//*[text()='Sauce Labs Backpack']//parent::a/parent::div/following-sibling::div/button[text()='Remove']");

	
	public void clickOnMenuButton() {
		driver.findElement(menuBtn).click();
	}
	
	public void clickOnLogoutButton() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(logoutBtn).click();
	}
	
	public void clickOnAddToCartForSauceBags() {
		driver.findElement(saucebagsAddToCart).click();
	}
	
	public void clickOnRemoveCartForSauceBags() {
		driver.findElement(saucebagsRemoveFromCart).click();
	}
	

}
