import java.util.ArrayList;
public class DepartmentU {
    private String name;
    private ArrayList<Faculty> faculties;
public DepartmentU(String name){this.name=name;this.faculties=new ArrayList<>();}
public void addFaculty(Faculty f){faculties.add(f);}
public ArrayList<Faculty> getFaculties(){return faculties;}
public String toString(){return name+" -> "+faculties.toString();}
}
