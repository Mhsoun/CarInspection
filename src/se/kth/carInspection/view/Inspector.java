/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.carInspection.view;
import java.util.ArrayList;
import se.kth.carInspection.controller.Controller;
import se.kth.carInspection.dbHandler.InspectionsDTO;
import se.kth.carInspection.dbHandler.RegNoDTO;
import java.util.Scanner;
import se.kth.carInspection.dbHandler.IncorrectRegNoException;
/**
 *
 * @author Shuai Wang
 */
public class Inspector {
    private Scanner scanPaymentMethod;
    private Controller control;
    private InspectionStats inspectionStats;
    
    public Inspector(Controller control) {
        this.control = control;
        inspectionStats = new InspectionStats();
        
    }
    
    
    public RegNoDTO input()
    { 
        System.out.println("please input the license number: ");
        Scanner scanner = new Scanner(System.in);
        String licenseNbr = scanner.nextLine();
        RegNoDTO regNo = new RegNoDTO(licenseNbr);   
        try{
        control.judegeInput(regNo);               
        return regNo;
        }catch(IncorrectRegNoException e)
        {
          System.out.println("Incorrect License Number !"); 
          return input();   
          
        }  
     
    }
    
    /*public RegNoDTO judgeInput(RegNoDTO regNo)
    {   
        int inspectionCost= control.enterRegNo(regNo);
        while(inspectionCost == 0)
        {
            System.out.println("Sorry,there is no such license number!");
            regNo = input();
            inspectionCost= control.enterRegNo(regNo);            
        }   
        System.out.println("The cost is: " +inspectionCost);
        return regNo;              
    }*/
      public int getCost(RegNoDTO regNo)
    {   
        int inspectionCost= control.enterRegNo(regNo);                
         System.out.println("The cost is: " +inspectionCost);
        return inspectionCost; 
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
    
    //Get the regNo's cost. 
        getCost(regNo);
        

    boolean isCash = false;
    int cash = 0;
     
   boolean input= true;
   while(input==true){ 
   scanPaymentMethod = new Scanner (System.in);
   
    System.out.println("choose weather u r going to pay by cash or card by typing (cash) or (card)");
    String userPaymentChoice =scanPaymentMethod.nextLine();
         switch (userPaymentChoice) {
            case "cash":
                isCash=true;
                input=false;
                
                break;
            case "card":
                isCash=false;
                input=false;
              
                break;
            default:
                System.out.println("you should enter cash or card!");
                
                break;
        }
   }
   try{
    while(cash>0){
    System.out.println("the amount of cash u have in your card or in ur hand (doesnot matter for the moment)");
    cash = scanPaymentMethod.nextInt();
    }
        }
    catch (Exception e){
        System.out.println("please enter the word (cash) or the word (card)");
        System.out.println("please as well make sure the amount of money is numbers");
    }
   
        
    
    
    
    System.out.println("your balance is:    " + control.Paying(isCash, cash,regNo));
    
   
   
    
   
    
     //add Oberver
    control.addObserver(inspectionStats);
     
    //Inspector performs the specified inspection.
    Inspect(regNo);
}         
}


    

