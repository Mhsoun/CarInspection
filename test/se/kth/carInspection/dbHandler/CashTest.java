/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.carInspection.dbHandler;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import se.kth.carInspection.model.Cash;

/**
 *
 * @author Mhsoun
 */
public class CashTest {
    private Cash cashAmount1;
    private Cash cashAmount2;
    private InspectionCostRegistry inspec1;
    private InspectionCostRegistry inspec2;
    private RegNoDTO reg1;
    private RegNoDTO reg2;
    public CashTest() {
    }
    

    @Before
    public void setUp() {
        cashAmount1 = new Cash(1000);
        cashAmount2 = new Cash(500);
        inspec1 = new InspectionCostRegistry();
        inspec2 = new InspectionCostRegistry();
        reg1 = new RegNoDTO("ABC299");
        reg2 = new RegNoDTO("HIJ499");
       
    }
    
    @After
    public void tearDown() {
        cashAmount1 = null;
        inspec1 = null; 
        reg1 = null;
        cashAmount2 = null;
        inspec2 = null; 
        reg2 = null; 
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testEqualsJavaLangObject() {
    Object other = new Object();
    boolean expResult = false;
    boolean result = cashAmount1.equals(other);
    assertEquals("Amount instance equal to " +"java.lang.Object instance.",expResult, result);
    }
    @Test
    public void doPaymentTest1() {
        int result = cashAmount1.doPayment(reg1);
        int expResult = 701;
        assertEquals("Amount instances with different " +"states are equal.", expResult, result);
}
        public void doPaymentTest2() {
        int result = cashAmount2.doPayment(reg2);
        int expResult = 101;
        assertEquals("Amount instances with different " +"states are equal.", expResult, result);
}
}
