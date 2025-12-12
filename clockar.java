import java.util.*;
public class clockar {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int var = sc.nextInt();
     int arr[] = new int[var];
     for(int i =0; i< var ; i++){
        arr[i]= sc.nextInt();
     }

     int r = sc.nextInt();

     for(int i =0; i<r; i++){
        int temp = arr[var-1];

        for(int j =var-1; j>0; j--){
        arr[j]=arr[j-1];
     }
     arr[0]= temp;
     }

     for(int i= 0;i<var;i++)
     {
        System.out.print(arr[i]);
     }
    
 }   
}
