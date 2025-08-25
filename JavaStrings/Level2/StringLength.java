import java.util.*;

public class StringLength {
    static int customLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        int l1 = customLength(text);
        int l2 = text.length();
        System.out.println("Custom Length: " + l1);
        System.out.println("Built-in Length: " + l2);
    }
}