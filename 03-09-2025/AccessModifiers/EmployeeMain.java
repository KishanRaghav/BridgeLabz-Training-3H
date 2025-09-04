public class EmployeeMain {
    public static void main(String[] args) {
        Employee e = new Employee(201, "HR", 40000);
        e.setSalary(45000);
        Manager m = new Manager(202, "IT", 60000);
        m.display();
    }
}
