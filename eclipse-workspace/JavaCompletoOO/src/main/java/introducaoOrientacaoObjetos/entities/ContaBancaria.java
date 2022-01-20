package introducaoOrientacaoObjetos.entities;

public class ContaBancaria {

    private final double INICIAL_AMOUNT = 100.00;
    private final double TAX_WITHDRAW = 5.00;

    private String name;
    private int numberAccount;
    private double balance;

    public ContaBancaria(String name, int numberAccount) {
        this.name = name;
        this.numberAccount = numberAccount;
    }

    public ContaBancaria(String name, int numberAccount, double initialDeposit) {
        this.name = name;
        this.numberAccount = numberAccount;
        deposit(initialDeposit);
    }

    public String getName() {
        return name;
    }

    public int getNumberAccount() {
        return numberAccount;
    }

    public double getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void deposit(double value) {
        if(value > 0.0) {
            this.balance += value;
        }
    }

    public void withdraw(double value) {
        if((value <= this.balance - TAX_WITHDRAW) && value > 0.0) {
            this.balance -= value - TAX_WITHDRAW;
        } else {
            System.out.println("Insufficient salds.");
        }
    }

    @Override
    public String toString() {
        return "Account " + numberAccount + " , Holder : " + name + " , Balance : " + getBalance();
    }
}
