public class BookAccessMain {
    public static void main(String[] args) {
        EBook eb = new EBook("12345", "Java Basics", "Tom");
        eb.display();
        eb.setAuthor("Jerry");
        System.out.println("Updated Author: " + eb.getAuthor());
    }
}
