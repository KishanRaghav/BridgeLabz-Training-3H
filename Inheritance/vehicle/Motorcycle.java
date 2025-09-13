package vehicle;
public class Motorcycle extends Vehicle {
    private String type;
    public Motorcycle(int maxSpeed, String fuelType, String type) {
        super(maxSpeed, fuelType);
        this.type = type;
    }
    @Override
    public void displayInfo() { System.out.println("Motorcycle: "+type); }
}