package com.pom.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fashion_Button3 {
	public static  WebDriver driver;
	@FindBy(xpath = "//a[text()='Fashion']")
	private static WebElement Fashion;
	
	public Fashion_Button3(WebDriver driver2) {

		this.driver =driver2;
		PageFactory.initElements(driver, this);
	}

	public static WebElement getfashion3() {
		return Fashion;
		
	}
}
