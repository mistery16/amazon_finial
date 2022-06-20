package com.pom.org;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Click_fashion {

	public static WebDriver driver;
	
	@FindBy(xpath = "(//a[@class='nav-a  '])[5]")
	private WebElement Fashion;
	
	public Click_fashion(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	public WebElement getFashion() {
		return Fashion;
	}
	
}
