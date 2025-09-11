public class Main {
    public static void main(String[] args){
        CustomerEcom c=new CustomerEcom("Priya");
        Product p1=new Product("Phone",15000);
        Product p2=new Product("Cover",499);
        Order o=c.placeOrder("O1001");
        o.addProduct(p1);
        o.addProduct(p2);
        System.out.println(o);
        System.out.println("Total: "+o.total());
    }
}
