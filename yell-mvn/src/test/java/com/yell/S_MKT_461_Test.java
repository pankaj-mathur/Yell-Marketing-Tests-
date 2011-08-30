package com.yell;

public class S_MKT_461_Test extends CommonMethods
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

		selenium.click("//div[@class='cfct-dom-window-inner' and @id='cfct-popup-inner']/div[@class='cfct-popup cfct-add-module']/div[@class='cfct-popup-content' and position()=2]/ul[@class='cfct-module-list cfct-il cfct-clearfix' and @id='cfct-module-list']/li[@class='cfct-il-item' and position()=3]/a");

		doPause(10);
		
		selenium.highlight("//*[@id='DOMWindow']");
		
		selenium.windowFocus();
		
		
		selenium.type("//input[@id='yell_cm_module_generic_content_block-super_title']", "Test Super Title");
		selenium.select("//select[@id='yell_cm_module_generic_content_block-super_title_style']", "Blue");
		
		selenium.type("//input[@id='yell_cm_module_generic_content_block-title_1']", "Test Title");
		selenium.select("//select[@id='yell_cm_module_generic_content_block-title_style_1']", "Blue");
		
		selenium.type("//textarea[@id='yell_cm_module_generic_content_block-content_1']", "Test Content. Just for the purpose to test.");
		selenium.click("//div[@id='yell_cm_module_generic_content_block-post_image_1-image-select-items-list']/div/ul/li[2]/div/div");
		
		selenium.click("id=module-yell_cm_module_generic_content_block-submit");
		doPause(10);
		
		// Verify at frontend
		openYellHome();
		selenium.waitForPageToLoad("30000");
		
		assertTrue("Super Title Not Present",selenium.isTextPresent("Test Super Title"));
		assertTrue("Title Not Present",selenium.isTextPresent("Test Title"));
		assertTrue("Content Text Not Present",selenium.isTextPresent("Test Content. Just for the purpose to test."));
		assertTrue("Image Not Present",selenium.isElementPresent("src=http://yell-marketing.hmn.md/wp-content/uploads/cache/2011/08/featured2/1603638710.png"));
		
		// delete
		selenium.click("//div[@id='cfct-module-ef9438def07aa526e3a53f841fae2984']/dl/dd/a[2]");
		selenium.click("//div[2]/div[@id='cfct-delete-buttons']/button[@id='cfct-delete-module-confirm']");
			
		doPause(30);
		
	}
}
