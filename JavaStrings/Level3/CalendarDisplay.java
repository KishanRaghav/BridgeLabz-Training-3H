import java.util.*;
import java.time.*;
public class CalendarDisplay {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int y=sc.nextInt(),m=sc.nextInt();
        LocalDate d=LocalDate.of(y,m,1);
        int len=d.lengthOfMonth();
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        int space=d.getDayOfWeek().getValue()%7;
        for(int i=0;i<space;i++)System.out.print("    ");
        for(int i=1;i<=len;i++){
            System.out.printf("%3d ",i);
            if((i+space)%7==0)System.out.println();
        }
    }
}