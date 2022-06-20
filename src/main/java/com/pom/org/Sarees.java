package com.pom.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sarees {
	
	public WebDriver driver;
	
	@FindBy(xpath = "(//span[@class='nav-a-content'])[2]")
	private WebElement women;
	
	@FindBy(xpath = "//a[text()='Sarees']")
	private WebElement sarees;
	
	public Sarees(WebDriver driver) {
        this.driver=driver;

        PageFactory.initElements(driver, this);
	}

	public WebElement getWomen() {
		return women;
	}

	public WebElement getSarees() {
		return sarees;
	}

}
