/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findmensions;

import java.util.ArrayList;
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
public class GameTest {
    
    public GameTest() {
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
     * Test of getNumberOfPlayers method, of class Game.
     */
    @Test
    public void testGetNumberOfPlayers() {
        System.out.println("getNumberOfPlayers");
        Game instance = new Game();
        int expResult = 0;
        int result = instance.getNumberOfPlayers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumberOfDimensions method, of class Game.
     */
    @Test
    public void testGetNumberOfDimensions() {
        System.out.println("getNumberOfDimensions");
        Game instance = new Game();
        int expResult = 0;
        int result = instance.getNumberOfDimensions();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRadix method, of class Game.
     */
    @Test
    public void testGetRadix() {
        System.out.println("getRadix");
        Game instance = new Game();
        int expResult = 0;
        int result = instance.getRadix();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showMessage method, of class Game.
     */
    @Test
    public void testShowMessage() {
        System.out.println("showMessage");
        String s = "";
        Game instance = new Game();
        instance.showMessage(s);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of RickWins method, of class Game.
     */
    @Test
    public void testRickWins() {
        System.out.println("RickWins");
        Game instance = new Game();
        instance.RickWins();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AntiRickTeamWins method, of class Game.
     */
    @Test
    public void testAntiRickTeamWins() {
        System.out.println("AntiRickTeamWins");
        Game instance = new Game();
        instance.AntiRickTeamWins();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of EvilRickWins method, of class Game.
     */
    @Test
    public void testEvilRickWins() {
        System.out.println("EvilRickWins");
        Game instance = new Game();
        instance.EvilRickWins();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of RickAttack method, of class Game.
     */
    @Test
    public void testRickAttack() {
        System.out.println("RickAttack");
        int dimension = 0;
        Player attacker = null;
        Game instance = new Game();
        instance.RickAttack(dimension, attacker);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of doMove method, of class Game.
     */
    @Test
    public void testDoMove() {
        System.out.println("doMove");
        Player p = null;
        String move = "";
        Game instance = new Game();
        int expResult = 0;
        int result = instance.doMove(p, move);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRandomListOfRoles method, of class Game.
     */
    @Test
    public void testGetRandomListOfRoles() {
        System.out.println("getRandomListOfRoles");
        int size = 0;
        Game instance = new Game();
        Role[] expResult = null;
        Role[] result = instance.getRandomListOfRoles(size);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllRoles method, of class Game.
     */
    @Test
    public void testGetAllRoles() {
        System.out.println("getAllRoles");
        Game instance = new Game();
        ArrayList<String> expResult = null;
        ArrayList<String> result = instance.getAllRoles();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRoleFromRoleName method, of class Game.
     */
    @Test
    public void testGetRoleFromRoleName() {
        System.out.println("getRoleFromRoleName");
        String name = "";
        Game instance = new Game();
        Role expResult = null;
        Role result = instance.getRoleFromRoleName(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of giveRoleToPlayer method, of class Game.
     */
    @Test
    public void testGiveRoleToPlayer() {
        System.out.println("giveRoleToPlayer");
        Game instance = new Game();
        Role expResult = null;
        Role result = instance.giveRoleToPlayer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addPlayer method, of class Game.
     */
    @Test
    public void testAddPlayer() {
        System.out.println("addPlayer");
        Player p = null;
        Game instance = new Game();
        instance.addPlayer(p);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validatePlayerMove method, of class Game.
     */
    @Test
    public void testValidatePlayerMove() {
        System.out.println("validatePlayerMove");
        String text = "";
        Game instance = new Game();
        String expResult = "";
        String result = instance.validatePlayerMove(text);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validateRickMove method, of class Game.
     */
    @Test
    public void testValidateRickMove() {
        System.out.println("validateRickMove");
        String text = "";
        Game instance = new Game();
        int expResult = 0;
        int result = instance.validateRickMove(text);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
