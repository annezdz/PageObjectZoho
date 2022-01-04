package controlFlowsStatements;

public class SumOdd {

    public static void main(String[] args) {
        System.out.println(isOdd(2));
        System.out.println(isOdd(0));
        System.out.println(isOdd(1));
        System.out.println(sumOdd(1,100));
        System.out.println(sumOdd(-1,100));
        System.out.println(sumOdd(100,100));
        System.out.println(sumOdd(13,13));
        System.out.println(sumOdd(100,-100));
        System.out.println(sumOdd(100,1000));
    }

    public static boolean isOdd(int number){
        return (number > 0 && (number % 2 != 0))? true : false;
    }

    public static int sumOdd(int start, int end){
        int total = 0;
        if((end > start || end == start) && (start > 0 && end > 0)){
            for(int i = start; i <= end; i++){
                if(isOdd(i)){
                     total+=i;
                }
            }
            return total;
        }
        return -1;
    }
}
