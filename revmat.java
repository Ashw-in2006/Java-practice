import java.util.*;
public class revmat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int r = sc.nextInt();
         int c = sc.nextInt();
        // int[][] arr1 = new int[r][c];
        // for(int i = 0; i< r; i++){
        //     for (int j = 0; j < c; j++) {
        //         arr1[i][j] = sc.nextInt();
        //     }
        // }
        // int x = r-1;
        // for(int i=0; i<r ; i++){
        //     for(int l=0 ; l<r ; l++){
        //         int te = arr1[i][l];
        //         arr1 [i][l] = arr1[i][x];
        //         arr1[i][x] = te;
        //         x--;
        //     }
        // }
        // for()
         int arr[][] = new int[r][c];

        for (int i=0; i<arr.length;i++) {
            for(int j = 0; j<arr.length;j++){
                arr[i][j] = sc.nextInt();
            }
        }
         

        for(int i =0; i<r; i++){
                            // a[4] = 5
                for(int j=0 ; j<c/2 ;j++){
                int temp = arr[i][c-1-j]; //a[4]  --> temp = a[4]  ,  temp = 5 ;
                //a[4]  =  a[0]  ;  5 = 1  
                arr[i][c-j-1] = arr[i][j]; //a[4] = 1 {1,2,3,4,1}

                arr[i][j] = temp; // {5,2,3,4,1} 
                }
            
         }
            for(int i= 0; i<r ; i++){
                for(int j = 0; j<r; j++){
                   System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
        

    }
}
