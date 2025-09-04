public class CourseMain {
    public static void main(String[] args) {
        Course c1 = new Course("Java", 6, 15000);
        Course c2 = new Course("Python", 4, 12000);
        c1.displayCourseDetails();
        c2.displayCourseDetails();
        Course.updateInstituteName("Tech Academy");
        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}
