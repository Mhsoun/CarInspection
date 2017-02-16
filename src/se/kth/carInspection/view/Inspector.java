/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.carInspection.view;
import java.util.ArrayList;
import se.kth.carInspection.controller.Controller;
import se.kth.carInspection.dbHandler.InspectionCostDTO;
import se.kth.carInspection.dbHandler.InspectionResultsRegistry;
import se.kth.carInspection.dbHandler.InspectionsDTO;
import se.kth.carInspection.dbHandler.RegNoDTO;
import java.util.Scanner;
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
    Scanner license = new Scanner(System.in);
    String licenseNbr = license.nextLine();
    RegNoDTO regNo = new RegNoDTO(licenseNbr); 
    //RegNoDTO regNo = new RegNoDTO("ABC299");
    
    
    //Program tells cost for inspection.if there is no such regNo,the program will exit.  
    InspectionCostDTO inspectionCost= control.enterRegNo(regNo);
    if (inspectionCost == null)
    {
        System.out.println("There is no such license number!");
        System.exit(0);
    }    
    else
    {
        System.out.println("The cost is: " +inspectionCost.getcost());
    }
    
    
    //Program retrieves appropriate inspections for vehicle.
    InspectionResultsRegistry InspectionResults = control.getInspections(regNo);
    
    //Inspector enters result of the specified inspection.
    for (InspectionsDTO InspectionResult : InspectionResults.getInspections()) 
    {  
        System.out.println("please input the result of " + InspectionResult.getInspectionName()+":");
        Scanner result = new Scanner(System.in);
        if (result.nextLine().equals("pass")) {
            InspectionResult.SetInspectionResult("pass");
        }
        else {
            InspectionResult.SetInspectionResult("fail");
            }
        }
    //commit
    control.Inspect(InspectionResults);
    
    //Program prints inspection results.
    control.printsResults(InspectionResults) ;
    

 }   
    
}
