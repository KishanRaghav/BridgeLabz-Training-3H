import java.util.ArrayList;
public class School {
    private String name;
    private ArrayList<Student> students;
public School(String name){this.name=name;this.students=new ArrayList<>();}
public void addStudent(Student s){students.add(s);}
public ArrayList<Student> getStudents(){return students;}
public String toString(){return name+" -> "+students.toString();}
}
