public class VehicleMain {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("David", "Car");
        Vehicle v2 = new Vehicle("Eve", "Bike");
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
        Vehicle.updateRegistrationFee(700.0);
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}
