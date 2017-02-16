package se.kth.carInspection.model;


class QueueNumberDisplay {
    
    private int number;
    
    public int showNextNo(int number){
    
	this.number=number;
        return number;
}
    
 
public void increment(){

       System.out.println("Queue Number = : "+ ++this.number);
       GarageDoor garageDoor=new GarageDoor();
       garageDoor.open();
	
	}   
}
