package com.project.pom;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class Visit_Test {
	
	private WebDriver driver;
	VisitPage visitPage;

	@Before
	public void setUp() throws Exception {
		visitPage = new VisitPage(driver);
		driver = visitPage.chromeDriverConnection();
		visitPage.visit("https://www.ebay.com/");
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() {
 	// visitPage.registerPageMarca();
	}

}
