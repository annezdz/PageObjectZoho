package controlFlowsStatements;

public class EvenNumber {

    public static void main(String[] args) {

        System.out.println(isEvenNumber(2));
        System.out.println(isEvenNumber(1));
        int number = 4;
        int finishNumber = 20;
//
//        while(number <= finishNumber){
//            number++;
//            if(!isEvenNumber(number)){
//                continue;
//            }
//            System.out.println("Even number " + number);
//        }

        int total = 0;
        int count = 0;

        do{
            number++;
            if(!isEvenNumber(number)){
                continue;
            }
            System.out.println("Even number " + number);
            total+=number;
            count++;
            if(count == 5){
                break;
            }
        }while (number <= finishNumber);
        System.out.println("Total is " + total);
    }

    public static boolean isEvenNumber(int number){
        return (number % 2 == 0)? true : false;

    }
}
