package controlFlowsStatements;

public class DigitSumChallenge {
    public static void main(String[] args) {
        System.out.println(sumDigits(123));
        System.out.println(sumDigits(-10));
        System.out.println(sumDigits(1234));
    }

    public static int sumDigits(int number){
        int total = 0;
        if(number >= 10){
            while(number >=1){
                int extractLeastDigit = number % 10;
                total += extractLeastDigit;
                number /= 10;
            }
            return total;
        }
        return -1;
    }
}
