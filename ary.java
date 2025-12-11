import java.util.*;
public class ary {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5}; 

        for(int i =0; i<arr.length/2; i++){
                            // a[4] = 5
            int temp = arr[arr.length-i-1]; //a[4]  --> temp = a[4]  ,  temp = 5 ;
                //a[4]  =  a[0]  ;  5 = 1  
            arr[arr.length-i-1] = arr[i]; //a[4] = 1 {1,2,3,4,1}

            arr[i] = temp; // {5,2,3,4,1} 
         }

        System.out.println(Arrays.toString (arr));
    }
       
}
