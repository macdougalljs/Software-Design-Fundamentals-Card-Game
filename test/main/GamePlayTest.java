/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
    public void testCreateRandomArray() {
        System.out.println("CreateRandomArray");
        Cards[] array = null;
        Cards[] expResult = null;
        Cards[] result = GamePlay.CreateRandomArray(array);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class GamePlay.
     */
    
    
  /*  @Test  - removed test main per PPTX
    
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        GamePlay.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    */
}
