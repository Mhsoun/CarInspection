/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.carInspection.model;

import se.kth.carInspection.dbHandler.InspectionCostDTO;
import se.kth.carInspection.dbHandler.RegNoDTO;
import java.util.Date;
/**
 *
 * @author tmpuser-10209
 */
public class Receipt {
    private InspectionCostDTO inspectionCost;
    public Receipt (InspectionCostDTO inspectionCost) {
    
        this.inspectionCost = inspectionCost ;
 
                
    }
    public void printReceipt () {
        Date Time = new Date();
        System.out.println("The inspection time: " + Time.toString());
        System.out.println("The car registration number is: " + inspectionCost.getregNo().getRegNo());
        System.out.println("The inspection cost is:" + inspectionCost.getcost());
            
        
    }
    
    
}
