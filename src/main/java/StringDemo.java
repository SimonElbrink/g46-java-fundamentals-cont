public class StringDemo {
    public static void main(String[] args) {
//        introToString();
//        length_charAt();
//        indexOf();
//        subString();
        trim();
    }



    public static void introToString(){

        //Syntax => ""
        // Type -> String (Capital "S")


        String aWord = "Hi";
        String sentence = "Hi, Java Group 46";

        String aName = "Simon";
        aName = aName.concat("Elbrink");

        System.out.println(aName); // Simon

//        String s = new String("String here");

        int i = 100;

//        i. // Does not have any methods.

        System.out.println(sentence);
        System.out.println(sentence.toLowerCase()); //String have helper Methods
        System.out.println(sentence.toUpperCase());

    }

    public static void length_charAt(){

        String name = "Simon Elbrink";

        System.out.println(name.length());

        System.out.println(name.charAt(8)); // String == Arrays starts at 0

    }

    public static void indexOf(){

        String name = "Erik Svensson";

        System.out.println(name.indexOf("Sven")); //5
        System.out.println(name.indexOf("sson")); //9
        System.out.println(name.indexOf("rik")); //1

        System.out.println("Names splits at index: " +name.indexOf(" "));

        int index = name.indexOf("S");

        char c = name.charAt(index);

        System.out.println(c);


    }

    public static void subString(){

        String message = "I Love Programming in Java!";

        int indexOfP = message.indexOf('P');

        String shortMessage = message.substring(indexOfP);

        System.out.println(shortMessage);



        int indexOfL = message.indexOf('L');


//        String loveMessage = message.substring(indexOfL, indexOfL + 4);

        int indexOfSpaceAfterL =  message.indexOf(" ",indexOfL);

        String loveMessage = message.substring(indexOfL, indexOfSpaceAfterL);


        System.out.println(loveMessage);


        String[] splitMessage = message.split(" ");
        System.out.println(splitMessage[1]); // Love


    }

    public static void trim(){
        String message = "         \n I Love\t Programming in Java! \t \t \n ";

        System.out.print(message.trim()); // Removes whitespaces in beginning of end of the String
    }

    //More Methods.
    public static void equals(){

        String message1 = "I Love Programming in Java!";
        String message2 = "i LOVe PrOgraMMing in JAVA!";

        boolean isTheSame = message1.equals(message2);
        boolean isTheSameIgnoreCase = message1.equalsIgnoreCase(message2);

        boolean ownIgnoreCasing = message1.toLowerCase().equals(message2.toLowerCase());

    }

    public static void contains_startsWith_endsWith(){

        String message = "I Love Programming in Java!";

        boolean endsWithJava = message.endsWith("Java!"); // TRUE
        boolean startsWithLove = message.startsWith("Love"); // FALSE

        boolean containsIn = message.contains("in"); // TRUE
        boolean containsM = message.contains("M"); // FALSE

    }

    public static void replaceMethod(){

        String message = "I Love Programming in Java!";

        message = message.replace("Love", "LOVE");

        System.out.println(message);

        System.out.println(message.replace(" in Java", ""));

    }

}
