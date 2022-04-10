package com.usa.api.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_Class {
	public static WebDriver driver;

	
	// This setUp method will contains all the pre-request, Open a browser, maximize the browser 
	// delete the cookies, implicit wait, and enter the url,
	    public static void setUp() {  
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
}
