package se.kth.carInspection.model;


public class QueueNumberDisplay {
    
    private int number;
    private GarageDoor openTheGarageDoor;
    
    public QueueNumberDisplay (){
        number = 0;
        openTheGarageDoor = new GarageDoor();    
    }
    public void showNextNo(){
        
        System.out.println("Queue Number = : "+number);
        openTheGarageDoor.open();
        
}
    
 
public void increment(){

       ++number;
     
	}   
public void restNumbers(){
    number = 0;
}
}
