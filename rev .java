import java.util.*;

public class rev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String word = "";

        for (int i = 0; i <= s.length(); i++) {
            if (i == s.length() || s.charAt(i) == ' ') {
                for (int j = word.length() - 1; j >= 0; j--) {
                    System.out.print(word.charAt(j));
                }
                if (i != s.length()) System.out.print(" ");
                word = "";
            } else {
                word += s.charAt(i);
            }
        }
    }
}
