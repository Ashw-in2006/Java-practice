import java.util.*;
public class ary1 {
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

        for(int i =0; i<arr.length; i++){
            int max=0; 
            for(int j = 0; j<arr.length; j++){
                //System.out.print(arr[i][j]+" ");
                if(arr[i][j]>max){
                    max = arr[i][j];
                }
            }
            System.out.println(max);
        }

    }
    
}
