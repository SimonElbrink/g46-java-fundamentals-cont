package se.lexicon;

public class Product {

    static String companyName = "Shady Business Corporation";

    static int numberOfProducts = 0;

    //Instance Fields
    String name;
    String itemNumber;

    // Object builder method;
    public Product(){
        numberOfProducts++;
    }

    //Instance Method
    public String getProductInformation(){
        return "Store Name: "+ companyName + "\nProduct: " + name + "\nItemNumber: " + itemNumber;
    }

    public static int getNumberOfProducts(){
        return numberOfProducts;
    }



}
