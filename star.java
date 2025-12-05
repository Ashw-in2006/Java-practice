import java.util.*;
public class star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int var = sc.nextInt();
        for(int i = 0; i < var; i++){
            for(int j = i; j <= var-1 ; j++){
                System.out.print("* ");
            }System.out.println();
        }
        
    }
}
