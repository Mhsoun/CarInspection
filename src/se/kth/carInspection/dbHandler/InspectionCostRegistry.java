/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.carInspection.dbHandler;
import java.util.ArrayList; 
import java.util.Iterator;

/**
 *
 * @author Shuai Wang
 */

//InspectionCostRegistry will just look in an array of InspectionCost. 
public class InspectionCostRegistry {
    private ArrayList<InspectionCostDTO> costs = new ArrayList<>(); 
    
    public InspectionCostRegistry()
    { addCosts();   }
    
    
    public int getCost(RegNoDTO regNo)     
    {
        for (InspectionCostDTO cost : costs) {
            if (cost.getregNo().matches(regNo)) {
                return cost.getcost();
            }
        }
      return 0;
    }  
                   
    private void addCosts() {
        RegNoDTO RegNo1 = new RegNoDTO("ABC299");
        RegNoDTO RegNo2 = new RegNoDTO("DEF399");
        RegNoDTO RegNo3 = new RegNoDTO("HIJ499");
        costs.add(new InspectionCostDTO(299,RegNo1));
        costs.add(new InspectionCostDTO(399,RegNo2));
        costs.add(new InspectionCostDTO(499,RegNo3));
     }
    

    /**
     * A license number is illegal if there are no inspections for that number
     * @param regNo The license number to input
     * @throws IncorrectRegNoException If a license number is illegal
     */
    public void judgeInput(RegNoDTO regNo) throws IncorrectRegNoException
    {   
        Iterator<InspectionCostDTO> it = costs.iterator();  
        int count = 0;
        while(it.hasNext()){
            InspectionCostDTO cost = it.next();
            if (cost.getregNo().matches(regNo)) 
                { count =count+1; }
        }
        if(count == 0){
        throw new IncorrectRegNoException("Incorrect License Number !");
            }
       }
 }

