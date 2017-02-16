package se.kth.carInspection.model;

/**
 *
 * @author Ali Kamran
 */
public class GarageDoor {
    private boolean doorState;
    
    public GarageDoor()
    {
    doorState = false;
    }
 
    public void close(){
        if(doorState=true)
        doorState= false;        
    System.out.println("Closed the Garage");
    }
    public void open(){
    if(doorState=false)
        doorState=true;
     System.out.println("Open the Garage");
    
    }
    
}
