package estruturaSequencial;

import java.util.Locale;

public class SaidaDeDados {
    public static void main(String[] args) {
        double x = 10.35784;
        System.out.println(x);

        Locale.setDefault(Locale.US);
        System.out.printf("%.2f%n",x); // arredondou 10,36

        //Concatenando usando o printf

        System.out.printf("Resultado = %.2f metros%n",x);

        String nome = "Anne";
        int idade = 36;
        double renda = 4000.00;
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n",nome,idade,renda);

    }
}
