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
    {  }
    
    public void printResult(InspectionResultsRegistry InspectionResults)
    {
        for (InspectionsDTO inspection : InspectionResults.getInspections()) 
        {
               System.out.println(inspection.getInspectionName() +": "+ inspection.getInspectionResult());
        }
    }
}
        
