import java.util.*;

public class CompareStrings {
    static boolean compareWithCharAt(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        boolean b1 = compareWithCharAt(s1, s2);
        boolean b2 = s1.equals(s2);
        System.out.println("CharAt Compare: " + b1);
        System.out.println("Equals Compare: " + b2);
    }
}
