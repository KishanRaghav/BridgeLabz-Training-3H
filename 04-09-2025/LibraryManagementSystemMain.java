public class LibraryManagementSystemMain {
    public static void main(String[] args) {
        LibraryManagementSystem book1 = new LibraryManagementSystem("Java Programming", "John Doe", "ISBN12345");
        LibraryManagementSystem.displayLibraryName();
        book1.displayDetails();
    }
}
