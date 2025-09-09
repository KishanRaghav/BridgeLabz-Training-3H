public class VehicleRegistrationSystem {
    private static double registrationFee = 5000;
    private String ownerName;
    private String vehicleType;
    private final String registrationNumber;

    public VehicleRegistrationSystem(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public void displayDetails() {
        if (this instanceof VehicleRegistrationSystem) {
            System.out.println("Owner: " + this.ownerName);
            System.out.println("Type: " + this.vehicleType);
            System.out.println("Registration Number: " + this.registrationNumber);
            System.out.println("Registration Fee: " + registrationFee);
        }
    }
}
