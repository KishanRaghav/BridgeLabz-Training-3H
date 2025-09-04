public class StudentMain {
    public static void main(String[] args) {
        Student s = new Student(101, "Frank", 8.5);
        System.out.println("CGPA: " + s.getCgpa());
        s.setCgpa(9.0);
        System.out.println("Updated CGPA: " + s.getCgpa());
        PostgraduateStudent ps = new PostgraduateStudent(102, "Grace", 9.2);
        ps.display();
    }
}
