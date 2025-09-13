package bank;
public class CheckingAccount extends BankAccount {
    private double withdrawalLimit;
    public CheckingAccount(int accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }
    public void displayAccountType() { System.out.println("Checking Account"); }
}