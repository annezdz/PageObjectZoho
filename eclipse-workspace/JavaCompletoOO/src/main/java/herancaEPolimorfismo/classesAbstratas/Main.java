package herancaEPolimorfismo.classesAbstratas;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        //Classe abstrata não pode ser instanciada.

//        Account accNormal = new Account(1001,"Alex",1000.00);
//        Account accSavings = new SavingsAccount(1002,"Maria",1000.00,0.01);
//        Account accBusiness = new BusinessAccount(1003,"Bob",1000.00,500.00);
        List<Account> list = new ArrayList<>();
        list.add(new SavingsAccount(1001,"Alex",500.00,0.01));
        list.add(new BusinessAccount(1002,"Maria",1000.00,0.001));
        list.add(new SavingsAccount(1003,"Anne",1500.00,0.01));
        list.add(new BusinessAccount(1004,"Edu",2000.00,0.01));
        double sum = 0.0;
        for(Account c : list) {
            sum+= c.getBalance();
        }
        System.out.printf("Total balance: %.2f%n", sum);

        for(Account c : list) {
            c.deposit(10.00);
        }
        for(Account c : list) {
            System.out.println(c.getBalance());
        }


    }
}
