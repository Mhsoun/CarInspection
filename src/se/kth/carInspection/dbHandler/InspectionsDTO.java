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
    private RegNoDTO regNo;
    
    public InspectionsDTO(String inspectionName,String inspectionResult,RegNoDTO regNo)
    {
        this.inspectionName = inspectionName;
        this.inspectionResult = inspectionResult;
        this.regNo = regNo;
    }
    public String getInspectionName()
    { 
        return this.inspectionName;   
    }
    
    public String getInspectionResult()
    { 
        return this.inspectionResult;   
    }
   
    public RegNoDTO getRegNo()
    { 
        return this.regNo;   
    }
    
    public void SetInspectionResult(String inspectionResult)
    { 
          this.inspectionResult = inspectionResult; 
    }
    
    
    boolean matches(RegNoDTO regNo)
    {   
        if (this.regNo.getRegNo().equals(regNo.getRegNo()))
            {return true;}
        else 
            {return false;}
    }  
}
