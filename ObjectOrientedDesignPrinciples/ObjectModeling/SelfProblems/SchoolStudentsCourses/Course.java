import java.util.ArrayList;
public class Course {
    private String name;
    private ArrayList<Student> students;
public Course(String name){this.name=name;this.students=new ArrayList<>();}
public void enroll(Student s){students.add(s);}
public ArrayList<Student> getStudents(){return students;}
public String getName(){return name;}
public String toString(){return name+" -> "+students.toString();}
}
