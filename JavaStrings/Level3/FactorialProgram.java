import java.util.*;
public class FactorialProgram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long f=1;
        for(int i=1;i<=n;i++) f*=i;
        System.out.println(f);
    }
}