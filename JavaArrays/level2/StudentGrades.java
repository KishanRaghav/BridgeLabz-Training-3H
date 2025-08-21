import java.util.Scanner;
public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] phy=new int[n];
        int[] chem=new int[n];
        int[] math=new int[n];
        double[] perc=new double[n];
        char[] grade=new char[n];
        for(int i=0;i<n;i++){
            int p=sc.nextInt(),c=sc.nextInt(),m=sc.nextInt();
            if(p<0||c<0||m<0){i--;continue;}
            phy[i]=p;chem[i]=c;math[i]=m;
        }
        for(int i=0;i<n;i++){
            perc[i]=(phy[i]+chem[i]+math[i])/3.0;
            if(perc[i]>=80) grade[i]='A';
            else if(perc[i]>=70) grade[i]='B';
            else if(perc[i]>=60) grade[i]='C';
            else if(perc[i]>=50) grade[i]='D';
            else if(perc[i]>=40) grade[i]='E';
            else grade[i]='R';
        }
        for(int i=0;i<n;i++){
            System.out.println("Physics: "+phy[i]+" Chemistry: "+chem[i]+" Maths: "+math[i]+" Percentage: "+perc[i]+" Grade: "+grade[i]);
        }
    }
}
