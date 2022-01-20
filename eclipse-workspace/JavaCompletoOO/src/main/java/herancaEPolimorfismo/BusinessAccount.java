package herancaEPolimorfismo;

public class BusinessAccount extends Account {

    private Double loanLimit;

    public BusinessAccount() {};

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public void loan(double amount) {
        if(amount <= loanLimit) {
            balance+= amount - 10.0;
        }
    }

    //Exemplo Super , acrescentando algo no método pai (Account)


    @Override
    public void withDraw(double amount) {
        super.withDraw(amount);
        balance-=2;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }
}
