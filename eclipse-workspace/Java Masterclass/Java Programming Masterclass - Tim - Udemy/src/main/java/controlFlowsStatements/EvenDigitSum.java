package controlFlowsStatements;

public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
        System.out.println(getEvenDigitSum(1234));
        System.out.println(getEvenDigitSum(1112223334));

    }

    public static int getEvenDigitSum(int number){
        int total = 0;
        if(number >= 0) {
            while (!(number < 1)) {
                if (number % 2 == 0) {
                    total += (number % 10);
                }
                number /= 10;
            }
            return total;
        }
        return -1;
    }
}
