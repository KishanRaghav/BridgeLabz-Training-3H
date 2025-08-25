import java.util.*;

public class ShortestLongestWord {
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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] words = customSplit(line);
        String shortest = words[0], longest = words[0];
        for (String w : words) {
            if (customLength(w) < customLength(shortest)) shortest = w;
            if (customLength(w) > customLength(longest)) longest = w;
        }
        System.out.println("Shortest: " + shortest);
        System.out.println("Longest: " + longest);
    }
}