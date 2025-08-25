import java.util.Scanner;
public class SubstringCompare {
    static String substringUsingCharAt(String s, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += s.charAt(i);
        }
        return result;
    }
    static boolean compareUsingCharAt(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();
        String custom = substringUsingCharAt(text, start, end);
        String builtIn = text.substring(start, end);
        boolean equal = compareUsingCharAt(custom, builtIn);
        System.out.println("Custom: " + custom);
        System.out.println("Built-in: " + builtIn);
        System.out.println("Equal: " + equal);
    }
}

