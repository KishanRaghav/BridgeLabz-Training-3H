import java.util.*;
public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int total=0;
        for(int i=0;i<n;i++)total+=sc.nextInt();
        double per=total/(double)n;
        String grade;
        if(per>=80) grade="A";
        else if(per>=70) grade="B";
        else if(per>=60) grade="C";
        else if(per>=50) grade="D";
        else if(per>=40) grade="E";
        else grade="R";
        System.out.println("Percentage: "+per+" Grade: "+grade);
    }
}