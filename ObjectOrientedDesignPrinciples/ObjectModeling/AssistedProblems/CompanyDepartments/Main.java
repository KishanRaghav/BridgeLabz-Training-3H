public class Main {
    public static void main(String[] args){
        Company c=new Company("TechCorp");
        Department d1=new Department("HR");
        Department d2=new Department("Engineering");
        d1.addEmployee(new Employee("Rita"));
        d2.addEmployee(new Employee("Sam"));
        c.addDepartment(d1);
        c.addDepartment(d2);
        System.out.println(c);
        c.removeAll();
        System.out.println("After deleting company departments: "+c.getDepartments().size());
    }
}
