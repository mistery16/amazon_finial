package com.pom.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fashion_Button {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//a[text()='Fashion']")
	private WebElement fashion;
	
	public Fashion_Button(WebDriver driver) {
        this.driver=driver;

    PageFactory.initElements(driver, this);
}

	public WebElement getFashion() {
		return fashion;
	}
	

}
