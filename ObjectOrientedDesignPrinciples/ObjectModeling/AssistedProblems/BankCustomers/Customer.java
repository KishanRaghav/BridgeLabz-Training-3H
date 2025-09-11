import java.util.ArrayList;
public class Customer {
    private String name;
    private ArrayList<Account> accounts;
public Customer(String name){this.name=name;this.accounts=new ArrayList<>();}
public void addAccount(Account a){accounts.add(a);}
public void viewBalance(){for(Account a:accounts) System.out.println(name+" - "+a);}
public String getName(){return name;}
}
