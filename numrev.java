import java.util.*;
public class numrev{
  static void rev(int []arr, int s, int e){
    if(s>=e){
      return;
    }
    int temp = arr[s];
    arr[s] = arr[e];
    arr[e] = temp;
    rev(arr,s+1,e-1);

  }
  public static void main(String[] args) {
    int[] arr = {1,2,3,4,5};
    rev(arr, 0, arr.length-1);
    for(int i =0 ; i<arr.length ; i++){
      System.out.print(arr[i]);
    }
  }
}

  
