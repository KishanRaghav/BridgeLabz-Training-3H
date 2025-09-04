public class LibraryBookMain {
    public static void main(String[] args) {
        LibraryBook lb = new LibraryBook("Data Structures", "Mark Smith", 300.0);
        lb.displayDetails();
        System.out.println("Borrow success: " + lb.borrowBook());
        lb.displayDetails();
    }
}
