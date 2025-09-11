public class CourseUMS {
    private String title;
    private Professor professor;
    private StudentUMS student;
public CourseUMS(String title){this.title=title;}
public void assignProfessor(Professor p){this.professor=p;}
public void setStudent(StudentUMS s){this.student=s;}
public String toString(){return title+"("+ (professor==null?"no-prof":professor.getName())+")";}
}
