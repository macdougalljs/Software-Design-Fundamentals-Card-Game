/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jeremiah MacDougall, Sheridan College Davis Campus
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
     * Test of getPlayerDeck method, of class Player.
     */
    @Test
    public void testGetPlayerDeck() {
        System.out.println("getPlayerDeck");
        Player instance = null;
        ArrayList<Cards> expResult = null;
        ArrayList<Cards> result = instance.getPlayerDeck();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPlayerDeck method, of class Player.
     */
    @Test
    public void testSetPlayerDeck() {
        System.out.println("setPlayerDeck");
        ArrayList<Cards> playerDeck = null;
        Player instance = null;
        instance.setPlayerDeck(playerDeck);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPlayerWinnings method, of class Player.
     */
    @Test
    public void testGetPlayerWinnings() {
        System.out.println("getPlayerWinnings");
        Player instance = null;
        ArrayList<Cards> expResult = null;
        ArrayList<Cards> result = instance.getPlayerWinnings();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPlayerWinnings method, of class Player.
     */
    @Test
    public void testSetPlayerWinnings() {
        System.out.println("setPlayerWinnings");
        ArrayList<Cards> playerWinnings = null;
        Player instance = null;
        instance.setPlayerWinnings(playerWinnings);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPlayerName method, of class Player.
     */
    @Test
    public void testGetPlayerName() {
        System.out.println("getPlayerName");
        Player instance = null;
        String expResult = "";
        String result = instance.getPlayerName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPlayerName method, of class Player.
     */
    @Test
    public void testSetPlayerName() {
        System.out.println("setPlayerName");
        String playerName = "";
        Player instance = null;
        instance.setPlayerName(playerName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOverallScore method, of class Player.
     */
    @Test
    public void testGetOverallScore() {
        System.out.println("getOverallScore");
        Player instance = null;
        int expResult = 0;
        int result = instance.getOverallScore();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOverallScore method, of class Player.
     */
    @Test
    public void testSetOverallScore() {
        System.out.println("setOverallScore");
        int overallScore = 0;
        Player instance = null;
        instance.setOverallScore(overallScore);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRoundScore method, of class Player.
     */
    @Test
    public void testGetRoundScore() {
        System.out.println("getRoundScore");
        Player instance = null;
        int expResult = 0;
        int result = instance.getRoundScore();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRoundScore method, of class Player.
     */
    @Test
    public void testSetRoundScore() {
        System.out.println("setRoundScore");
        int roundScore = 0;
        Player instance = null;
        instance.setRoundScore(roundScore);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDeckSize method, of class Player.
     */
    @Test
    public void testGetDeckSize() {
        System.out.println("getDeckSize");
        Player instance = null;
        int expResult = 0;
        int result = instance.getDeckSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
