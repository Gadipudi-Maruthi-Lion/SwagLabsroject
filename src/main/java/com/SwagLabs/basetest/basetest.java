package com.SwagLabs.basetest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class basetest {
	
	public static WebDriver driver;
	
	public static Properties prop = new Properties();
	
	
	public static void openBrowser() throws IOException {
		FileInputStream ip = new FileInputStream("C:\\Users\\DELL\\Downloads\\SwagLabsProject\\src\\main\\java\\com\\SwagLabs\\properties\\config.properties");
		prop.load(ip);
		String newbrowser = prop.getProperty("browser");
		
	if(newbrowser.equals("chrome")) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver  = new ChromeDriver(options);	
		
	}else if(newbrowser.equals("firefox")) {
		System.setProperty("webdriver.firefox.driver", "C://FirefoxDriver.exe");
		driver = new FirefoxDriver();
		
	}else if(newbrowser.equals("IE")) {
		System.setProperty("webdriver.edge.driver", "C://EdgeDriver.exe");
		driver = new InternetExplorerDriver();
		
	}
	
	}	
	public static void openSwagLabsUrl() throws IOException {
		FileInputStream ip = new FileInputStream("C:\\Users\\DELL\\Downloads\\SwagLabsProject\\src\\main\\java\\com\\SwagLabs\\properties\\config.properties");
		prop.load(ip);		
		String url = prop.getProperty("url");
		driver.get(url);
	}
	
	public static void screenshot() {
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);	
	}
	
	public static void closeBrowser() {
		driver.close();
	}
	public static void quitBrowser() {
		driver.quit();
	}

	
	
}