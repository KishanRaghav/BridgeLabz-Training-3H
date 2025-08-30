import java.util.*;
public class CricketScoreAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of batsman :");
        int n=sc.nextInt();
        System.out.println("Enter runs scored by each batsman :");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
        arr[i]=sc.nextInt();
    }
    int highest=Integer.MIN_VALUE;
    int lowest=Integer.MAX_VALUE;
    for(int i=0; i<n; i++){
        if(arr[i]>highest){
            highest=arr[i];
        }
        else if(arr[i]<lowest){
            lowest=arr[i];
        }
    }

    System.out.println("Lowest score is "+lowest);
    System.out.println("Highest score is "+highest);
     int total_score=0;
    for (int i = 0; i < arr.length; i++) {
        if(arr[i]>=100){
            System.out.println("BNatsman "+ i + " is Century Scorer");
        }
        total_score+=arr[i];
        
    }
    System.out.println("total score is "+total_score);
    int average_score=total_score/n;
    System.out.println("average score is "+average_score);
    }
}
