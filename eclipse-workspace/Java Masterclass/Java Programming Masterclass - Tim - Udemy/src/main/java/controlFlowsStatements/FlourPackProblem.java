package controlFlowsStatements;

public class FlourPackProblem {

    public static void main(String[] args) {
//        System.out.println(canPack(1, 0, 4)); // false
//        System.out.println(canPack(1, 0, 5)); //true
//        System.out.println(canPack(0, 5, 4)); //true
//        System.out.println(canPack(2, 2, 11)); //true
//        System.out.println(canPack(-3, 2, 12)); //false
//        System.out.println(canPack(0, 10, 10)); // true
//        System.out.println(canPack(1, 0, 6)); // false
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        int rest;
        if (bigCount > -1 && smallCount > -1 && goal > -1) {
            rest = goal - (bigCount * 5);
           if((smallCount >= goal) || (bigCount * 5) == goal || (rest > 0 && (smallCount >= rest))) {
               return true;
           }
        }
        return false;
    }
//    System.out.println(canPack(2,1,5)); -- resolved

//    public static boolean canPack(int bigCount, int smallCount, int goal) {
//        if (bigCount < 0 || smallCount < 0 || goal < 0) {
//            return false;
//        }
//        if(goal > ((bigCount * 5) + smallCount)) {
//            return false;
//        }
//
//        if((goal % 5) > smallCount) {
//            return false;
//        }
//        return true;
//    }
}


