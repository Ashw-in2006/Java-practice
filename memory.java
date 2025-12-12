import java.util.*;
public class memory{

  static boolean num(String str,int a,int e){
    if(a>e){
        return true;
    }
    if(str.charAt(a)!=str.charAt(e)){
            return false;
    }
    return num(str,a+1,e-1);
  }


public static void main(String[] args) {
    

        String str = "Mohanakkavi";
        // num(str,0,str.length()-1)

        if(num(str,0,str.length()-1)){
            System.out.println("yes");
        }
        else{
            System.out.println("No");
        }

}
}