public class VehicleRegistrationSystemMain {
    public static void main(String[] args) {
        VehicleRegistrationSystem vehicle1 = new VehicleRegistrationSystem("Frank", "Car", "REG123");
        VehicleRegistrationSystem.updateRegistrationFee(6000);
        vehicle1.displayDetails();
    }
}
