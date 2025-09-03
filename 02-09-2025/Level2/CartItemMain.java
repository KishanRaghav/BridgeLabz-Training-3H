package Level2Programs;

public class CartItemMain {
    public static void main(String[] args) {
        CartItem c1 = new CartItem("Shoes", 2000, 2);
        c1.addItem(1);
        c1.removeItem(1);
        c1.displayDetails();
    }
}
