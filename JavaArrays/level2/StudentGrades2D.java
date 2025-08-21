import java.util.Scanner;
public class StudentGrades2D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] marks=new int[n][3];
        double[] perc=new double[n];
        char[] grade=new char[n];
        for(int i=0;i<n;i++){
            int p=sc.nextInt(),c=sc.nextInt(),m=sc.nextInt();
            if(p<0||c<0||m<0){i--;continue;}
            marks[i][0]=p;marks[i][1]=c;marks[i][2]=m;
        }
        for(int i=0;i<n;i++){
            perc[i]=(marks[i][0]+marks[i][1]+marks[i][2])/3.0;
            if(perc[i]>=80) grade[i]='A';
            else if(perc[i]>=70) grade[i]='B';
            else if(perc[i]>=60) grade[i]='C';
            else if(perc[i]>=50) grade[i]='D';
            else if(perc[i]>=40) grade[i]='E';
            else grade[i]='R';
        }
        for(int i=0;i<n;i++){
            System.out.println("Physics: "+marks[i][0]+" Chemistry: "+marks[i][1]+" Maths: "+marks[i][2]+" Percentage: "+perc[i]+" Grade: "+grade[i]);
        }
    }
}
