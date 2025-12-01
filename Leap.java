import java.util.*;
public class Leap {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Year:");
        int a = sc.nextInt();
        int n = a % 4 ,h = a%100 ,f = a%400;
        if(f == 0 || (n==0 && h == 0)){
            System.out.println("Leap Year:" +n);
        }
        else{
            System.out.println("No:"+n);
        }
    }
}
