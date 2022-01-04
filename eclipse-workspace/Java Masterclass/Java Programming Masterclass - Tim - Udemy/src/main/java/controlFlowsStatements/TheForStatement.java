package controlFlowsStatements;

public class TheForStatement {
    public static void main(String[] args) {
        System.out.println("10.000 at 2% interest = " + calculateInterest(10000.0,2.0));
        for(int i = 2; i < 9; i++){
            System.out.println("10.000 at " + i  +" % interest = "
                    + String.format("%.2f",calculateInterest(10000.0,i)));
        }
        for(int i = 8; i > 1; i--){
            System.out.println("10.000 at " + i  +" % interest = "
                    + String.format("%.2f",calculateInterest(10000.0,i)));
        }

        System.out.println(isPrime(7));
    }

    public static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate / 100));
    }

    public static boolean isPrime(int n){
        int divisores = 0;
        for(int i = 1; i <= n; i++) {
            if (n % i == 0) {
                divisores++;
            }
        }
        if(divisores == 2){
            return true;
        }
        return false;
    }
}
