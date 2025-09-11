import java.util.ArrayList;
public class StudentUMS {
    private String name;
    private ArrayList<CourseUMS> courses;
public StudentUMS(String name){this.name=name;this.courses=new ArrayList<>();}
public void enrollCourse(CourseUMS c){courses.add(c); c.setStudent(this);}
public ArrayList<CourseUMS> getCourses(){return courses;}
public String getName(){return name;}
public String toString(){return name;}
}
