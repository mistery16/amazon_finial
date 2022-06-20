package com.pom.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Delete_All_Selected_Product {

	

	public static  WebDriver driver;
	@FindBy(xpath = "//a[@href='/gp/cart/view.html?ref_=sw_gtc']")
	private static WebElement gocart;
	
	@FindBy(xpath="(//input[@value='Delete'])[3]")
     private static WebElement 	menshirt;
	
	@FindBy(xpath="(//input[@value='Delete'])[2]")
    private static WebElement 	saree;
	
	

	@FindBy(xpath="(//input[@value='Delete'])[1]")
    private static WebElement 	kidtshirt;
	
	@FindBy(xpath="//a[@id='nav-logo-sprites']")
    private static WebElement 	Homebutton;
	public Delete_All_Selected_Product(WebDriver driver2) {

		this.driver =driver2;
		PageFactory.initElements(driver, this);
	}
	
	public static WebElement getGocart() {
		
		return gocart;
	}

	public static WebElement getMenshirt() {
		return menshirt;
	}

	public static WebElement getSaree() {
		return saree;
	}

	public static WebElement getKidtshirt() {
		return kidtshirt;
	}
	public static WebElement getHomebutton() {
		return Homebutton;
	}
}
