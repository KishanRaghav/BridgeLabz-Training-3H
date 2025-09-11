import java.util.ArrayList;
public class University {
    private String name;
    private ArrayList<DepartmentU> departments;
public University(String name){this.name=name;this.departments=new ArrayList<>();}
public void addDepartment(DepartmentU d){departments.add(d);}
public void removeAllDepartments(){departments.clear();}
public ArrayList<DepartmentU> getDepartments(){return departments;}
public String toString(){return name+" -> "+departments.toString();}
}
