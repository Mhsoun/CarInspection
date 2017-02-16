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
//InspectionCostRegistry will just look in an array of InspectionCost. 
public class InspectionCostRegistry {
    private ArrayList<InspectionCostDTO> costs = new ArrayList<>(); 
    
    public InspectionCostRegistry()
    { addCosts();   }
    
    
    public InspectionCostDTO getCost(RegNoDTO regNo)     
    {
        for (InspectionCostDTO cost : costs) {
            if (cost.matches(regNo)) {
                return cost;
            }
        }
      return null;
    }
    
    private void addCosts() {
        RegNoDTO RegNo1 = new RegNoDTO("ABC299");
        RegNoDTO RegNo2 = new RegNoDTO("DEF399");
        RegNoDTO RegNo3 = new RegNoDTO("HIJ499");
        costs.add(new InspectionCostDTO(299,RegNo1));
        costs.add(new InspectionCostDTO(399,RegNo2));
        costs.add(new InspectionCostDTO(499,RegNo3));
     }
}
