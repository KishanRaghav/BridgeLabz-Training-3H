public class EmployeeManagementSystem {
    private static String companyName = "Tech Solutions";
    private static int totalEmployees = 0;
    private String name;
    private final int id;
    private String designation;

    public EmployeeManagementSystem(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    public void displayDetails() {
        if (this instanceof EmployeeManagementSystem) {
            System.out.println("Company: " + companyName);
            System.out.println("Name: " + this.name);
            System.out.println("ID: " + this.id);
            System.out.println("Designation: " + this.designation);
        }
    }
}
