package com.yell;

public class S_MKT_424_Test extends CommonMethods
{
	@Override
	public void setUp() throws Exception {
		super.setUp();
	}

	//Test for WP home page
	public void testWPHomePage() throws InterruptedException
	{
		selenium.open(BASE_URL);
		selenium.open(BASE_URL+"wp-admin");	
		
		selenium.type("//input[@id='user_login']",WP_USER);
		selenium.type("//input[@id='user_pass']",WP_PASSWORD);
		
		selenium.click("//input[@id='wp-submit']");
		selenium.waitForPageToLoad("30000");
		assertEquals("WP Home page is not being displayed","Dashboard ‹ Yell Marketing Site — WordPress", selenium.getTitle());
		
		selenium.click("//li[@id='menu-pages']/a");   //page link
		selenium.waitForPageToLoad("30000");
		
		selenium.click("//tr[@id='post-2']/td[1]/strong/a");  // edit home
		selenium.waitForPageToLoad("30000");
		
		selenium.click("//div[@id='cfct-sortables']/*/div/table/tbody/tr[2]/td/p/a");   //add module

		selenium.click("//div[@id='cfct-popup-inner']/div/div[2]/ul[@id='cfct-module-list']/li[4]/a/span/strong");

		selenium.waitForPopUp("id=DOMWindow", "30000");
		
		selenium.highlight("//*[@id='DOMWindow']");
		
		
		selenium.windowFocus();
		
		selenium.type("//input[@id='yell_cm_module_generic_content_block-super_title']", "Test Super Title");
		selenium.select("//select[@id='yell_cm_module_generic_content_block-super_title_style']", "Blue");
		
		selenium.type("//input[@id='yell_cm_module_generic_content_block-title_1']", "Test Title");
		selenium.select("//select[@id='yell_cm_module_generic_content_block-title_style_1']", "Blue");
		
		selenium.type("//textarea[@id='yell_cm_module_generic_content_block-content_1']", "Test Content. Just for the purpose to test.");
		
		
		
		Thread.sleep(400000);
		
	}

}
