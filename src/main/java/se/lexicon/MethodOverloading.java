package se.lexicon;

public class MethodOverloading {

    public static void main(String[] args) {

        int num1 = 20;
        int num2 = 40;
        int num3 = 60;

        System.out.println(add(num1,num2));
        System.out.println(add(40.45,30.65));
        System.out.println(add(num1,num2,num3, 65, 96));

        //CTRL + P   View implementations
//        add();

    }

    public static int add (int number1, int number2){
        return number1 + number2;
    }

    //Overloading method 'add()'
    public static double add (double number1, double number2){
        return number1 + number2;
    }

    //Overloading method 'add()'
    public static int add (int... numbers){
        int result = 0;
        for (int number : numbers) {
            result = result + number;
        }
        return result;
    }





}
