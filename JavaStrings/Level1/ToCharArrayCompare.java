import java.util.Scanner;
public class ToCharArrayCompare {
    static char[] toCharArrayCustom(String s) {
        char[] arr = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i);
        }
        return arr;
    }
    static boolean compareArrays(char[] a1, char[] a2) {
        if (a1.length != a2.length) return false;
        for (int i = 0; i < a1.length; i++) {
            if (a1[i] != a2[i]) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        char[] custom = toCharArrayCustom(text);
        char[] builtIn = text.toCharArray();
        System.out.println("Equal: " + compareArrays(custom, builtIn));
    }
}
