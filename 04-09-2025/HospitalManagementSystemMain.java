public class HospitalManagementSystemMain {
    public static void main(String[] args) {
        HospitalManagementSystem patient1 = new HospitalManagementSystem("Grace", 30, "Flu", 401);
        patient1.displayDetails();
        System.out.println("Total Patients: " + HospitalManagementSystem.getTotalPatients());
    }
}
