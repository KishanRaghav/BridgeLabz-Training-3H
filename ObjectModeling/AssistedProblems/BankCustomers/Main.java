public class Main {
    public static void main(String[] args){
        Bank bank=new Bank("State Bank");
        Customer alice=new Customer("Alice");
        Customer bob=new Customer("Bob");
        Account a1=bank.openAccount(alice,"SB001");
        Account a2=bank.openAccount(bob,"SB002");
        a1.deposit(1000);
        a2.deposit(500);
        alice.viewBalance();
        bob.viewBalance();
    }
}
