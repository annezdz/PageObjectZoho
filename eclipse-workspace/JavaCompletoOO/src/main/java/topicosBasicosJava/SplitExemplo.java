package topicosBasicosJava;

public class SplitExemplo {
    public static void main(String[] args) {
        String s = "potato apple lemon";

        String[] vetor = s.split(" ");
        System.out.println(vetor[0]);
        System.out.println(vetor[1]);
        System.out.println(vetor[2]);
    }
}
