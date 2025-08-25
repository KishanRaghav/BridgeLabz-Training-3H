import java.util.*;

public class SplitWordsCompare {
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
    static String[] customSplit(String s) {
        int n = customLength(s);
        int spaces = 0;
        for (int i = 0; i < n; i++) if (s.charAt(i) == ' ') spaces++;
        String[] words = new String[spaces+1];
        int idx = 0;
        String temp = "";
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == ' ') {
                words[idx++] = temp;
                temp = "";
            } else {
                temp += s.charAt(i);
            }
        }
        words[idx] = temp;
        return words;
    }
    static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) if (!a[i].equals(b[i])) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] w1 = customSplit(line);
        String[] w2 = line.split(" ");
        System.out.println("Arrays Equal: " + compareArrays(w1, w2));
    }
}