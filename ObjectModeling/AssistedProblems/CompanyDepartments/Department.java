import java.util.ArrayList;
public class Department {
    private String name;
    private ArrayList<Employee> employees;
public Department(String name){this.name=name;this.employees=new ArrayList<>();}
public void addEmployee(Employee e){employees.add(e);}
public ArrayList<Employee> getEmployees(){return employees;}
public String getName(){return name;}
public String toString(){return name+" -> "+employees.toString();}
}
