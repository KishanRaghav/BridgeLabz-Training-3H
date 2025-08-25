import java.util.*;

public class StudentGrades {
    static int[][] randomScores(int n) {
        Random r=new Random();
        int[][] arr=new int[n][3];
        for(int i=0;i<n;i++) for(int j=0;j<3;j++) arr[i][j]=r.nextInt(41)+60;
        return arr;
    }
    static String grade(double per) {
        if(per>=80)return "A";
        if(per>=70)return "B";
        if(per>=60)return "C";
        if(per>=50)return "D";
        if(per>=40)return "E";
        return "R";
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] scores=randomScores(n);
        System.out.println("Phy\tChem\tMath\tTotal\tAvg\tPer\tGrade");
        for(int i=0;i<n;i++){
            int total=scores[i][0]+scores[i][1]+scores[i][2];
            double avg=total/3.0;
            double per=Math.round((total/3.0)*100.0/100.0);
            System.out.println(scores[i][0]+"\t"+scores[i][1]+"\t"+scores[i][2]+"\t"+total+"\t"+String.format("%.2f",avg)+"\t"+String.format("%.2f",per)+"\t"+grade(per));
        }
    }
}