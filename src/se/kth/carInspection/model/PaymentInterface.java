/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.carInspection.model;

import se.kth.carInspection.dbHandler.RegNoDTO;

/**
 *
 * @author Mahsoun
 */
public interface PaymentInterface {
    
    /**
     *
     * @param regNo
     * @return
     */
    public int doPayment(RegNoDTO regNo);    
 
}
