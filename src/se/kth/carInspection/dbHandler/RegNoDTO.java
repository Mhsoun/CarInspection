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

    public RegNoDTO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String getRegNo()
    {
        return this.regNo;
    }
}
