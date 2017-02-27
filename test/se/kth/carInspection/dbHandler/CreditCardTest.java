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
import se.kth.carInspection.model.CreditCard;

/**
 *
 * @author Mhsoun
 */
public class CreditCardTest {
    private CreditCard creditCardAmount1;
    private CreditCard creditCardAmount2;
    private InspectionCostRegistry inspec1;
    private InspectionCostRegistry inspec2;
    private RegNoDTO reg1;
    private RegNoDTO reg2;
    public CreditCardTest() {
    }
    

    @Before
    public void setUp() {
        creditCardAmount1 = new CreditCard(1000);
        creditCardAmount2 = new CreditCard(500);
        inspec1 = new InspectionCostRegistry();
        inspec2 = new InspectionCostRegistry();
        reg1 = new RegNoDTO("ABC299");
        reg2 = new RegNoDTO("HIJ499");
       
    }
    
    @After
    public void tearDown() {
        creditCardAmount1 = null;
        inspec1 = null; 
        reg1 = null;
        creditCardAmount2 = null;
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
    boolean result = creditCardAmount1.equals(other);
    assertEquals("Amount instance equal to " +"java.lang.Object instance.",expResult, result);
    }
    @Test
    public void doPaymentTest1() {
        int result = creditCardAmount1.doPayment(reg1);
        int expResult = 701;
        assertEquals("Amount instances with different " +"states are equal.", expResult, result);
}
        public void doPaymentTest2() {
        int result = creditCardAmount2.doPayment(reg2);
        int expResult = 101;
        assertEquals("Amount instances with different " +"states are equal.", expResult, result);
}
}
