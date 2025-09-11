public class Account {
    private String accNo;
    private double balance;
public Account(String accNo){this.accNo=accNo;this.balance=0;}
public void deposit(double a){balance+=a;}
public boolean withdraw(double a){if(a<=balance){balance-=a;return true;}return false;}
public double getBalance(){return balance;}
public String getAccNo(){return accNo;}
public String toString(){return accNo+": "+balance;}
}
