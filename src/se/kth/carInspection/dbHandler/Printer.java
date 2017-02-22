/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.carInspection.dbHandler;
import java.util.ArrayList;
import se.kth.carInspection.model.Receipt;
/**
 *
 * @author Shuai Wang
 */
public class Printer {
    
    
    public Printer()
    {}
    
    public void printReceipt(Receipt receipt) 
    { 
    //receipt.printReceipt();
    }
    
    public void printInspectionList(ArrayList<InspectionsDTO>  InspectionResults)
    {
       System.out.println("*****The Inspect list of your car as follows: *****");
       printInspections(InspectionResults);
    }
        
    public void printInspectionResult(ArrayList<InspectionsDTO>  InspectionResults)
    {
       System.out.println("*****The Inspect details of your car as follows: *****");
       printInspections(InspectionResults);
    }
    
    public void printInspections(ArrayList<InspectionsDTO>  InspectionResults)
    {
        for (InspectionsDTO inspection : InspectionResults) 
        {
               System.out.println(inspection.getInspectionName() +": "+ inspection.getInspectionResult());
        }
    }
}
        
