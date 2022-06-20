package com.pom.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Click_shirt {
	
	public static WebDriver driver;
	
	
	@FindBy(xpath = "(//span[@class='nav-a-content'])[3]")
	private WebElement men ;
	
	@FindBy(xpath = "//a[@href='/s/ref=mega_sv_s23_2_1_1_3?rh=i%3Aapparel%2Cn%3A1571271031%2Cn%3A!1571272031%2Cn%3A1968024031%2Cn%3A1968093031&ie=UTF8&lo=apparel']")
	private WebElement Shirt;

	
	public Click_shirt(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getMen() {
		return men;
	}

	public WebElement getShirt() {
		return Shirt;
	}
	
	
	
	
	
}
