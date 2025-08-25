import java.util.*;

public class WordsWithLengths {
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
    static String[][] wordWithLength(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(customLength(words[i]));
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] words = customSplit(line);
        String[][] arr = wordWithLength(words);
        System.out.println("Word\tLength");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][0] + "\t" + Integer.parseInt(arr[i][1]));
        }
    }
}