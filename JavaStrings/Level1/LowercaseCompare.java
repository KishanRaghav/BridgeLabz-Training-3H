import java.util.*;

public class LowercaseCompare {
    static String toLowerCustom(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z') c = (char)(c + 32);
            res += c;
        }
        return res;
    }
    static boolean compareWithCharAt(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) if (s1.charAt(i) != s2.charAt(i)) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String s1 = toLowerCustom(text);
        String s2 = text.toLowerCase();
        System.out.println("Compare: " + compareWithCharAt(s1, s2));
    }
}
