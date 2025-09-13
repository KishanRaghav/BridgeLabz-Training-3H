package employee;
public class Manager extends Employee {
    private int teamSize;
    public Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }
    @Override
    public void displayDetails() { System.out.println("Manager: "+name+", TeamSize: "+teamSize); }
}