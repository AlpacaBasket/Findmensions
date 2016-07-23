/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findmensions;

import findmensions.Roles.*;
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
     * Create a Player object for testing
     * @return 
     * Dummy player
     */
    public Player examplePlayer() {
        
        int[] testCoords = {0, 0};
        Role playerRole = new Jerry();
        Player player = new Player(testCoords, playerRole);
        
        return player;
    }

    /**
     * Test of getCoordinate method, of class Player.
     */
    @Test
    public void testGetCoordinate() {
        System.out.println("getCoordinate");
        int d = 0;
        
        Player instance = examplePlayer();
        
        int expResult = 0;
        int result = instance.getCoordinate(d);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setCoordinate method, of class Player.
     */
    @Test
    public void testSetCoordinate() {
        System.out.println("setCoordinate");
        int[] c = null;
        Player instance = examplePlayer();
        instance.setCoordinate(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRoleName method, of class Player.
     */
    @Test
    public void testGetRoleName() {
        System.out.println("getRoleName");
        Player instance = examplePlayer();
        String expResult = "Jerry";
        String result = instance.getRoleName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMeeseeksAmount method, of class Player.
     */
    @Test
    public void testGetMeeseeksAmount() {
        System.out.println("getMeeseeksAmount");
        Player instance = examplePlayer();
        int expResult = 0;
        int result = instance.getMeeseeksAmount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setMeeseeksAmount method, of class Player.
     */
    @Test
    public void testSetMeeseeksAmount() {
        System.out.println("setMeeseeksAmount");
        int n = 0;
        Player instance = examplePlayer();
        instance.setMeeseeksAmount(n);
        // TODO review the generated test code and remove the default call to fail.
        fail("Not written test yet");
    }
    
}
