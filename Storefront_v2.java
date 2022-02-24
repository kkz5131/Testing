package ist242;

import java.util.Random;

public class Storefront_v2{

    public static void main(String[] args){

        Store coffeeStore = new Store("Kk's Coffee shop");
        Store sportStore = new Store("Kk's Sports shop");


        System.out.println(coffeeStore.getStorename());
        System.out.println(sportStore.getStorename());

        System.out.println(Sale.getTax(100.00, StateCode.PA));
        System.out.println(Sale.getTax(100.00, StateCode.NJ));
        System.out.println(Sale.getTax(100.00, StateCode.OH));
        System.out.println(Sale.getTax(100.00, StateCode.DE));

        Cash c1= new Cash (5.00);
        System.out.println(100.00 + c1.handlePayment(100.00));

        CreditCard cc1 = new CreditCard(25.00);
        cc1.setCreditCardExpDate();
        cc1.setCreditCardName("Kk Zhu");
        System.out.println("card name:" + cc1.getCreditCardName());
        System.out.println("Credit Card Exp Date:" + cc1.getCreditCardExpDate());
        System.out.println("Credit Card Check T : "+ Luhn.Check("4444333322221111"));
        System.out.println("Credit Card Check F : "+ Luhn.Check("4444333332221111"));

        CreditCard cc2 = new CreditCard(25.00);
        cc2.setCreditCardExpDate();
        cc2.setCreditCardName("Kk Zhu1");
        System.out.println("card name:" + cc2.getCreditCardName());
        System.out.println("Credit Card Exp Date:" + cc2.getCreditCardExpDate());

        DebitCard dd1=new DebitCard(40);
        dd1.setDebitCardpin(1234);
        System.out.println("card pin:" + dd1.getDebitCardpin());

        Product prod = new Product();
        prod.promptUserProduct();
        Product prod2 = new Product();
        prod2.promptUserProduct();
//System.out.println("Product ID: " + prod.getProductId());
//System.out.println("Product Name: " + prod.getProductName());
        Products prods = new Products(prod);
        prods.setProducts(prod2, 1);
        prods.printProducts();

        Fish f1 = new Fish ();
        f1.setFishAdopDate();
        f1.setFishName("Goldy");
        f1.setFishAdopted(true);
        System.out.println("Fish Name:" + f1.getFishName());
        System.out.println("Fish Adopted:" + f1.getFishAdopted());
        System.out.println("Fish Adoption Date:" + f1.getFishAdopDate());
        f1.legs();

       ShoppingCart sc = new ShoppingCart();
       sc.addProductToCart(new Product(0,"Watch1"));
       sc.addProductToCart(new Product(1,"Watch2"));
       System.out.println("Number of Cart Items: "+sc.getNumberOfProducts());

    }
}


