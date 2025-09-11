public class Main {
    public static void main(String[] args){
        School s=new School("Sunrise School");
        Student st1=new Student("Aman");
        Student st2=new Student("Neha");
        s.addStudent(st1);
        s.addStudent(st2);
        Course c1=new Course("Math");
        Course c2=new Course("Physics");
        st1.enrollCourse(c1);
        st1.enrollCourse(c2);
        st2.enrollCourse(c1);
        System.out.println(s);
        System.out.println(c1);
        System.out.println(st1.getName()+" courses: "+st1.getCourses());
    }
}
