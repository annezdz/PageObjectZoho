package controlFlowsStatements;

public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome1(1221));
        System.out.println(isPalindrome1(123));


    }

    public static boolean isPalindrome(int number){
        int reverseNumber = 0;
        int oldNumber = number;
        while (number > 0){
            int remainderNumber = number % 10;
            reverseNumber = (reverseNumber * 10) + remainderNumber;
            number /= 10;
        }
        if(reverseNumber == oldNumber){
            return true;
        }
        return false;
    }

    // old way
    public static boolean isPalindrome1(int number) {
        int reverse = 0;
        int oldNumber = Math.abs(number);

        while(number > 0) {
            int lastDigit = number % 10;
            reverse = (reverse * 10) + lastDigit;
            number /= 10;
        }
        return reverse == oldNumber;
    }

}
