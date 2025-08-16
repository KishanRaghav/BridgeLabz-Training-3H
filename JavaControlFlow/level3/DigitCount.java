
import java.util.Scanner;

public class DigitCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int count = 0;
        int temp = number;

        while (temp != 0) {
            temp = temp / 10;  // Remove last digit
            count++;
        }

        System.out.println("The number " + number + " has " + count + " digits.");
        
    }
}
