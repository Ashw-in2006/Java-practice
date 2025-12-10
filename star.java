import java.util.*;
public class star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int var = sc.nextInt();
        int val = 1;
        for(int i = 1; i <= var; i++){           //Row           //for(int i = 0; i < var; i++)
            val = i%2==0 ? 0 : 1;
            for(int j = 1; j <= i ; j++){       //Column        //for(int j = i; j <= var-1 ; j++)  for(int j = 0; j <= i ; j++)
                
                System.out.print(val+" ");
                
                val = val!=0 ? 0 : 1;
            }
            System.out.println();
        }
        
    }
}
