package firstSteps;

public class PrintYearsAndDays {
    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);

    }
    public static void printYearsAndDays(long minutes){
        if(minutes > 0){
            long years = ((minutes / 60) / 24) / 365;
            long days  = (minutes / 60 / 24)  % 365 ;
            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }
}
