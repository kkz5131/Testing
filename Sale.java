package ist242;

 

public class Sale { 

 public static double getTax(double saleTotal, StateCode state){
   double total = 0.0;
   if (state == StateCode.PA)
      total = .06 * saleTotal;
    else if(state == StateCode.NJ)
      total = .06625 * saleTotal;
   else if(state == StateCode.OH)
       total = .0663 * saleTotal;
   else if(state == StateCode.DE)
       total = .0 * saleTotal;
    return total;
  }

 

  public static double getDiscount(double saleTotal){
    return saleTotal *= .01;
  }
public static double getDiscount(double saleTotal, double percent){
    return saleTotal *= percent;
  }

 

}	
