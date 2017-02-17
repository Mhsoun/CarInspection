/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.carInspection.controller;

import java.util.ArrayList;
import se.kth.carInspection.dbHandler.RegistryCreator;
import se.kth.carInspection.dbHandler.InspectionCostDTO;
import se.kth.carInspection.dbHandler.RegNoDTO;
import se.kth.carInspection.dbHandler.Printer;
import se.kth.carInspection.dbHandler.InspectionCostRegistry;
import se.kth.carInspection.dbHandler.InspectionsDTO;
import se.kth.carInspection.dbHandler.InspectionResultsRegistry;
import se.kth.carInspection.model.Cash;
import se.kth.carInspection.model.CreditCard;
import se.kth.carInspection.model.GarageDoor;
import se.kth.carInspection.model.PaymentInterface;
import se.kth.carInspection.model.QueueNumberDisplay;
/**
 *
 * @author tmpuser-10209
 */
public class Controller {
    private RegistryCreator creator;
    private Printer printer;
    private GarageDoor doorOpenClose;
    private QueueNumberDisplay queueNumber;
    private PaymentInterface payment;
    private Cash cashPayment;
    private CreditCard creditCardPayment;
    public Controller(RegistryCreator creator, Printer printer) {
        this.creator = creator;
        this.printer = printer;
        doorOpenClose = new GarageDoor();
        queueNumber = new QueueNumberDisplay();
    }
    
    
    public void startInspection(){
        queueNumber.increment();
        queueNumber.showNextNo();
           
    } 
    
    public  int enterRegNo(RegNoDTO regNo){
        
        return creator.getInspectionCostRegistry().getCost(regNo);
                 
    }
    
    //Program tells inspector what to inspect on customer’s vehicle.
    public InspectionResultsRegistry getInspections(RegNoDTO regNo)
    {
        return creator.getInspectionResultsRegistry();
        
    }  
    
    //Program stores inspection results.
    public void Inspect(InspectionResultsRegistry InspectionResults)
    {
     creator.getInspectionResultsRegistry().setInspectionsResults(InspectionResults);
    }
    
    //Program prints inspection results.
    public void printsResults(InspectionResultsRegistry InspectionResults ) 
    {    
        printer.printResult(InspectionResults);
    
    }
    public void closeDoor(){
        doorOpenClose.close();
        
    }
    public void openDoor(){
        doorOpenClose.open();        
    }
    
    public void Paying(boolean cashOrCreditCard, int cash){
        if (cashOrCreditCard == true){
            cashPayment = new Cash(cash);
        } else {
            creditCardPayment = new CreditCard (cash);
        }
                
        
    }

}
