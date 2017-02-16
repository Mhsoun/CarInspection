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
public class RegistryCreator {
    private InspectionCostRegistry inspectionCostRegistry ;
    private InspectionResultsRegistry inspectionResultsRegistry;
    
    public RegistryCreator()
    {   
        inspectionCostRegistry = new InspectionCostRegistry();
        inspectionResultsRegistry = new InspectionResultsRegistry();
    }
    public InspectionCostRegistry getInspectionCostRegistry() 
    {   
        return inspectionCostRegistry;
    }
    
    public InspectionResultsRegistry getInspectionResultsRegistry()
    {
        return inspectionResultsRegistry;
    }
    
}
