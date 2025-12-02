import java.util.*;
public class Linear {
    public static void main(String [] args){
        
        Scanner ele = new Scanner(System.in);
        System.out.println("Enter Size of array:");
        int num = ele.nextInt();
        
        int [] arr = new int[num];
        System.out.println("Enter numbers:");
        for (int i = 0; i < num  ; i++){
            
            arr[i]=ele.nextInt();
        }
        System.out.println("Enter element to search:");
        int x = ele.nextInt();
        boolean found = false;
        for (int i = 0; i < num; i++){
            if(arr[i]==x){
                found = true;
            break;
            }
        } 
        if(found){
            System.out.println("Found"); 
        }
        else{
            System.out.println("Not Found");
        }
        ele.close();
    }
}
