/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import static javaapplication1.JavaApplication1.firstNonRepeatingChar;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author fa21-bse-033
 */
public class JavaApplication1Test {
    
    public JavaApplication1Test() {
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
     * Test of main method, of class JavaApplication1.
     */
    @Test
    public void testMain() {
        
        String str ="swiss";
        String expected= "w";
        char actual;
        
        
        
        actual = firstNonRepeatingChar(str);
        
        assertEquals(expected,actual);
        
        
      
    }
    
}
