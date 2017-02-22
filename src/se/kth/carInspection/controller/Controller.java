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
import se.kth.carInspection.model.Receipt;
import se.kth.carInspection.dbHandler.IncorrectRegNoException;
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
    
    public  void judegeInput(RegNoDTO regNo) throws IncorrectRegNoException
    {
        creator.getInspectionCostRegistry().judgeInput(regNo);
    }
        
    public  int enterRegNo(RegNoDTO regNo){
        
        return creator.getInspectionCostRegistry().getCost(regNo);
                 
    }
    
    public void printInspectionList(ArrayList<InspectionsDTO>  InspectionResults ) 
    {    
        printer.printInspectionList(InspectionResults);
    
    }
        public void printsReceipt(Receipt receipt ) 
    {    
        printer.printReceipt(receipt);
    
    }
    
    //Program tells inspector what to inspect on customer’s vehicle.
    public ArrayList<InspectionsDTO> getInspections(RegNoDTO regNo)
    {
        return creator.getInspectionResultsRegistry().getInspections(regNo);
        
    }  
    
    //Program stores inspection results.
    public void Inspect(ArrayList<InspectionsDTO>  InspectionResults)
    {
     creator.getInspectionResultsRegistry().setInspectionsResults(InspectionResults);
    }
    
    //Program prints inspection results.
    public void printInspectionResults(ArrayList<InspectionsDTO>  InspectionResults ) 
    {    
        printer.printInspectionResult(InspectionResults);
    
    }
    public void closeDoor(){
        doorOpenClose.close();
        
    }
    public void openDoor(){
        doorOpenClose.open();        
    }
    
    public int Paying(boolean cashOrCreditCard, int cash, RegNoDTO regNo){
        if (cashOrCreditCard == true){
            cashPayment = new Cash(cash);
            return cashPayment.doPayment(regNo);
        } else {
            creditCardPayment = new CreditCard (cash);
            return creditCardPayment.doPayment(regNo);
        }
                
        
    }

}
