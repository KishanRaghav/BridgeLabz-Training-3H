import java.util.*;
public class EmployeeSalarySlip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of employees");
        int employees=sc.nextInt();
        System.out.println("Enter names of employees : ");
        String arr[]= new String[employees];
        for (int i = 0; i < employees; i++) {
            arr[i]=sc.next();
        }
        int BasicSalary [] = new int[employees];
        System.out.println("Enter salary of employees : ");
        for (int i = 0; i < employees; i++) {
            BasicSalary[i]=sc.nextInt();
             int HRA= (BasicSalary[i] * 20 / 100);
            int DA= (BasicSalary[i] * 10 / 100);
            int NetSalary = BasicSalary[i] + HRA + DA;
             if(NetSalary > 50000){
            NetSalary = NetSalary - (NetSalary * 10 / 100);
        }

            System.out.println("Salary slip of emoployee "+i + " " + "is "+ "HRA = "+HRA + " DA ="+DA + " Net salary = "+NetSalary );
       
        
        }

       
    }
}
