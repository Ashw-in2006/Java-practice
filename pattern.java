import java.util.Scanner;

public class pattern {
void pat(int n){
    for(int i = 0; i < n; i++){
        for(int j = 0; j < n; j++ ){
            System.out.print("*");
        }
        System.out.println();
    }
}    
public static void main(String[]args){
    Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of stars: ");
        int n = sc.nextInt(); 
    pattern obj = new pattern();
    obj.pat(n);
    sc.close();
}
}
