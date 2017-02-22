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
     /**
     * @throws IncorrectRegNoException
     *  Thrown when the license number is illegal
     *  if there are no inspections for that number
     */
    public class IncorrectRegNoException extends Exception
    {
        public IncorrectRegNoException(String message )
        {
            super(message);
         }  
                    
    }
