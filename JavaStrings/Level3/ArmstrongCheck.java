import java.util.*;
public class ArmstrongCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=n,sum=0,d=(int)Math.log10(n)+1;
        while(t>0){
            int r=t%10;
            sum+=Math.pow(r,d);
            t/=10;
        }
        System.out.println(sum==n?"Armstrong":"Not Armstrong");
    }
}