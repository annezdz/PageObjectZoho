package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetExemplo {
    public static void main(String[] args) {

        Set<String> set = new LinkedHashSet<>();

        set.add("TV");
        set.add("Tablet");
        set.add("Notebook");
        set.add("Smarthphone");
        set.add("Split");

       // set.removeIf(c -> c.length() >= 9);
        set.removeIf(c -> c.startsWith("n"));
        set.removeIf(d -> d.charAt(0) == 'S');

        for (String p : set) {
            System.out.println(p);
        }
    }
}
