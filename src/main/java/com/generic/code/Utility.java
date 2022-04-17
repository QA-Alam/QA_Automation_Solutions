package com.generic.code;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.usa.api.baseclass.Base_Class;

public class Utility extends Base_Class{
	
	public static void getActionClick(WebElement elem) {
		Actions ac = new Actions(driver);
		ac.click(elem).build().perform();
	}
	
	public static void HoverOver(WebElement elem) {
		Actions ac = new Actions(driver);
		ac.moveToElement(elem).perform();
	}

}
