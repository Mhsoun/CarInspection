/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.carInspection.dbHandler;
import java.util.HashMap;
/**
 *
 * @author tmpuser-10209
 */
public class InspectionsDTO {
    private String inspectionName;
    private String inspectionResult;    
    
    public InspectionsDTO(String inspectionName,String inspectionResult)
    {
        this.inspectionName = inspectionName;
        this.inspectionResult = inspectionResult;
    }
    public String getInspectionName()
    { 
        return this.inspectionName;   
    }
    
    public String getInspectionResult()
    { 
        return this.inspectionResult;   
    }
   
    public void SetInspectionResult(String inspectionResult)
    { 
          this.inspectionResult = inspectionResult; 
    }
    
}
