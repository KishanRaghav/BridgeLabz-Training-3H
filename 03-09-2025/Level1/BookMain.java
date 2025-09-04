public class BookMain {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Java Programming", "John Doe", 450.0);
        b1.displayDetails();
        b2.displayDetails();
    }
}
