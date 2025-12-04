import java.util.*;

public class Lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int lcm = LCM(a, b);

        System.out.println("LCM: " + lcm);
    }

    static int LCM(int a, int b) {
        int max =Math.max(a,b);
   
        // keep trying until we find a common multiple
        while (true) {
            if (max % a == 0 && max % b == 0) {
                return max; // found LCM
            }
            max++; // try next number
        }
    }
}
