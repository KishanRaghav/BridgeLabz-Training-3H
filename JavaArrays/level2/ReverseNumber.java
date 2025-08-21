import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        String s=String.valueOf(num);
        int[] digits=new int[s.length()];
        for(int i=0;i<s.length();i++) digits[i]=s.charAt(i)-'0';
        for(int i=digits.length-1;i>=0;i--) System.out.print(digits[i]);
    }
}
