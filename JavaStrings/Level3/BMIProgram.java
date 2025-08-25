import java.util.*;
public class BMIProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i=1;i<=10;i++){
            double w = sc.nextDouble();
            double h = sc.nextDouble();
            double bmi = w/(h*h);
            String cat;
            if(bmi<18.5) cat="Underweight";
            else if(bmi<25) cat="Normal";
            else if(bmi<30) cat="Overweight";
            else cat="Obese";
            System.out.println("Member "+i+" BMI: "+bmi+" Category: "+cat);
        }
    }
}