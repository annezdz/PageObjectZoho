package controlFlowsStatements;

public class Sum3And5Challenge {
    public static void main(String[] args) {

        int count = 0;
        int sumNumbersDividedByThreeOrFive = 0;

        for(int i = 1; i <= 1000; i++){
                if(i % 3 == 0 && i % 5 == 0){
                    System.out.println("The number " + i + " can be divided by 3 or 5.");
                    count++;
                    sumNumbersDividedByThreeOrFive+=i;
                    if(count == 5){
                        break;
                    }
                }
        }
        System.out.println("A soma dos numeros é : " + sumNumbersDividedByThreeOrFive);
    }


}
