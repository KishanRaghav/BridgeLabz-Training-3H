public class BankAccountSystemMain {
    public static void main(String[] args) {
        BankAccountSystem acc1 = new BankAccountSystem("Alice", 101);
        BankAccountSystem acc2 = new BankAccountSystem("Bob", 102);
        acc1.displayDetails();
        System.out.println("Total Accounts: " + BankAccountSystem.getTotalAccounts());
    }
}
