package com.tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import com.tools.Constants.DRIVER_TYPE;
import com.tools.config.SeleniumDriver;

public class BaseTest {
	
	public WebDriver driver;
	
	@Before
	public void testSetup() {
		driver = SeleniumDriver.pickWebdriver(DRIVER_TYPE.FIREFOX);
	}
	
	@After
	public void closeBrowser(){
		driver.close();
		driver.quit();
	}

}
