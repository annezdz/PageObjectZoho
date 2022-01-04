package firstSteps;

public class SpeedConverter {
    public static void main(String[] args) {

        double value = toMilesPerHour(10.25);
        System.out.println(value);
        printConversion(10.25);

    }

    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour < 0){
            return -1;
        }else{
            return Math.round(kilometersPerHour / 1.609);
        }
    }

    public static void printConversion(double kilometersPerHour){
        if(kilometersPerHour < 0){
            System.out.println("Invalid value");
        }else
        {
            long milesPerHour =  toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }

    }
}