package herancaEPolimorfismo;

public class SavingsAccount extends Account{

    private Double interestRate;

    public SavingsAccount(){};

    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void withDraw(double amount) {
        balance-=amount;
    }

    public void updateBalance() {
        balance+= (balance * interestRate);
    }

    public Double getInterestRate() {
        return interestRate;
    }
}
