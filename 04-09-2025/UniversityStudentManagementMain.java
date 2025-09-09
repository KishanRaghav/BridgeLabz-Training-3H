public class UniversityStudentManagementMain {
    public static void main(String[] args) {
        UniversityStudentManagement student1 = new UniversityStudentManagement("Eve", 301, "A");
        UniversityStudentManagement.displayTotalStudents();
        student1.displayStudentDetails();
    }
}
