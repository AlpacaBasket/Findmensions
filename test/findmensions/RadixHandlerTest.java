/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findmensions;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class RadixHandlerTest {
    
    public RadixHandlerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of stringToNumber method, of class RadixHandler.
     */
    @Test
    public void testStringToNumber() {
        System.out.println("stringToNumber");
        String[] listOfNums = null;
        int radix = 0;
        int[] expResult = null;
        int[] result = RadixHandler.stringToNumber(listOfNums, radix);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of numberToString method, of class RadixHandler.
     */
    @Test
    public void testNumberToString() {
        System.out.println("numberToString");
        int[] listOfNums = null;
        int radix = 0;
        String[] expResult = null;
        String[] result = RadixHandler.numberToString(listOfNums, radix);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
