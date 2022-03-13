package com.usa.selenium.challenges;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumLoginTest {

	static WebDriver driver;

	public static void main(String[] args) {
		// Help with system.setProperty i have to add the location of the class
		// System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		// Instantiating driver object and launching browser
		// driver = new ChromeDriver();
		// driver is object of class, like chrome, firefox, safari, Internet explore,
		// opera etc..,

		// This is for fire fox driver
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		driver = new FirefoxDriver();

		// I can open a web-side help with driver . get method
		driver.get("https://www.zoopla.co.uk/");

		// How to maximize the browser
		driver.manage().window().maximize();

		driver.findElement(By.xpath("(//a[@data-testid='header-profile-sign-in'])[1]")).click();

		driver.findElement(By.id("input-email-address")).sendKeys("alammohammed79@gmail.com");

		driver.findElement(By.id("input-password")).sendKeys("SAYEDawan2008@");

		driver.findElement(By.xpath("//button[text()='Sign in']")).click();

		// How to close the browser
		// By driver.quit() & driver.close(); method

		// What is the deference between quit & close method
		// quit can closed the browser & server too
		// but close method only close the browser
		// other hand quit method some time dosn't support
		// IE browser but close method support IE browser to close

		// driver.quit();
		// driver.close();
	}
}
