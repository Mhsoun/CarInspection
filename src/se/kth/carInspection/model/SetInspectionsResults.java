/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.carInspection.model;

import java.util.ArrayList;
import java.util.List;
import se.kth.carInspection.dbHandler.InspectionsDTO;
import se.kth.carInspection.dbHandler.InspectionResultsRegistry;

/**
 *
 * @author tmpuser-10209
 */
public class SetInspectionsResults {
    
     private InspectionResultsRegistry InspectionResults;
     private  List<Observer> observers = new ArrayList<>();
     
     public SetInspectionsResults()
     {   
         this.InspectionResults = new InspectionResultsRegistry();  
         
     }
     
     public void setResult(ArrayList<InspectionsDTO> InspectionResults)     
    {  
        this.InspectionResults.setInspectionsResults(InspectionResults);
        
        int passCount = 0 ;
        int failCount = 0 ;
        for (InspectionsDTO inspection : InspectionResults) 
        {
            if(inspection.getInspectionResult().equals("pass"))
                {  
                    passCount = passCount +1;
                }
            else
                {  
                    failCount = failCount +1;
                }                
        }
        
        notifyObservers(passCount,failCount);
        
    }
     /**
     * Registers observers.
     @param observer The observer that shall be registered.
     */
     public void attach(Observer observer)
     {        
        observers.add(observer);
        System.out.println("Attached an observer");
    }
     
     // Called  when inspection result is seted
     private void notifyObservers(int passCount,int failCount)
     {
        for(Observer observer : observers){
            observer.display(passCount,failCount);
        }
    }
    
}
