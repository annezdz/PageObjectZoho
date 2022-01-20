package tratamentoDeExcessoes.exercicioExceptions;

import tratamentoDeExcessoes.excessoesPersonalizadasVersaoRuim.application.exceptions.DomainException;

public class Account {

    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account() {}

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withDraw(double amount) {
        if(amount > withdrawLimit) {
            throw new BusinessException("Withdraw error : The amount exceeds withdraw limit");
        } else if(this.balance < amount) {
            throw new BusinessException("Not enough balance.");
        }
        this.balance -= amount;
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

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    @Override
    public String toString() {
        return "New Balance : " + balance;
    }
}
