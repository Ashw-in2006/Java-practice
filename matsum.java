import java.util.*;
public class matsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        
        int arr [][] = new int [R][C];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr.length; j++) {
                arr[i][j]=sc.nextInt();
            }
        }

        // for(int i =0; i<arr.length; i++){
             
        //     for(int j = 0; j<arr.length; j++){
        //         //System.out.print(arr[i][j]+" ");
                // 
            // }
            int a =0;
            int b =0;
        for (int i = 0; i < R; i++) {
            a+=arr[i][i];
            b+=arr[i][arr.length-1-i];
        }
        int c=a+b;
            if(R%2==1){
                c=c-arr[R/2][R/2];
            }
            System.out.println(a);
            System.out.println(c);
    }
}
