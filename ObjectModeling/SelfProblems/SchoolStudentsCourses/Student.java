import java.util.ArrayList;
public class Student {
    private String name;
    private ArrayList<Course> courses;
public Student(String name){this.name=name;this.courses=new ArrayList<>();}
public void enrollCourse(Course c){courses.add(c); c.enroll(this);}
public ArrayList<Course> getCourses(){return courses;}
public String getName(){return name;}
public String toString(){return name;}
}
