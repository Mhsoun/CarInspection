/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.carInspection.model;

/**
 *
 * @author tmpuser-10209
 */
public interface Observer {
    
    public void display(int passCount, int failCount);
    
}
