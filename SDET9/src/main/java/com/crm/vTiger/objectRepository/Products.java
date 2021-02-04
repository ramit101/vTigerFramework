package com.crm.vTiger.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Products {
	@FindBy(xpath="//img[@title='Create Product...']")
	private WebElement crtProd;
	
	public	Products(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
		
		public void click_CreateProduct(){
			crtProd.click();
		}

}
