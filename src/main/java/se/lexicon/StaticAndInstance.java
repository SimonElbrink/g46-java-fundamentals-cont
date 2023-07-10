package se.lexicon;

/**
 * Create Product Class
 * Add Instance fields
 * Add Instance Method
 * Instantiate Two Objects
 * Call Instance Method
 * Add Static fields
 * Add Static Method
 * Call Static Method
 * Review - Compare Instance & Static
 */
public class StaticAndInstance {

    public static void main(String[] args) {

        Product aviator = new Product();
        aviator.name = "Ray-Ban Aviator";
        aviator.itemNumber= "RB3025";

        System.out.println("Product.getNumberOfProducts() = " + Product.getNumberOfProducts());


        Product clubmaster = new Product();
        clubmaster.name = "Ray-Ban Clubmaster";
        clubmaster.itemNumber = "RB3016";

        System.out.println("Product.getNumberOfProducts() = " + Product.getNumberOfProducts());


//        Product.getProductInformation();

        System.out.println(aviator.getProductInformation());
        System.out.println(clubmaster.getProductInformation());

        System.out.println(Product.companyName);
//        System.out.println(Product.itemNumber);
        System.out.println(aviator.itemNumber);


//---

        //Instance variables and methods can only be accessed through objects.
        //Static variables and methods can be accessed trough ClassName.

        //Instance variables and methods can access static variables and methods.
        //Static variables and methods can NOT access instance variables and methods.
        //- The reason is how a java program runs. - Out of the scope of this lecture.




    }
}
