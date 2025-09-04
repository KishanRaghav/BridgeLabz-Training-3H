public class Circle {
    private double radius;

    public Circle() {
        this(1.0);
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public void displayDetails() {
        System.out.println("Radius: " + radius + ", Area: " + calculateArea());
    }
}
