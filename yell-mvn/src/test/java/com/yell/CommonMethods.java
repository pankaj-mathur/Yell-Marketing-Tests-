/*
 * This CommonMethods class is to define all the Common Methods and variable used accoss this test project
 * 
 * */

package com.yell;

public class CommonMethods extends ImplemetationClass
{
	@Override
	public void setUp() throws Exception {
		// TODO Auto-generated method stub
		super.setUp();
	}

	@Override
	public void tearDown() throws Exception {
		// TODO Auto-generated method stub
		super.tearDown();
	}

	/* Yell WP Application site login credential*/
	public static final String WP_USER = "pankaj";
	public static final String WP_PASSWORD = "2pankajmathur";

	
	/*All the CONSTANT declared here will be used for accessing the Application or WP along with base URL*/

	/* Constant for PRODUCT_PAGE. */
	public static final String PRODUCT_PAGE = "products/";
	/* Constant for VIDEO_MKT_PAGE. */
	public static final String VIDEO_MKT_PAGE = "video-marketing/";
	/* Constant for WEB_DESIGN_PAGE. */
	public static final String WEB_DESIGN_PAGE = "web-design/";
	/* Constant for SOCIAL_MEDIA_PAGE. */
	public static final String SOCIAL_MEDIA_PAGE = "social-media/";
	/* Constant for CONTACT. */
	public static final String CONTACT = "contact/";
	/* Constant for BASIC CONTACT. */
	public static final String BASIC_CONTACT = "yellsites-basic-contact-us/";
	/* Constant for URL_WP. */
	public static final String THANKYOU = "yellsites-basic-thank-you/";
	/* Constant for URL_WP. */
	public static final String URL_WP = "wp-admin/";
	
	
	/* All the CONSTANT for the title text for landing pages*/
	public static final String YELL_APPLICATION_TITLE_HOME = "Home » Yell Marketing Site";
	public static final String YELL_APPLICATION_TITLE_PRODUCT = "» Products » Yell Marketing Site";
	public static final String YELL_APPLICATION_TITLE_VIDEO_MKT_PAGE = "Video Marketing";
	public static final String YELL_APPLICATION_TITLE_WEBDESIGN = "» Web Design » Yell Marketing Site";
	public static final String YELL_APPLICATION_TITLE_SOCIAL_MEDIA = "Yell Marketing Site » Strap-line goes here...";
	public static final String YELL_APPLICATION_TITLE_CONTACT = "» Contact » Yell Marketing Site";
	public static final String YELL_APPLICATION_TITLE_BASIC_CONTACT_US = "Contact us » Yell Marketing Site";
	public static final String YELL_APPLICATION_TITLE_THANKYOU = "Thank you! » Yell Marketing Site";

	
	/* Methos to access Yell Home page*/
	public void openYellHome()
	{
		selenium.open(BASE_URL);
	}
	
	/* Methos to access Yell PRODUCT_PAGE page*/
	public void openYell_Product_Page()
	{
		selenium.open(BASE_URL + PRODUCT_PAGE);
	}
	
	/* Methos to access Yell CONTACT page*/
	public void openYellContact()
	{
		selenium.open(BASE_URL + CONTACT);
	}
	
	/* Methos to access Yell VIDEO_MKT_PAGE page*/
	public void openYelltVideoMkt()
	{
		selenium.open(BASE_URL + VIDEO_MKT_PAGE);
	}
	
	/* Methos to access Yell WEB_DESIGN_PAGE page*/
	public void openYellWebDesign()
	{
		selenium.open(BASE_URL + WEB_DESIGN_PAGE);
	}
	
	/* Methos to access Yell SOCIAL_MEDIA_PAGE page*/
	public void openYellSocialMedia()
	{
		selenium.open(BASE_URL + SOCIAL_MEDIA_PAGE);
	}
	
	/* Methos to access Yell BASIC_CONTACT page*/
	public void openYellBasicContacUs()
	{
		selenium.open(BASE_URL + BASIC_CONTACT);
	}
	
	/* Methods to pause, parameter in seconds*/
	public static void doPause(int iTimeInSeconds)
	{
		long t0, t1;
		System.out.println("timer start");
		t0=System.currentTimeMillis( );
		t1=System.currentTimeMillis( )+(iTimeInSeconds*1000);

			do {
			t0=System.currentTimeMillis( );
			} while (t0 < t1);
	}
}