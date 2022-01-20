package topicosBasicosJava;

import java.util.Locale;

public class StringExemplos {
    public static void main(String[] args) {

        String original = "   abcde FGHI ABC abc DEFG   ";

        System.out.println(original);
        String s01 = original.toLowerCase();
        String s02 = original.toUpperCase();
        String s03 = original.trim();
        String s04 = original.substring(4);
        String s05 = original.substring(5,10);
        String s06 = original.replace('a','x');
        String s07 = original.replace("abc","xyz");
        int i = original.indexOf("bc");
        int j = original.lastIndexOf("bc");
        System.out.println(s01);
        System.out.println(s02);
        System.out.println(s03);
        System.out.println(s04);
        System.out.println(s05);
        System.out.println(s06);
        System.out.println(s07);
        System.out.println(i);
        System.out.println(j);
    }
}
