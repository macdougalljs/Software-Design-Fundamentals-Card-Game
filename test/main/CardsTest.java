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
public class CardsTest {
    
    public CardsTest() {
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
     * Test of getS method, of class Cards.
     */
    @Test
    public void testGetgood() {
        System.out.println("getS");
        Cards instance = new Cards();
        Cards.Suit expResult = null;
        Cards.Suit result = instance.getS();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

     public void testGetS() {
        System.out.println("getS");
        Cards instance = new Cards();
        Cards.Suit expResult = null;
        Cards.Suit result = instance.getS();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    /**
     * Test of setS method, of class Cards.
     */
    @Test
    public void testSetS() {
        System.out.println("setS");
        Cards.Suit s = null;
        Cards instance = new Cards();
        instance.setS(s);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getV method, of class Cards.
     */
    @Test
    public void testGetV() {
        System.out.println("getV");
        Cards instance = new Cards();
        Cards.Value expResult = null;
        Cards.Value result = instance.getV();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setV method, of class Cards.
     */
    @Test
    public void testSetV() {
        System.out.println("setV");
        Cards.Value v = null;
        Cards instance = new Cards();
        instance.setV(v);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of convertToInt method, of class Cards.
     */
    @Test
    public void testConvertToIntGood() {
        System.out.println("convertToInt");
        Cards instance = new Cards();
        int expResult = 0;
        int result = instance.convertToInt();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
public void testConvertToIntBad() {
        System.out.println("convertToInt");
        Cards instance = new Cards();
        int expResult = 0;
        int result = instance.convertToInt();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
public void testConvertToIntBoundary() {
        System.out.println("convertToInt");
        Cards instance = new Cards();
        int expResult = 0;
        int result = instance.convertToInt();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    /**
     * Test of toString method, of class Cards.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Cards instance = new Cards();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
