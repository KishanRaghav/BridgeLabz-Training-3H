import java.util.*;
public class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean prime=true;
        if(n<2) prime=false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){prime=false;break;}
        }
        System.out.println(prime?"Prime":"Not Prime");
    }
}