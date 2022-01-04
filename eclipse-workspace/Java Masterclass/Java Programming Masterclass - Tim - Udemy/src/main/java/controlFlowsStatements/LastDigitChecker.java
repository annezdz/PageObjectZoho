package controlFlowsStatements;

public class LastDigitChecker {
    public static void main(String[] args) {

        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));
        System.out.println(hasSameLastDigit(890, 871, 753));
    }

    public static boolean hasSameLastDigit(int num0, int num1, int num2) {
        if (isValid(num0) && isValid(num1) && isValid(num2)) {
            return (num0 % 10 == num1 % 10 || num1 % 10 == num2 % 10 || num2 % 10 == num0 % 10) ||
                    (num0 / 10 == num1 / 10 || num1 / 10 == num2 / 10 || num2 / 10 == num0 / 10) ||
                    (num0 / 100 == num1 / 100 || num1 / 100 == num2 / 100 || num2 / 100 == num0 / 100);
        }
        return false;

    }
    public static boolean isValid(int number){
        return (number >= 10 && number <= 1000) ? true : false;
    }

}
