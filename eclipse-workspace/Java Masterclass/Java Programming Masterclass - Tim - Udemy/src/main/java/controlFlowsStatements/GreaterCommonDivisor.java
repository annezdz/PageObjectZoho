package controlFlowsStatements;

public class GreaterCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreaterCommonDivisor(25,15));
        System.out.println(getGreaterCommonDivisor(12,30));
        System.out.println(getGreaterCommonDivisor(9,18));
        System.out.println(getGreaterCommonDivisor(81,153));
    }

    public static int getGreaterCommonDivisor(int first , int second){
        if(first < 10 || second < 10){
            return -1;
        }
        int maxDivisor = 0;
        for(int i = 1; i <= first; i++){
            if(first % i == 0 && second % i == 0){
                maxDivisor = i;
            }
        }
        return maxDivisor;

    }
}
