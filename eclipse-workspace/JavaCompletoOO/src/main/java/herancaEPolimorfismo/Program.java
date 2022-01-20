package herancaEPolimorfismo;

public class Program {
    public static void main(String[] args) {

        Account acc = new Account(1001,"Alex",0.0);
        BusinessAccount businessAccount = new BusinessAccount(1002,"Maria",0.0,500.00);

        //Upcasting

        Account accs = businessAccount;

        Account acc2 = new BusinessAccount(1003,"Bob",0.0,200.00);
        Account acc3 = new SavingsAccount(1004,"Anna",0.0,0.01);

        //Downcasting

        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.00);


        //ClassCastException: class herancaEPolimorfismo.SavingsAccount
        // cannot be cast to class herancaEPolimorfismo.BusinessAccount

        // direcionando o if quando for instancia de classe x ou y

        if(acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.00);
            System.out.println("Loan!");
        }
        if(acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }

        Account account2 = new Account(1001,"Anne",1000.00);
        account2.withDraw(200.00);
        System.out.println(account2.getBalance());

        //Exemplo override
        Account accountSavesAccount = new SavingsAccount
                (1002,"Dudu",1000.00,0.001);
        accountSavesAccount.withDraw(200.00);
        System.out.println(accountSavesAccount.getBalance());

        Account accountBusiness = new BusinessAccount(1003,"Edu",1000.00,0.0001);
        accountBusiness.withDraw(200.00);
        System.out.println(accountBusiness.getBalance());
    }
}
