package com.project.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VisitPage extends Base {

	By registerPageBrand =  By.id("gh-ac");
	By typeBuscador = By.id("gh-btn");
	By orderPrice = By.cssSelector("li:nth-of-type(1) > div > .srp-carousel-list__item-link");
	By registerBrand = By.cssSelector("h1 > span:nth-of-type(2)");
	
	
	public VisitPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	 public void searchArticle() throws InterruptedException{
		 click(registerPageBrand);
		 Thread.sleep(2000);
		 type("Tenis Puma", registerPageBrand);
		 click(typeBuscador);
		 if(isDisplayed(registerBrand)) {
			 click(orderPrice);
			 
		 }else {
			 System.out.println("Register pages was not found");
		 }
	   }

}
