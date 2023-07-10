package se.lexicon;


/**
 * 1. Class Scope
 * 2. Method Scope
 * 3. Local Scope
 * 4. Block Scope
 * 5. Field Variable vs Local Variable scopes
 */
public class ScopeExample { // Start of Class Scope

    static int century = 100; // Field Variable (variable in class scope)

    public static void main(String[] args) {

//        printMenu();
//        miniLoop();

        String century = "💯"; // Local Variable


        System.out.println("century = " + century); // Prints the Local variable. (closest found)
        System.out.println("ScopeExample.century = " + ScopeExample.century); //Prints static field variable in class scope.


    }


    public static void miniLoop(){

        // Variable accessible in 'miniLoop()' nowhere else. - Local Scope
        int result = 0;

        //      ↓ 'i' & J is instantiated and only accessible inside for-loop.
        for(int i = 0, j = 2; i < 5; i++, j++){ //Block Scope

            result = result + i;

            System.out.println("i = " + i);
            System.out.println("j = " + j);
            System.out.println("result = " + result);

        }

//        System.out.println(i);

        System.out.println("\nPrinting result = " + result);

    }

    public static void printMenu(){ // Start of Method Scope
        System.out.println("##############################################");
        System.out.println("   Hi👋, welcome to a simple calculator 🧮");
        System.out.println("###################  Menu  ###################");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exit");
        System.out.println("##############################################");

    } // End of Method Scope





}// End of Class Scope
