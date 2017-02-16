/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.carInspection.startup;

import se.kth.carInspection.controller.Controller;
import se.kth.carInspection.dbHandler.Printer;
import se.kth.carInspection.dbHandler.RegistryCreator;
import se.kth.carInspection.view.Inspector;
/**
 *
 * @author tmpuser-10209
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       RegistryCreator creator = new RegistryCreator();
       Printer printer = new Printer();
       Controller control = new Controller(creator, printer);
       Inspector inspector = new Inspector(control);
       inspector.Execution();
       
    }
    
}
