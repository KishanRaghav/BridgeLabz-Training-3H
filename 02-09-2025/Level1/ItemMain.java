package Level1Programs;

public class ItemMain {
    public static void main(String[] args) {
        Item i1 = new Item(101, "Laptop", 45000);
        i1.displayDetails();
        System.out.println("Total Cost for 2: " + i1.calculateTotalCost(2));
    }
}
