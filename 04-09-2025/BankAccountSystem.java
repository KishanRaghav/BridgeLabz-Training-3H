public class BankAccountSystem {
    private static String bankName = "State Bank of India";
    private static int totalAccounts = 0;
    private String accountHolderName;
    private final int accountNumber;

    public BankAccountSystem(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    public void displayDetails() {
        if (this instanceof BankAccountSystem) {
            System.out.println("Bank: " + bankName);
            System.out.println("Account Holder: " + this.accountHolderName);
            System.out.println("Account Number: " + this.accountNumber);
        }
    }
}
