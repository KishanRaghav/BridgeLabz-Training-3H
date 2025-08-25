import java.util.*;

public class VowelConsonantType {
    static String type(char c) {
        if ((c>='A'&&c<='Z')) c=(char)(c+32);
        if ((c>='a'&&c<='z')) {
            if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u') return "Vowel";
            else return "Consonant";
        }
        return "Not a Letter";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("Char\tType");
        for (int i=0;i<s.length();i++) {
            char ch=s.charAt(i);
            System.out.println(ch + "\t" + type(ch));
        }
    }
}