package firstSteps;

public class OperatorChallenge {
    public static void main(String[] args) {

        double oneValue = 20.00d;
        double secondValue = 80.00d;
        double total = (oneValue + secondValue) * 100.00d;
        System.out.println("My value total is : " + total);
        double reminder = (total % 40.00d);
        System.out.println("The reminder value is : " + reminder);
        boolean checkNumber = (reminder == 0) ? true : false;
        System.out.println("Boolean value is : " + checkNumber);
        if(!checkNumber){
            System.out.println("Got some remainder");
        }

    }
}
