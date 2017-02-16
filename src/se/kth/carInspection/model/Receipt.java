/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.carInspection.model;

import se.kth.carInspection.dbHandler.InspectionCostDTO;
import se.kth.carInspection.dbHandler.RegNoDTO;

/**
 *
 * @author tmpuser-10209
 */
public class Receipt {
    private RegNoDTO regNumber;
    private InspectionCostDTO inspectionCost;
    public Receipt () {
        inspectionCost = new InspectionCostDTO();
        regNumber = new RegNoDTO();
                
    }
    public void printReceipt () {
        System.out.println("the car registration number is" + regNumber.getRegNo());
        System.out.println("the inspection cost is:" + inspectionCost.getcost());
            
        
    }
    
    
}
