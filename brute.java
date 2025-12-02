import java.util.Scanner;

public class brute {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        for(;;){
            int num = sc.nextInt();
            if (num == 42){
                break;
            }
            System.out.println(num);
        }
        sc.close();
    }
}
