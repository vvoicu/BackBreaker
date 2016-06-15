package com.tools.config;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.tools.Constants;

public class SeleniumDriver {

	public static WebDriver driver;

	/**
	 * Will trigger driver configuration based on a provided browserName. Will
	 * also set driver properties like timeouts and other props.
	 * 
	 * @param driverName
	 * @return 
	 */
	public static WebDriver pickWebdriver(Constants.DRIVER_TYPE driverName) {

		switch (driverName) {
			case FIREFOX :
				driver = new FirefoxDriver();
				break;
//			case CHROME :
//				setChromeProperties();
//				break;

			default :
				driver = new FirefoxDriver();
				break;
		}
		setDriverProperties();
		
		return driver;
	}

	/**
	 * Timeouts and other properties will be set here
	 */
	private static void setDriverProperties() {
		driver.manage().timeouts().implicitlyWait(Constants.WEBDRIVER_IMPLICIT_WAIT, TimeUnit.SECONDS);
	}
	
	public static void setChromeProperties() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Darko\\git\\SeleniumGaleon\\resources\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
//		options.addArguments("window-size=1024,768");

		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		driver = new ChromeDriver(capabilities);

	}

	/**
	 * Close and quit the driver when it will not be used anymore.
	 */
	public static void closeDriver() {
		driver.close();
		driver.quit();
	}

}
