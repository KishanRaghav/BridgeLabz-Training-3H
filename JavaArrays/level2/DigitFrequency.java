import java.util.Scanner;
public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        String s=String.valueOf(num);
        int[] freq=new int[10];
        for(int i=0;i<s.length();i++){
            int d=s.charAt(i)-'0';
            freq[d]++;
        }
        for(int i=0;i<10;i++){
            if(freq[i]>0) System.out.println("Digit "+i+" occurs "+freq[i]+" times");
        }
    }
}
