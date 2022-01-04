package firstSteps;

public class SecondsAndMinutes {

    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";
    public static void main(String[] args) {
        System.out.println(getDurationString(65,45));
        getDurationString(-3945);
    }

    public static String getDurationString(int minutes, int seconds){
        if(minutes >= 0 && (seconds >=0 && seconds <= 59)){
            int hours = (minutes / 60);
            int minutesValid = (minutes % 60);
            return (hours + "h " + minutesValid + "m " + seconds + "s");
        }else{
            System.out.println("Invalid Values");
            return "Invalid Values";
        }
    }

    public static String getDurationString(int seconds){
        if(seconds >= 0){
            int minutes = seconds / 60;
            int remainingSeconds = seconds % 60;
            return getDurationString(minutes, seconds);
            //System.out.println("There are " + minutes + " minutes in " + seconds + " seconds.");
        }else{
            System.out.println("Invalid Values");
            return "Invalid Values";
        }
    }
}
