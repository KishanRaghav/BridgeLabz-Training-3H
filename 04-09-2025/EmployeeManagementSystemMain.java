public class EmployeeManagementSystemMain {
    public static void main(String[] args) {
        EmployeeManagementSystem emp1 = new EmployeeManagementSystem("Charlie", 1, "Developer");
        EmployeeManagementSystem emp2 = new EmployeeManagementSystem("Diana", 2, "Manager");
        emp1.displayDetails();
        EmployeeManagementSystem.displayTotalEmployees();
    }
}
