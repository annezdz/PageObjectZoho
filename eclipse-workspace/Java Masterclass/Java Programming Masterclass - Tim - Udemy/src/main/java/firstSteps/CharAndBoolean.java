package firstSteps;

public class CharAndBoolean {
    public static void main(String[] args) {
        /**
         * Char ocupa 2 bytes de memória, ou 16 bits , por conta do Unicode, que usa uma combinação
         * de 2 bytes
         * **/
        char myChar = 'D';

        char myUnicodeChar = '\u0044';
        System.out.println(myChar);
        System.out.println(myUnicodeChar);
        char copyright = '\u00A9';
        System.out.println(copyright);

        /**
         * Boolean nos permite 2 escolhas = True or False, Yes or No ou 1 ou 0.
         * O boolean primitivo pode aceitar apenas dois valores, True or False
         * **/

        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;

        boolean isCustomerOverTwentyOne = true;
    }
}
