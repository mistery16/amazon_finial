package com.pom.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kids {
	public static  WebDriver driver;
	@FindBy(xpath = "//*[@id=\"nav-subnav\"]/a[4]/span[1]")
	private static WebElement kids;
	
	@FindBy(xpath ="//*[@id=\"nav-flyout-aj:https://images-eu.ssl-images-amazon.com/images/G/31/img16/wayfinding/json/subnavmay18.json:subnav-sl-megamenu-3:0\"]/div[2]/div/div[2]/ul/li[1]/a")
	private static WebElement tshirt;
	
	public Kids(WebDriver driver2) {

		this.driver =driver2;
		PageFactory.initElements(driver, this);
	}

	public static WebElement getKids() {
		return kids;
		
	}
	public static WebElement gettshirt() {
		return tshirt;
		
	}
}
