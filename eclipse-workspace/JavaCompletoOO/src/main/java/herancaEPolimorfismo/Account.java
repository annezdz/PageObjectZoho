package herancaEPolimorfismo;

public class Account {

    private Integer number;
    private String holder;
    protected Double balance;

    public Account() {}

    public Account(Integer number, String holder, Double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public void withDraw(double amount) {
        if(amount <= this.balance) {
            this.balance-=amount - 5.00;
        } else {
            System.out.println("Insuficient sald");
        }
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public Integer getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public Double getBalance() {
        return balance;
    }
}
