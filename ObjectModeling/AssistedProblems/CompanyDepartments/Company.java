import java.util.ArrayList;
public class Company {
    private String name;
    private ArrayList<Department> departments;
public Company(String name){this.name=name;this.departments=new ArrayList<>();}
public void addDepartment(Department d){departments.add(d);}
public void removeAll(){departments.clear();}
public ArrayList<Department> getDepartments(){return departments;}
public String toString(){return name+" -> "+departments.toString();}
}
