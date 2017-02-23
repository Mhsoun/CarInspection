/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.carInspection.dbHandler;

/**
 *
 * @author Shuai Wang
 */

public class InspectionCostDTO {
    private int cost;
    private RegNoDTO regNo; 
    
    public InspectionCostDTO(int cost,RegNoDTO regNo)
    {
        this.cost = cost;
        this.regNo = regNo;
    }

    public int getcost()
    {
        return this.cost;
    }
    
    public RegNoDTO getregNo()
    {
        return this.regNo;
    }

}
