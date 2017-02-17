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
 * @author tmpuser-10209
 */
public class Printer {
    
    
    public Printer()
    {}
    
    public void printReceipt(Receipt receipt) 
    { 
    //receipt.printReceipt();
    }
    
    public void printResult(ArrayList<InspectionsDTO>  InspectionResults)
    {
       System.out.println("*****The Inspect result of your car as follows: *****");
        for (InspectionsDTO inspection : InspectionResults) 
        {
               System.out.println(inspection.getInspectionName() +": "+ inspection.getInspectionResult());
        }
    }
}
        
