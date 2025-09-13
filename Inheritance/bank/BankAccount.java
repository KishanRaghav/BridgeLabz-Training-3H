package bank;
public class BankAccount {
    protected int accountNumber;
    protected double balance;
    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}