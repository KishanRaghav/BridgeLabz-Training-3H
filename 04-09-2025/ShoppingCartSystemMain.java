public class ShoppingCartSystemMain {
    public static void main(String[] args) {
        ShoppingCartSystem prod1 = new ShoppingCartSystem(201, "Laptop", 55000, 2);
        ShoppingCartSystem.updateDiscount(10.0);
        prod1.displayDetails();
    }
}
