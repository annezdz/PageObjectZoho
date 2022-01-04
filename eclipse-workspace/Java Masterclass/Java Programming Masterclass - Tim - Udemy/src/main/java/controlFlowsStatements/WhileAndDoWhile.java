package controlFlowsStatements;

public class WhileAndDoWhile {

    public static void main(String[] args) {

//        int count = 0;
//        while (count !=5){
//            System.out.println("Count value is " + count);
//            count++;
//        }

//        for(count = 1; count != 6; count++){
//            System.out.println(count);
//        }

//        int count = 1;
//        while(true){
//            if(count == 6){
//                break;
//            }
//            System.out.println("Count value is " + count);
//            count++;
//        }
        int count = 1;
        do{
            System.out.println("Count value is " + count);
           count++;
        }while (count != 6);

    }
}
