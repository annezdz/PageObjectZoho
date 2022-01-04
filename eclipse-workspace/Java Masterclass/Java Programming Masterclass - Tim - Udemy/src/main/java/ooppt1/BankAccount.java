package ooppt1;

public class BankAccount {

    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    // construtor com valores padrões

    public BankAccount() {
        this("1234", 2.5,"Default name","Defaul email","default phone");
        System.out.println("Empty constructor called");
    }

    public BankAccount(String accountNumber, double balance, String customerName, String email, String phoneNumber) {
        System.out.println("Account constructor with parametes called. ");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this("99999",100.55,customerName,email,phoneNumber);
    }

    public String getAccountNumber() {
        return this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setAccountNumber( String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double value) {
         this.balance += value;
        System.out.println("Deposit of R$ " + value);
    }

    public void withDray(double value) {
        if(value <= this.balance) {
            this.balance -= value;
            System.out.println("WithSdrawal of " + value + " processed.");
        } else {
            System.out.println("Insuficient funds. Please check yous balance and choice another value.");
        }
    }
}
