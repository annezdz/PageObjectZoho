package controlFlowsStatements;

public class FirstAndLastDigitSum {

    public static void main(String[] args) {
//        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));
    }

    public static int sumFirstAndLastDigit(int number) {
        int lastNumber = number % 10;
        int firstNumber = 0;
        if(number >= 0){
            if(number < 10){
                return number + number;
            }
            while (!(number < 10)) {
                number /= 10;
                firstNumber = number;
            }
            return firstNumber + lastNumber;
        } else {
            return -1;
        }
    }
}
