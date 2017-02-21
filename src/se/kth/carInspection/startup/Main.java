/*
 HER ARE SOME EDIT TO TRY GITHUB.
 */
package se.kth.carInspection.startup;

import se.kth.carInspection.controller.Controller;
import se.kth.carInspection.dbHandler.Printer;
import se.kth.carInspection.dbHandler.RegistryCreator;
import se.kth.carInspection.view.Inspector;
/**
 *
 * @author Shuai Wang
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("choose one of the valid registation numbers:");
       System.out.println("ABC299");
       System.out.println("DEF399");
       System.out.println("HIJ499");
     
       RegistryCreator creator = new RegistryCreator();
       Printer printer = new Printer();
       Controller control = new Controller(creator, printer);
       Inspector inspector = new Inspector(control);
       inspector.Execution();
       

    }
    
}
