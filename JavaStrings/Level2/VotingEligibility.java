import java.util.*;

public class VotingEligibility {
    static int[] randomAges(int n) {
        Random r=new Random();
        int[] arr=new int[n];
        for (int i=0;i<n;i++) arr[i]=r.nextInt(90)+10;
        return arr;
    }
    static String[][] checkVoting(int[] ages) {
        String[][] result=new String[ages.length][2];
        for (int i=0;i<ages.length;i++) {
            result[i][0]=String.valueOf(ages[i]);
            if (ages[i]>=18) result[i][1]="true"; else result[i][1]="false";
        }
        return result;
    }
    public static void main(String[] args) {
        int[] ages=randomAges(10);
        String[][] res=checkVoting(ages);
        System.out.println("Age\tCanVote");
        for (String[] row:res) System.out.println(row[0]+"\t"+row[1]);
    }
}