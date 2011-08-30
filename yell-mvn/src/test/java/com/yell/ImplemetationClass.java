package com.yell;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;

import junit.framework.TestCase;

public class ImplemetationClass extends TestCase
{

	public static final String SERVER_HOST = "localhost";
	public static final int SERVER_PORT = 4444;
	public static final String BROWSER_IE = "*iexplore";
	public static final String BROWSER_IEHAT = "*iehta";
	public static final String BROWSER_FIREFOX = "*firefox";
	public static final String BROWSER_CHROME = "*chrome";
	public static final String BROWSER_SAFARI = "*safari";
	public static final String MAIN_URL = "http://yell:ah^arrde@yell-marketing.hmn.md/";
	public static final String BASE_URL = "http://yell:ah^arrde@yell-marketing.hmn.md/";
	public static final String HOME_URL = "http://yell-marketing.hmn.md/";

	public Selenium selenium = new DefaultSelenium(SERVER_HOST, SERVER_PORT, BROWSER_FIREFOX, MAIN_URL);

	public void setUp() throws Exception {
		selenium.start();
	}

	public void tearDown() throws Exception {
		selenium.stop();
	}

}
