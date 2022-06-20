package com.pom.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Quantity_addtocart {
	public static  WebDriver driver;
	@FindBy(xpath = "(//input[@name='5'])[2]")
	private static WebElement Tsirtqty;
	
	@FindBy(xpath ="//input[@name='submit.add-to-cart'][@type='submit']")
	private static WebElement Addtocart;
	
	@FindBy(xpath="(//select[@name='quantity'])[3]")
	private static  WebElement qty;
	
	public Quantity_addtocart(WebDriver driver2) {

		this.driver =driver2;
		PageFactory.initElements(driver, this);
	}

	public static WebElement getage() {
		return Tsirtqty;
		
	}
	
	public static WebElement getAddtocart() {
		return Addtocart;
		
	}
	public static WebElement getqty() {
		return qty;
		
	}
	
	
	
	
	
	
	
	
	
}
