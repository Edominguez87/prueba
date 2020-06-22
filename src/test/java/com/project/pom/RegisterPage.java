package com.project.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends Base {
	
	By registerPageMarca =  By.cssSelector("li:nth-of-type(1) > div > .srp-carousel-list__item-link > div");
	
   public RegisterPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
 

}
