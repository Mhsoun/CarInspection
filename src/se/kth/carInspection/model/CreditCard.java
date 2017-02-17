

/*
 *this class will take the inspection fees from credit card 
 *
*/
package se.kth.carInspection.model;
import java.util.*;
import se.kth.carInspection.dbHandler.InspectionCostDTO;
import se.kth.carInspection.dbHandler.InspectionCostRegistry;
import se.kth.carInspection.dbHandler.RegNoDTO;


/**
 *
 * @author Mahsoun
 */
public class CreditCard implements PaymentInterface {
    private InspectionCostRegistry inspectionFees;
    private int cardBalance;
    private int pin;
    private int creditCardNO;
    private String cardHolderName;
    private Date expireDate;
    private int cvc;
    
    public CreditCard (int cash) {
    
        inspectionFees = new InspectionCostRegistry();
        this.cardBalance = cardBalance;
    /*
        
        this.pin = pin;
        this.creditCardNO = creditCardNO;
        this.cardHolderName = cardHolderName;
        this.expireDate = expireDate;
        this.cvc = cvc;
    */
    }
    
    /* 
     * this method will get the fees from the card
     * we give the ability to user to enter blance as example 
     * i assume the inspection cost are fixed for the current stage
    */
public boolean  doPayment (RegNoDTO regNo){ 
    
    int amount = inspectionFees.getCost(regNo);
    
   if ((cardBalance - amount) >= 0){
       
      
    cardBalance = cardBalance - amount;
   return true;
   }else {
       System.out.println("cardpaymentfaluiler");
       return false;

   }    
}
//public int getPin (){
//return pin;
//}
//public int getNumber () {
//    return creditCardNO;
//}
//public String getHolder (){
//   return cardHolderName;
//}
//public Date getExpireDate(){
//return expireDate;
//}
//public int getCvc(){
//return cvc;
//}

}
