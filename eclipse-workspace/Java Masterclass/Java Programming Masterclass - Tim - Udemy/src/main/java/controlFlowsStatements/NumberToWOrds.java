package controlFlowsStatements;

public class NumberToWOrds {
    public static void main(String[] args) {
        System.out.println(numberToWords(1));
        System.out.println(numberToWords(123));
        System.out.println(numberToWords(-12));
        System.out.println(numberToWords(5200));
        System.out.println(numberToWords(1010));
        System.out.println(numberToWords(1000));
        System.out.println(numberToWords(10000));
    }
    public static String numberToWords(int number){
        int remainder = 0;
        int inverseNumber = reversedNumber(number);
        int countDigitsInversedNumber = getDigitCount(inverseNumber);
        int countDigitNumber = getDigitCount(number);
        String numberInWords = "";
        if(inverseNumber < 0){
            return "-1";
        }
        while (inverseNumber != 0){
           remainder = inverseNumber % 10;
           switch (remainder){
               case 0 :
                   numberInWords+= "Zero ";
                   break;
               case 1 :
                   numberInWords+= "One ";
                   break;
               case 2 :
                   numberInWords+= "Two ";
                   break;
               case 3 :
                   numberInWords+= "Three ";
                   break;
               case 4 :
                   numberInWords+= "Four ";
                   break;
               case 5 :
                   numberInWords+= "Five ";
                   break;
               case 6 :
                   numberInWords+= "Six ";
                   break;
               case 7 :
                   numberInWords+= "Seven ";
                   break;
               case 8 :
                   numberInWords+= "Eight ";
                   break;
               case 9 :
                   numberInWords+= "Nine ";
                   break;
           }
           inverseNumber /= 10;
       }
        if(countDigitsInversedNumber < countDigitNumber){
            int insert = countDigitNumber - countDigitsInversedNumber;
            for(int i = 0; i < insert;i++){
                numberInWords+="Zero ";
            }
        }
        return numberInWords;
    }

    public static int reversedNumber(int number) {
        int reverseNumber = 0;
        while (number != 0) {
            reverseNumber = reverseNumber * 10 +  (number % 10);
            number /= 10;
        }
        return reverseNumber;
    }
    public static int getDigitCount(int number) {
        int count = 0;
        while (number != 0) {
            count++;
            number /= 10;
        }
        return count;
    }
}
