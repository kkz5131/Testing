javac -verbose StateCode.java Sale.java Store.java Payment.java Cash.java CreditCard.java Luhn.java Product.java Products.java Storefront_v2.java

javac -d . StateCode.java Sale.java Store.java Payment.java Cash.java CreditCard.java Luhn.java Product.java Products.java Storefront_v2.java

jar cvfm sfzhuk.jar Manifest.txt ist242/StateCode.class ist242/Sale.class ist242/Sale.class ist242/Store.class ist242/Payment.class ist242/Cash.class ist242/CreditCard.class ist242/DebitCard.class ist242/Luhn.class ist242/Product.class ist242/Products.class ist242/Storefront_v2.class

java -jar sfzhuk.jar
