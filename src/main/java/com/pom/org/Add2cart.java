package com.pom.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Add2cart {
	
	public static WebDriver driver;
	
	
	
	@FindBy(xpath= "//i[@id='dimension-expander-icon-size_name']")
	
	private WebElement selectSize;
	
	@FindBy(xpath ="(//input[@name='2'])[2]")
	private WebElement Selectsize;
	
	@FindBy(xpath = "//i[@class='a-icon a-icon-cart']/following-sibling::input[1]")
	private WebElement Add2cart;

	public Add2cart(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	public WebElement getSelectSize() {
		return selectSize;
	}


	public WebElement getAdd2cart() {
		return Add2cart;
	}
	public WebElement getxl() {
		return Selectsize;
	}

}
