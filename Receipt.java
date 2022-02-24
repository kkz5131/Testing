package ist242;

import java.util.Random;
import java.util.Scanner;

public class Receipt {
    private double tax;
    private String customerName;


    /**
     * Setter method for the customerName
     *
     * @return customerName
     */

    public String setCustomerName() {

        return customerName;

    }


    /**
     * Getter method for the customerName
     *
     * @return customerName
     */

    public String getCustomerName() {

        return customerName;

    }

    /**
     * Prompt the user for method for the CustomerName
     */

    public void promptCustomerName() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Customer Name: ");

        customerName = scan.nextLine();

    }
}
