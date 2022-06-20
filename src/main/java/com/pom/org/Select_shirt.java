package com.pom.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_shirt {
	
	public static WebDriver driver;
	
	@FindBy(xpath = "//img[@src='https://m.media-amazon.com/images/I/71lIK53ke4S._AC_UL320_.jpg']")
	private WebElement selectshirt;
	
	public Select_shirt(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getSelectshirt() {
		return selectshirt;
	}

}
