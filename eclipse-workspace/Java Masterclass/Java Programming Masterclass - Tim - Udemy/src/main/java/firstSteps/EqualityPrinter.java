package firstSteps;

public class EqualityPrinter {
    public static final String INVALID_VALUE = "Invalid Value";
    public static final String ALL_EQUALS = "All numbers are equal";
    public static final String ALL_DIFFERENT = "All numbers are different";
    public static final String NEITHER = "Neither all are equal or different";

    public static void main(String[] args) {

        printEqual(1,1,1);
        printEqual(1,1,2);
        printEqual(-1,-1,-1);
        printEqual(1,2,3);
    }

    public static void printEqual(int number1, int number2, int number3){
        if(number1 < 0 && number2 < 0 && number3 < 0){
            System.out.println(INVALID_VALUE);
        }else if(number1 == number2 && number2 == number3){
            System.out.println(ALL_EQUALS);
        }else if(number1 != number2 && number1 != number3 && number2 != number3){
            System.out.println(ALL_DIFFERENT);
        }else{
            System.out.println(NEITHER);
        }
    }


}
