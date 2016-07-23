/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findmensions.GUI;

import findmensions.Game;
import findmensions.Player;
import java.awt.event.ActionEvent;
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
public class DebugClientTest {
    
    public DebugClientTest() {
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
     * Test of begin method, of class DebugClient.
     */
    @Test
    public void testBegin() {
        System.out.println("begin");
        DebugClient instance = new DebugClient();
        instance.begin();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of receiveMessage method, of class DebugClient.
     */
    @Test
    public void testReceiveMessage() {
        System.out.println("receiveMessage");
        String s = "";
        DebugClient instance = new DebugClient();
        instance.receiveMessage(s);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of receivePlayer method, of class DebugClient.
     */
    @Test
    public void testReceivePlayer() {
        System.out.println("receivePlayer");
        Player p = null;
        DebugClient instance = new DebugClient();
        instance.receivePlayer(p);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of doMove method, of class DebugClient.
     */
    @Test
    public void testDoMove() {
        System.out.println("doMove");
        String m = "";
        DebugClient instance = new DebugClient();
        instance.doMove(m);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addGame method, of class DebugClient.
     */
    @Test
    public void testAddGame() {
        System.out.println("addGame");
        Game g = null;
        DebugClient instance = new DebugClient();
        instance.addGame(g);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of rickAttack method, of class DebugClient.
     */
    @Test
    public void testRickAttack() {
        System.out.println("rickAttack");
        int dimension = 0;
        DebugClient instance = new DebugClient();
        instance.rickAttack(dimension);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of waitingScreen method, of class DebugClient.
     */
    @Test
    public void testWaitingScreen() {
        System.out.println("waitingScreen");
        DebugClient instance = new DebugClient();
        instance.waitingScreen();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of moveScreen method, of class DebugClient.
     */
    @Test
    public void testMoveScreen() {
        System.out.println("moveScreen");
        DebugClient instance = new DebugClient();
        instance.moveScreen();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actionPerformed method, of class DebugClient.
     */
    @Test
    public void testActionPerformed() {
        System.out.println("actionPerformed");
        ActionEvent e = null;
        DebugClient instance = new DebugClient();
        instance.actionPerformed(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
