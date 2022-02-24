package ist242;

//Import all the classes from the package java.util
import java.util.*;
//Import the class Date which is in package java.util
import java.util.Date;

/** Class to be used to create Customer Credit Card object for storefront
 * @author Joe Oakes
 * @version 2
 */
public class CreditCard extends Payment{

    //Class Properties
    private String cardName;
    private String cardNumber;
    private Date cardExpDate;

    /** Constructor Method for the Credit Card
     * @param payCharge amount to pay
     */
    public CreditCard(double payCharge){
        super(payCharge);
    }
    //Method signature was defined in the Payment class
    //This method must be implemented in this class
    public double handlePayment(double pay){return pay * super.getpaymentCharge();
    }

    //Setter Credit Card Name
    public void setCreditCardName(String ccName){
        cardName = ccName;
    }

    //Getter Credit Card Name
    public String getCreditCardName(){
        return cardName;
    }

    //Setter Credit Card ExpDate
    public void setCreditCardExpDate(){
        cardExpDate = new Date();
    }

    //Getter Credit Card ExpDate
    public Date getCreditCardExpDate(){
        return cardExpDate;
    }


}

