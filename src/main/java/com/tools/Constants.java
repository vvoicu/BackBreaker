package com.tools;

public class Constants {
	
	// WebDriver Browser type Constants
	public enum DRIVER_TYPE {
		FIREFOX, CHROME,
	};

	// //wait times
	public static final long WEBDRIVER_IMPLICIT_WAIT = 30;
	public static final long WAIT_TIME_LARGE_SEC = 40;
	
	public static final long WAIT_TIME_SMALL = 3000;
	public static final int PAGE_LOAD_MAX_RETRY = 20;
	public static final long WAIT_TIME_CONSTANT = 5000;

}
