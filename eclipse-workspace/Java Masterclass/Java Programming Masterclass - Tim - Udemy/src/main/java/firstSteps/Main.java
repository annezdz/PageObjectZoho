package firstSteps;

public class Main {
    public static void main(String[] args) {

        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Maximun Value : " + myMaxIntValue);
        System.out.println("Integer Minimun Value : " + myMinIntValue);
        System.out.println("Busted Max value : " + (myMaxIntValue + 1));
        System.out.println("Busted Min Value : " + (myMinIntValue - 1));

        int myMaxNumber = 2_147_483_647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;

        long bigLongLiteralValue = 2_147_483_6477L;
        System.out.println("Maximo byte : " + myMaxByteValue);
        System.out.println(bigLongLiteralValue);
        System.out.println("Minimo byte : " + myMinByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Maximo Short : " + myMaxShortValue);
        System.out.println("Minimo Short : " + myMinShortValue);

        long myLongValue = 100l;

        byte myNewByteValue = (byte) (myMinByteValue / 2);

        short myNewShortValue = (short) (myMinShortValue / 2);

        long myMinlongValue = Long.MIN_VALUE;
        long myMaxlongValue = Long.MAX_VALUE;
        System.out.println("Maximo long : " + myMaxlongValue);
        System.out.println("Minimo long : " + myMinlongValue);


        byte myNewByte = 126;
        short myNewShort = 32766;
        int myNewInt = 214748364;
        long myLongNumber = 5000 + (10L * (myNewByte + myNewShort + myNewInt));
        System.out.println(myNewByte);
        System.out.println(myNewShort);
        System.out.println(myNewInt);
        System.out.println(myLongNumber);

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Max float : " + myMaxFloatValue);
        System.out.println("Min float : " + myMinFloatValue);

        double myMindoubleValue = Double.MIN_VALUE;
        double myMaxdoubleValue = Double.MAX_VALUE;
        System.out.println("Max double : " + myMaxdoubleValue);
        System.out.println("Min double : " + myMindoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = 5F / 3F;
        double myDoubleValue = 5D / 3D;
        System.out.println("My Float Value : " + myFloatValue);
        System.out.println("My Int Value : " + myIntValue);
        System.out.println("My Double Value : " + myDoubleValue);
        double pound = 200d;
        double resultKilogram = pound * 0.453592d;
        System.out.println(pound + " Pounds to kilograms is : " + resultKilogram);

        double pi = 3.1415927d;
        System.out.println("PI : " + pi);

        /*
        * Big Decimal devem ser usados para cálculos de precisão
        * */





    }
}
