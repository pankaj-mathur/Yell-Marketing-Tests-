package com.yell;
/*
 * This Test Suite is the
 * 
 * */

import junit.framework.TestSuite;

/**
 * The Class Yell_TestSuite
 */
public class Yell_TestSuite extends TestSuite
{
    /**
     * Suite.
     * 
     * @return the test
     */
    public static TestSuite suite()
    {     
    	TestSuite suite = new TestSuite("YELL Complete Test Package");
    	
    	// Add all the test SCripts to be executed
    	suite.addTestSuite(S_MKT_423_Test.class);
    	suite.addTestSuite(S_MKT_424_Test.class);
    	suite.addTestSuite(S_MKT_435_Test.class);
    	suite.addTestSuite(S_MKT_447_Test.class);
    	suite.addTestSuite(S_MKT_461_Test.class);
    	
        return suite;
    }
}
