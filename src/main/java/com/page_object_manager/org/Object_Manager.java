package com.page_object_manager.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.pom.org.Add2cart;
import com.pom.org.Addto_Cart_Page;
import com.pom.org.Click_fashion;
import com.pom.org.Click_shirt;
import com.pom.org.Delete_All_Selected_Product;
import com.pom.org.Fashion_Button;
import com.pom.org.Fashion_Button3;
import com.pom.org.Kids;
import com.pom.org.Quantity_addtocart;
import com.pom.org.Sarees;
import com.pom.org.Select_Sarees;
import com.pom.org.Select_shirt;
import com.pom.org.Tshirt;

public class Object_Manager {
	
public WebDriver driver;
	//vijay
	private Addto_Cart_Page ac;

	private Fashion_Button fb;
	
	private Sarees saree;
	
	private Select_Sarees ss;
	
	// mani
	private Fashion_Button3 fb3;
	
	private Kids kids;
	
	private Tshirt tshirt;
	
	private Quantity_addtocart ac3;
	
	private Delete_All_Selected_Product delete;
	
	//kannan
	
	
	private Add2cart Ad2C;
	
	
	

	private Click_shirt Clk_shirt;
	
	private Click_fashion Clk_fashion;
	
	private Select_shirt Slc_shirt;

	
	
	public Object_Manager(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	
	public Addto_Cart_Page getAc() {
		ac = new Addto_Cart_Page(driver);
		return ac;
	}

	public Fashion_Button getFb() {
		fb = new Fashion_Button(driver);
		return fb;
	}

	public Sarees getSaree() {
		saree = new Sarees(driver);
		return saree;
	}

	public Select_Sarees getSs() {
		ss = new Select_Sarees(driver);
		return ss;
	}
	
	//mani

	public Fashion_Button3 getfc3() {
		fb3 = new Fashion_Button3(driver);
		return fb3;
	}
	public Kids getkids() {
		kids = new Kids(driver);
		return kids;
	}
	public Tshirt gettshirt() {
		tshirt = new Tshirt(driver);
		return tshirt;
	}
	public Quantity_addtocart getaddct3() {
		ac3 = new Quantity_addtocart(driver);
		return ac3;
	}
	// kannan 
	public Add2cart getAd2C() {
		Ad2C = new Add2cart(driver);
	
		return Ad2C;
	}

	public Click_shirt getClk_shirt() {
		Clk_shirt = new Click_shirt(driver);
		return Clk_shirt;
	}

	public Click_fashion getClk_fashion() {
		Clk_fashion = new Click_fashion(driver);
		return Clk_fashion;
	}

	public Select_shirt getSlc_shirt() {
		Slc_shirt = new Select_shirt(driver);
		return Slc_shirt;
	}
	public Delete_All_Selected_Product getdelete() {
		delete = new Delete_All_Selected_Product(driver);
		return delete;
	}
	
}
