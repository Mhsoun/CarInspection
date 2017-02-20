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
    
    
    public RegNoDTO input()
    { 
        System.out.println("please input the license number: ");
        Scanner license = new Scanner(System.in);
        String licenseNbr = license.nextLine();
        RegNoDTO regNo = new RegNoDTO(licenseNbr);   
        //RegNoDTO regNo = new RegNoDTO("ABC299");
        return regNo;
     }
    
    public void judgeInput(RegNoDTO regNo)
    {   
        int inspectionCost= control.enterRegNo(regNo);
        while(inspectionCost == 0)
        {
            System.out.println("Sorry,there is no such license number!");
            RegNoDTO regNo1 = input();
            inspectionCost= control.enterRegNo(regNo1);
        }    
        
        System.out.println("The cost is: " +inspectionCost);
    }
    
    public void Inspect(RegNoDTO regNo)
    {
        //Program retrieves appropriate inspections for vehicle.
        ArrayList<InspectionsDTO> InspectionResults = control.getInspections(regNo);
        control.printInspectionList(InspectionResults) ;
        
        //Inspector enters result of the specified inspection.
        for (InspectionsDTO InspectionResult : InspectionResults) 
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
    control.printInspectionResults(InspectionResults) ;
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
        RegNoDTO regNo = input();
    
    //Judge if it is a valid regno 
        judgeInput(regNo);
        
    //Inspector performs the specified inspection.
        Inspect(regNo);
   
    
    Scanner scanPaymentMethod = new Scanner (System.in);
    boolean userBehaving= false;
    boolean isCash = false;
    int cash = 0;
    while (!userBehaving){ 
    System.out.println("choose weather u r going to pay by cash or card by typing (cash) or (card)");
    String userPaymentChoice =scanPaymentMethod.nextLine();
    System.out.println("the amount of cash u have in your card or in ur hand (doesnät matter for the moment)");
    cash = scanPaymentMethod.nextInt();
    
    if (userPaymentChoice.equals("cash")){
        isCash=true;
        userBehaving = true;
    } else if (userPaymentChoice.equals("card")){
        isCash=false;
        userBehaving =true;
    } else {
        System.out.println("u should enter cash or card!");
        userBehaving=false;
    }
    }
    System.out.println(control.Paying(isCash, cash,regNo)+"your balance");
    
   
    
 }   
}

    

