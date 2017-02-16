/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.carInspection.model;

import se.kth.carInspection.dbHandler.InspectionCostDTO;

/**
 *
 * @author Mahsoun
 */
public class Cash implements PaymentInterface  {
    private InspectionCostDTO inspectionFees;
    private int amountOfCash;
  
   
    public Cash (int cash){
        inspectionFees = new InspectionCostDTO();
        this.amountOfCash = cash;
    }
    /*public PaymentMethod identifyMethod(){
        return PaymentMethod.CashPayment;
    */
    
    
    
    public boolean doPayment (){ 
        int cost = inspectionFees.getcost();
       if(this.amountOfCash >= cost){
           amountOfCash -= cost;
           System.out.println("payment scussful");
           return true;
       }
       return false;
    }
    public int getBalance(){
        System.out.println("return the balance");
        return this.amountOfCash;
    }
            
    
        
}

