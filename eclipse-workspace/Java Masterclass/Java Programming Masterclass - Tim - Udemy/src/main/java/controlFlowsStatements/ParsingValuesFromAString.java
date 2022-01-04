package controlFlowsStatements;

public class ParsingValuesFromAString {
    public static void main(String[] args) {
        String numberAsString = "2021";
        System.out.println("Number As String = " + numberAsString);

        int number = Integer.parseInt(numberAsString);
        //double numberToDouble = Double.parseDouble(numberAsString);
        System.out.println("Number is " + number);
        numberAsString +=1;
        number+=1;
        System.out.println("Number As String = " + numberAsString); // Number As String = 20211
        System.out.println("Number is " + number); // Number is 2022


    }
}
