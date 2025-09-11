import java.util.ArrayList;
public class Order {
    private String id;
    private ArrayList<Product> products;
public Order(String id){this.id=id;this.products=new ArrayList<>();}
public void addProduct(Product p){products.add(p);}
public double total(){double t=0; for(Product p:products) t+=p.getPrice(); return t;}
public String toString(){return id+" -> "+products.toString();}
}
