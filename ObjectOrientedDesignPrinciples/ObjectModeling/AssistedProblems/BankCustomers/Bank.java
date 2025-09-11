import java.util.ArrayList;
public class Bank {
    private String name;
    private ArrayList<Customer> customers;
public Bank(String name){this.name=name;this.customers=new ArrayList<>();}
public Account openAccount(Customer c, String accNo){
    Account a=new Account(accNo);
    c.addAccount(a);
    if(!customers.contains(c)) customers.add(c);
    return a;
}
public ArrayList<Customer> getCustomers(){return customers;}
}
