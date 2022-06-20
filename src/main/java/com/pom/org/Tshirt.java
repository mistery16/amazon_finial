package com.pom.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tshirt {
	public static  WebDriver driver;
	@FindBy(xpath = "//div[@id='a-page']/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[2]/ul[1]/li[1]/span[1]/div[1]/a[1]/div[2]/div[2]/span[1]")
	private static WebElement marvel;
	
	
	
	public Tshirt(WebDriver driver2) {

		this.driver =driver2;
		PageFactory.initElements(driver, this);
	}

	public static WebElement getmarveltshirt() {
		return marvel;
		
	}
	
}
