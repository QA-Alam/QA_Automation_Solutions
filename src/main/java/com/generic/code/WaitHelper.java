package com.generic.code;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.usa.api.baseclass.Base_Class;

public class WaitHelper extends Base_Class{
	
	// This is call explicit wait
	public static void waitForElement(WebElement elem, int time) {
		WebDriverWait wait = new WebDriverWait (driver, time);
		wait.until(ExpectedConditions.elementToBeClickable(elem));
		
	}

}
