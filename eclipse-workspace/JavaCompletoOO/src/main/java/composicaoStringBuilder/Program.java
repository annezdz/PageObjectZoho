package composicaoStringBuilder;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.TimeZone;

public class Program {

    public static void main(String[] args) throws ParseException {

        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT"));

        Comment comment1 = new Comment("Have a nic trip");
        Comment comment2 = new Comment("Wow that's awesome");
        Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"),
                "Traveling to New Zealand","Visit New Zealand",12);

        p1.addComment(comment1);
        p1.addComment(comment2);
        System.out.println(p1);
        scanner.close();
    }
}
