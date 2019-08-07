/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// add number of cards for each player, at least one method for test cases for proffessor

package main;

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
public class GamePlayTest {
    
    public GamePlayTest() {
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
     * Test of CreateRandomArray method, of class GamePlay.
     */
    @Test
    public void testCreateRandomArrayGood() {
        System.out.println("CreateRandomArray");
        Cards[] array = null;
        Cards[] expResult = null;
        Cards[] result = GamePlay.CreateRandomArray(array);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testCreateRandomArrayBad() {
        System.out.println("CreateRandomArray");
        Cards c = new Cards();
        Cards d = new Cards();
        Cards e = new Cards();
        Cards[] array = {c, d};
        Cards[] expResult = null;
        Cards[] result = GamePlay.CreateRandomArray(array);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testCreateRandomArrayBoundary() {
        System.out.println("CreateRandomArray");
        Cards c = new Cards();
        Cards d = new Cards();
        Cards e = new Cards();
        Cards[] array = {c, d, e};
        Cards[] expResult = null; 
        Cards[] result = GamePlay.CreateRandomArray(array);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }
    
    /**
     * Test of main method, of class GamePlay.
     */
/*    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        GamePlay.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    REMOVED PER JUNIT PROCEDURE */
}
