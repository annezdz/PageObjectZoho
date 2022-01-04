package firstSteps;

public class PrimitiveTypesRecap {
    public static void main(String[] args) {

        /**
         * byte - never used
         * short - never used
         * int
         * long
         * float - never used
         * double
         * char
         * boolean
         * String is a class no a type primitive - is a sequence of characters, String is immutable, its nos updated, but
         * created again
         * a large number of characters
         * **/

        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);
        myString +=  " , and more";
        System.out.println("myString is equal to " + myString);
        myString += " \u00a9 2021";
        System.out.println("myString is equal to " + myString);
        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);

        // Quando adicionamos um int ao final de uma String , se torna uma String
        int myInt = 50;
        String lastString = "10";
        lastString = lastString + myInt;
        System.out.println("LastString equals to : " + lastString);

        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println(lastString);




    }
}
