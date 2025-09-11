public class Main {
    public static void main(String[] args){
        StudentUMS s=new StudentUMS("Vikram");
        Professor p=new Professor("Dr. Iyer");
        CourseUMS c=new CourseUMS("Algorithms");
        c.assignProfessor(p);
        s.enrollCourse(c);
        System.out.println(s.getName()+" enrolled in: "+s.getCourses());
    }
}
