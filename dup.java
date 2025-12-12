import java.util.*;
public class dup{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int var = sc.nextInt();
        int [] arr= new int[var];
        for(int i=0; i<var ; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 1; i<arr.length; i++){

            
                if(arr[i] != arr[i-1]){
                    System.out.print(i);
                }
                else{
                    continue;
                }

            
        }
        
        // for(int i = 0; i<var; i++){
        // System.out.print(arr[i]+" ");
        // }
        
        
    }
}