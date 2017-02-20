/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.carInspection.dbHandler;

/**
 *
 * @author tmpuser-10209
 */
public class RegNoDTO {
    private String regNo;
    
    public RegNoDTO(String regNo)
    {
        this.regNo = regNo;
    }

    public String getRegNo()
    {
        return this.regNo;
    }
    
    //Judge if it is the input vehicle’s license number.
    boolean matches(RegNoDTO regNo)
    {   
        if (this.regNo.equals(regNo.getRegNo()))
            {return true;}
        else 
            {return false;}
    }  
}
