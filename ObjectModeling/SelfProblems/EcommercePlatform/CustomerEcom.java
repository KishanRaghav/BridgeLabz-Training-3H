public class CustomerEcom {
    private String name;
public CustomerEcom(String name){this.name=name;}
public Order placeOrder(String id){return new Order(id);}
public String getName(){return name;}
}
