package se.kth.carInspection.model;


public class QueueNumberDisplay {
    
    private int number;
    private GarageDoor openTheGarageDoor;
    
    public QueueNumberDisplay (){
        number = 0;
        openTheGarageDoor = new GarageDoor();    
    }
    public int showNextNo(){
        
        System.out.println("Queue Number = : "+number);
        return number;
}
    
 
public void increment(){

       ++number;
       openTheGarageDoor.open();
	}   
public void restNumbers(){
    number = 0;
}
}
