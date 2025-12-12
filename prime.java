import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n=sc.nextInt();
        

        if(n/7!=0){
            System.out.println("prime");
        }
        else{
            System.out.println("Not prime");
        }
    }
}
