package bank;
public class FixedDepositAccount extends BankAccount {
    private int tenure;
    public FixedDepositAccount(int accountNumber, double balance, int tenure) {
        super(accountNumber, balance);
        this.tenure = tenure;
    }
    public void displayAccountType() { System.out.println("Fixed Deposit Account"); }
}