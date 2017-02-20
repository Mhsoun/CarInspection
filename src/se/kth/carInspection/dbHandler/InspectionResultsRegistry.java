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
    public void setInspectionsResults(ArrayList<InspectionsDTO> InspectionResults)     
    {  
        this.InspectionResults = InspectionResults;
      
    }
    
    public ArrayList<InspectionsDTO> getInspections(RegNoDTO regNo)     
    {
        ArrayList<InspectionsDTO> Results = new ArrayList<>();
        for (InspectionsDTO inspection : InspectionResults) {
            if (inspection.getRegNo().matches(regNo)) {
                Results.add(inspection);       
            }
          
        }
        return Results;
    }
  
            
    private void addInspections() {
        RegNoDTO RegNo1 = new RegNoDTO("ABC299");
        RegNoDTO RegNo2 = new RegNoDTO("DEF399");
        RegNoDTO RegNo3 = new RegNoDTO("HIJ499");
        InspectionResults.add(new InspectionsDTO("engine","unchecked",RegNo3));
        InspectionResults.add(new InspectionsDTO("body","unchecked",RegNo3));
        InspectionResults.add(new InspectionsDTO("light","unchecked",RegNo3));
        InspectionResults.add(new InspectionsDTO("egine","unchecked",RegNo2));
        InspectionResults.add(new InspectionsDTO("body","unchecked",RegNo2));
        InspectionResults.add(new InspectionsDTO("egine","unchecked",RegNo1));
     }
    
}
