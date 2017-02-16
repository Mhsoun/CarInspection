/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package se.kth.carInspection.dbHandler;

import java.util.ArrayList;

/**
 *
 * @author tmpuser-10209
 */
public class InspectionResultsRegistry {
    private ArrayList<InspectionsDTO> InspectionResults = new ArrayList<>();
    
    public InspectionResultsRegistry()
    {   addInspections();  }
    
    
    //Program stores inspection results.
    public void setInspectionsResults(InspectionResultsRegistry InspectionResults)     
    { 
        this.InspectionResults = InspectionResults.getInspections();
      
    }
    
    public ArrayList<InspectionsDTO> getInspections()    
    {
        return InspectionResults;
    }
    
            
    private void addInspections() {
        InspectionResults.add(new InspectionsDTO("egine","unchecked"));
        InspectionResults.add(new InspectionsDTO("body","unchecked"));
        InspectionResults.add(new InspectionsDTO("light","unchecked"));
     }
    
}
