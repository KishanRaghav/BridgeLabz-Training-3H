public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount("A101", "Henry", 5000);
        System.out.println("Balance: " + ba.getBalance());
        ba.setBalance(7000);
        System.out.println("Updated Balance: " + ba.getBalance());
        SavingsAccount sa = new SavingsAccount("A102", "Ivy", 10000);
        sa.display();
    }
}
