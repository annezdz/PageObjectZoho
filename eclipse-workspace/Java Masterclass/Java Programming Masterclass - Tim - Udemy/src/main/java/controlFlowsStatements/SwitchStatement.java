package controlFlowsStatements;

public class SwitchStatement {

    public static void main(String[] args) {

        int switchValue = 6;

        switch (switchValue){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2 :
                System.out.println("Value was 2");
                break;

            case 3 : case 4 : case 5 :
                System.out.println("was 3 , or 4 , or 5");
                System.out.println("Actually it was a " + switchValue);
                break;

            default:
                System.out.println("Was not 1, 2, 3, 4 or 5");
        }

        char character = 'e';
        switch (character){
            case 'a' : case 'b' : case 'c' : case 'd':
                System.out.println("Found letter " + character);
                break;
            default:
                System.out.println("letters a, b , c or d not found");


        }
    }
}
