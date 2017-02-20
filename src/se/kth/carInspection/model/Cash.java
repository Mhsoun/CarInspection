/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.carInspection.model;

import se.kth.carInspection.dbHandler.InspectionCostDTO;
import se.kth.carInspection.dbHandler.InspectionCostRegistry;
import se.kth.carInspection.dbHandler.RegNoDTO;

/**
 *
 * @author Mahsoun
 */
public class Cash implements PaymentInterface  {
    private InspectionCostRegistry inspectionFees;
    private int amountOfCash;
  
   
    public Cash (int cash){
        inspectionFees = new InspectionCostRegistry();
        this.amountOfCash = cash;
    }
    /*public PaymentMethod identifyMethod(){
        return PaymentMethod.CashPayment;
    */
    
    
    
    public int doPayment (RegNoDTO regNo){ 
        int cost = inspectionFees.getCost(regNo);
       if(this.amountOfCash >= cost){
           this.amountOfCash = this.amountOfCash - cost;
           
           System.out.println("payment scussful");
           return this.amountOfCash;
       } else {
           System.out.println("Payment fail");
       return 0;
    }
    }

            
    
        
}

