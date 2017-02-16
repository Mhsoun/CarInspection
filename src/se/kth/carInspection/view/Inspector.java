/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.carInspection.view;
import java.util.ArrayList;
import se.kth.carInspection.controller.Controller;
import se.kth.carInspection.dbHandler.InspectionCostDTO;
import se.kth.carInspection.dbHandler.InspectionsDTO;
import se.kth.carInspection.dbHandler.RegNoDTO;

/**
 *
 * @author tmpuser-10209
 */
public class Inspector {
    private Controller control;
    
    public Inspector(Controller control) {
        this.control = control;
    }
 /**
* Simulates a user input that generates calls to all
* system operations.
*/

 public void Execution() {
    //Inspector specifies that a new inspection may be started.
    control.startInspection();
    
    //Inspector instructs program to close garage door.
    control.closeDoor();
    
    //Inspector enters vehicle’s license number.
    System.out.println("please input the license number: ");
    RegNoDTO regNo = new RegNoDTO("ABC299"); //
    
    //Program tells cost for inspection.
    InspectionCostDTO inspectionCost= control.enterRegNo(regNo);
    
    //Program retrieves appropriate inspections for vehicle.
    ArrayList<InspectionsDTO> InspectionResults = control.getInspections(regNo);
    
    //Inspector enters result of the specified inspection.
    for (InspectionsDTO InspectionResult : InspectionResults) {
        
        if (1==1) {
            InspectionResult.SetInspectionResult("pass");
        }
        else {
            InspectionResult.SetInspectionResult("fail");
            }
        }
    //commit
    control.Inspect(InspectionResults);
    
    //Program prints inspection results.
    
    

 }   
    
}
