package exercicioSet;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Course> alunos = new ArrayList<>();

        int code = 0;
        do {
            System.out.print("Enter your code: ");
            code = scanner.nextInt();
            if(code == -1) {
                break;
            }
            System.out.print("Course : (A / B / C): ");
            scanner.nextLine();
            String course = scanner.nextLine();
            alunos.add(new Course(course,new User(code)));
        } while (code != -1);


}
}
