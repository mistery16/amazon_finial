package com.pom.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addto_Cart_Page {
	
	public WebDriver driver;
	
	@FindBy (xpath = "//span[@id='color_name_3']/ancestor::li/following-sibling::li[3]//input[@class='a-button-input']")
	private WebElement winecolour;
	
	@FindBy(xpath = "//input[@title='Add to Shopping Cart']")
	private WebElement Add_To_Cart;
	
	public Addto_Cart_Page(WebDriver driver) {
        this.driver=driver;

        PageFactory.initElements(driver, this);
	}

	public WebElement getWinecolour() {
		return winecolour;
	}

	public WebElement getAdd_To_Cart() {
		return Add_To_Cart;
	}

}
