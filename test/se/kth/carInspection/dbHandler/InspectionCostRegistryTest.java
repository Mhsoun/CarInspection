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

/**
 *
 * @author tmpuser-10209
 */
public class InspectionCostRegistryTest {
    
    public InspectionCostRegistryTest() {
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
     * Test of getCost method, of class InspectionCostRegistry.
     */
    @Test
    public void testGetCost() {
        System.out.println("getCost");
        RegNoDTO regNo = new RegNoDTO("ABC299");
        InspectionCostRegistry instance = new InspectionCostRegistry();
        int expResult = 299;
        int result = instance.getCost(regNo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
