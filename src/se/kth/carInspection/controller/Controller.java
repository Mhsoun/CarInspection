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
/**
 *
 * @author tmpuser-10209
 */
public class Controller {
    private RegistryCreator creator;
    private Printer printer;
    
    public Controller(RegistryCreator creator, Printer printer) {
        this.creator = creator;
        this.printer = printer;
    }
    
    public void startInspection(){
    
    }
    public void closeDoor(){
    }
    
    public  InspectionCostDTO enterRegNo(RegNoDTO regNo){
        
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
}
