package findmensions;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class PlayerTest {
    
    public PlayerTest() {
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
     * Test of getCoordinate method, of class Player.
     */
    @Test
    public void testGetCoordinate() {
        System.out.println("getCoordinate");
        int d = 0;
        Player instance = null;
        int expResult = 0;
        int result = instance.getCoordinate(d);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRole method, of class Player.
     */
    @Test
    public void testGetRole() {
        System.out.println("getRole");
        Player instance = null;
        Role expResult = null;
        Role result = instance.getRole();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMeeseeksAmount method, of class Player.
     */
    @Test
    public void testGetMeeseeksAmount() {
        System.out.println("getMeeseeksAmount");
        Player instance = null;
        int expResult = 0;
        int result = instance.getMeeseeksAmount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMeeseeksAmount method, of class Player.
     */
    @Test
    public void testSetMeeseeksAmount() {
        System.out.println("setMeeseeksAmount");
        int n = 0;
        Player instance = null;
        instance.setMeeseeksAmount(n);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
