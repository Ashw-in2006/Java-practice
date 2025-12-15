import java.util.*;
public class numsum{
  static int fact(int a){
    if(a==0){
        return 0;
    }
    return a+fact(a-1);
    
}
public static void main(String args[]){
    int a=5;
    int ans=fact(a);
    System.out.println(ans);
}
}

  
