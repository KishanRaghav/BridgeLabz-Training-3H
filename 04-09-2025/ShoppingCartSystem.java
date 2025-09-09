public class ShoppingCartSystem {
    private static double discount = 5.0;
    private final int productID;
    private String productName;
    private double price;
    private int quantity;

    public ShoppingCartSystem(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    public void displayDetails() {
        if (this instanceof ShoppingCartSystem) {
            System.out.println("Product ID: " + this.productID);
            System.out.println("Name: " + this.productName);
            System.out.println("Price: " + this.price);
            System.out.println("Quantity: " + this.quantity);
            System.out.println("Discount: " + discount + "%");
        }
    }
}
