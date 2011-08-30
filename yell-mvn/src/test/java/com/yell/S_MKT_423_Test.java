/**
 * For this Feature the Test Scenarios are: 
	1. Check for the user if it can proceed to AUT after Login 
	2. Test for beadcrumbs 
	3. Test to navigate to "Home" page throught url and beardcrumbs 
	4. Test to navigate to "ProductPage" page throught url and beardcrumbs 
	5. Test to navigate to "SocialMedia" page throught url and beardcrumbs 
	6. Test to navigate to "WebDesignPage" page throught url and beardcrumbs 
	7. Test to navigate to "VideoMktPage" page throught url and beardcrumbs 
	8. Test to navigate to "ContactPage" page throught url and beardcrumbs 
 * **/
package com.yell;

public class S_MKT_423_Test extends CommonMethods
{
	@Override
	public void setUp() throws Exception {
		super.setUp();
	}

	//Test for home page
	public void testHomeProduct()
	{
		selenium.open(BASE_URL);
		assertEquals("Home page is not being displayed",HOME_URL, selenium.getLocation());
		assertTrue("Home page is not being displayed",selenium.getTitle().endsWith(YELL_APPLICATION_TITLE_HOME));
		assertTrue("Home page is not being displayed",selenium.getLocation().contains(HOME_URL));
	}
	
	//Test for product page
	public void testProductPage()
	{
		openYell_Product_Page();
		assertTrue("Product page is not being displayed",selenium.getTitle().endsWith(YELL_APPLICATION_TITLE_PRODUCT));
		assertTrue("Product page is not being displayed",selenium.getLocation().contains(PRODUCT_PAGE));
	}
	
	//Test for home page
	public void testSocialMediaPage()
	{
		openYellSocialMedia();
		assertTrue("Social media page is not being displayed",selenium.getTitle().endsWith(YELL_APPLICATION_TITLE_SOCIAL_MEDIA));
		assertTrue("Social media page is not being displayed",selenium.getLocation().contains(SOCIAL_MEDIA_PAGE));
	}
	
	//Test for WebDesign page
	public void testWebDesignPage()
	{
		openYellWebDesign();
		assertTrue("WebDesign page is not being displayed",selenium.getTitle().endsWith(YELL_APPLICATION_TITLE_WEBDESIGN));
		assertTrue("WebDesign page is not being displayed",selenium.getLocation().contains(WEB_DESIGN_PAGE));
	}
	
	//Test for VideoMkt page
	public void testVideoMktPage()
	{
		openYelltVideoMkt();
		assertTrue("VideoMkt page is not being displayed",selenium.getTitle().endsWith(YELL_APPLICATION_TITLE_VIDEO_MKT_PAGE));
		assertTrue("VideoMkt page is not being displayed",selenium.getLocation().contains(VIDEO_MKT_PAGE));
	}

	//Test for Contact page
	public void testContactPage()
	{
		openYellContact();
		assertTrue("Contact page is not being displayed",selenium.getTitle().endsWith(YELL_APPLICATION_TITLE_CONTACT));
		assertTrue("Contact page is not being displayed",selenium.getLocation().contains(CONTACT));
	}
	

	@Override
	public void tearDown() throws Exception {
		super.tearDown();
	}
	
}
