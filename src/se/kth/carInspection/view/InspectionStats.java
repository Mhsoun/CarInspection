/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.carInspection.view;
import se.kth.carInspection.model.Observer;


/**
 *
 * @author tmpuser-10209
 */
public class InspectionStats implements Observer
{
    public InspectionStats()
    {  }
    
    public void display(int passCount , int failCount)
    {   int pass = passCount;
        int fail = failCount;
        System.out.println("**The Inspect result is: " + "pass "+pass+",  fail "+fail);     
    }
    
}
