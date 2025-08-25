import java.util.*;

public class ArrayIndexOutOfBoundsDemo {
    static void generate(String[] arr) {
        System.out.println(arr[arr.length]);
    }
    static void handle(String[] arr) {
        try {
            System.out.println(arr[arr.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Handled: " + e);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) arr[i] = sc.next();
       
        handle(arr);
    }
}
