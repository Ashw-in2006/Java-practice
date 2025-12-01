import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input:");
        int n = sc.nextInt();

        int f = 0;
        int s = 1;
        System.out.print("Output :");
        for (int i = 0; i < n; i++) {
            System.out.print(" " + f);
            int t = f + s;
            f = s;
            s = t;

        }

    }
}
