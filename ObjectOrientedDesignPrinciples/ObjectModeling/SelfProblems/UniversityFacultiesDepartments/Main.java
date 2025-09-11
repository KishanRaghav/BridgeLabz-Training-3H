public class Main {
    public static void main(String[] args){
        Faculty f1=new Faculty("Dr. Roy");
        Faculty f2=new Faculty("Dr. Sen");
        DepartmentU d1=new DepartmentU("Chemistry");
        d1.addFaculty(f1);
        University u=new University("City University");
        u.addDepartment(d1);
        System.out.println(u);
        u.removeAllDepartments();
        System.out.println("After deleting university departments: "+u.getDepartments().size());
        System.out.println("Faculty still exists independently: "+f1.getName());
    }
}
