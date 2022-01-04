package firstSteps;

public class DecimalComparator {
    public static void main(String[] args) {

        System.out.println(areEqualByThreeDecimalPlaces(-3.1756,-3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175,-3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0,3.0));


    }

    public static boolean areEqualByThreeDecimalPlaces(double one, double two){
        return ((int) (one * 1000)) == ((int)(two * 1000));
    }


}
