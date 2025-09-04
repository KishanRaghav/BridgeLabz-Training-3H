public class PersonMain {
    public static void main(String[] args) {
        Person p1 = new Person("Alice", 25);
        Person p2 = new Person(p1);
        p1.displayDetails();
        p2.displayDetails();
    }
}
