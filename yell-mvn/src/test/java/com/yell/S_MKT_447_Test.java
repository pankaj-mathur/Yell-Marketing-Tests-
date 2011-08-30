package com.yell;



public class S_MKT_447_Test extends CommonMethods
{

	private static final String ERROR_MSG = "There was a problem with your submission. Errors have been highlighted below.";
	private static final String ERROR_MSG_MANDATORY = "This field is required.";
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

	// Test for Form page
	public void testFormPageDisplayed()
	{
		selenium.open(BASE_URL);
		assertEquals("Home page is not being displayed",HOME_URL, selenium.getLocation());	
		openYellBasicContacUs();
		assertTrue(selenium.getTitle().endsWith(YELL_APPLICATION_TITLE_BASIC_CONTACT_US));
	}
	
	// Test for Form template
	public void testFormTemplate()
	{
		openYellBasicContacUs();
		assertTrue("Checkbox not present",selenium.isElementPresent("class=gfield_checkbox"));
		assertTrue("Text Area not present",selenium.isElementPresent("class=textarea medium"));
		assertTrue("Mandtory Name Field not present",selenium.isElementPresent("//li[@class='gfield               gfield_contains_required' and @id='field_2_3']"));
		assertTrue("Input for Name not present",selenium.isElementPresent("//input[@id='input_2_3_3']"));
		assertTrue("Input for Email not present",selenium.isElementPresent("//input[@id='input_2_4']"));
		assertTrue("Input for Name not present",selenium.isElementPresent("//input[@id='input_2_3_3']"));
		assertTrue("Input for Name not present",selenium.isElementPresent("//input[@id='input_2_3_3']"));
		assertTrue("Submit  button not present",selenium.isElementPresent("id=gform_submit_button_2"));		
	}	
	
	// Test for PhoneNumField
	public void testPhoneNumFieldToggle()
	{
		openYellBasicContacUs();
		selenium.click("id=choice_1_1");
		assertTrue("Input for Phone Number not present",selenium.isElementPresent("//input[@id='input_2_5']"));
		selenium.click("id=choice_1_1");
		assertFalse("Input for Phone Number not present",selenium.isVisible("//input[@id='input_2_5']"));		
	}	
	
	// Test for Thankyou page
	public void testForThankYouPageCond1()
	{
		openYellBasicContacUs();
		selenium.click("id=choice_1_1");
		selenium.type("input_2_2", "Paragraph Text");
		selenium.type("input_2_3_3", "FName");
		selenium.type("input_2_3_6", "LName");
		selenium.type("input_2_4", "test@yell.com");
		selenium.type("input_2_4_2", "test@yell.com");
		selenium.type("input_2_5", "07606061916");
		selenium.click("id=gform_submit_button_2");
		doPause(10);
		assertTrue("Thankyou page is not being displayed",selenium.getTitle().endsWith(YELL_APPLICATION_TITLE_THANKYOU));
		assertTrue("Thankyou page is not being displayed",selenium.getLocation().contains(THANKYOU));
	}	
	
	// Test for Thankyou page
	public void testForThankYouPageCond2()
	{
		openYellBasicContacUs();
		selenium.click("id=choice_1_1");
		selenium.click("id=choice_1_2");
		selenium.type("input_2_2", "Paragraph Text");
		selenium.type("input_2_3_3", "FName");
		selenium.type("input_2_3_6", "LName");
		selenium.type("input_2_4", "test@yell.com");
		selenium.type("input_2_4_2", "test@yell.com");
		selenium.type("input_2_5", "07606061916");
		selenium.click("id=gform_submit_button_2");
		doPause(10);
		assertTrue("Thankyou page is not being displayed",selenium.getTitle().endsWith(YELL_APPLICATION_TITLE_THANKYOU));
		assertTrue("Thankyou page is not being displayed",selenium.getLocation().contains(THANKYOU));
	}
	
	// Test for Thankyou page
	public void testForThankYouPageCond3()
	{
		openYellBasicContacUs();
		selenium.click("id=choice_1_4");
		selenium.type("input_2_2", "Paragraph Text");
		selenium.type("input_2_3_3", "FName");
		selenium.type("input_2_3_6", "LName");
		selenium.type("input_2_4", "test@yell.com");
		selenium.type("input_2_4_2", "test@yell.com");
		selenium.click("id=gform_submit_button_2");
		doPause(10);
		assertTrue("Thankyou page is not being displayed",selenium.getTitle().endsWith(YELL_APPLICATION_TITLE_THANKYOU));
		assertTrue("Thankyou page is not being displayed",selenium.getLocation().contains(THANKYOU));
	}
	
	// Test for For Blank Sbmit
	public void testForBlankSubmit()
	{
		openYellBasicContacUs();
		doPause(5);
		selenium.click("id=gform_submit_button_2");
		doPause(5);
		assertTrue(selenium.getTitle().endsWith(YELL_APPLICATION_TITLE_BASIC_CONTACT_US));
		assertFalse("Thankyou page is not being displayed",selenium.getTitle().endsWith(YELL_APPLICATION_TITLE_THANKYOU));
		assertFalse("Thankyou page is not being displayed",selenium.getLocation().contains(THANKYOU));
		assertTrue(selenium.getText("//div[@class='validation_error' and position()=1]").contains(ERROR_MSG));
		assertTrue(selenium.getText("//div[@class='gfield_description validation_message' and position()=2]").contains(ERROR_MSG_MANDATORY));
		assertTrue(selenium.getText("//div[@class='gfield_description validation_message' and position()=3]").contains(ERROR_MSG_MANDATORY));		
	}


	

}
