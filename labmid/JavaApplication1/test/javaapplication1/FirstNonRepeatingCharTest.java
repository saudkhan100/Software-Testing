/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

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
public class FirstNonRepeatingCharTest {
    
 
 
    @Test
public void testFirstNonRepeatingChar() {
    System.out.println("firstNonRepeatingChar");
    String str = "aavc";
    Character expResult = 'v'; 
    Character result = FirstNonRepeatingChar.firstNonRepeatingChar(str);
    System.out.println("Expected: " + expResult + ", Result: " + result);
    assertEquals(expResult, result);
}


@Test
public void testMain() {
  
   
}
    
}
