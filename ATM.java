import java.util.*;
public class ATM {                                  // ATM person 10,000 . withdraw 500 repeatedly . bal < 500.
    public static void main(String[] args) {
         // Scanner sc = new Scanner(System.in);
        // int person = 10000;
        // int withdraw = sc.nextInt();
        // ///int debit = sc.nextInt();
        // //int balance = sc.nextInt();
        // int balance = person -withdraw;
        // for(int i = 0 ; i<person ; i++){
            
        //     if(balance<500){
                     
        //     }
           
           
        // }
        //  System.out.println(balance);
        // ---------------------------------------------start--------------------------------------------------  //
        // int bal = sc.nextInt();      //10,000
        // int with = sc.nextInt();         //500
        // while(bal>=with){
        //     bal -=with;
        //     System.out.println(bal);
        // }
        // ------------------------------------------------water----------------------------------------------- //
        // int fil = 3;
        // int min = 0 ;
        // int cap = 100;
        // int cur = 0;

        // while (cur<cap) {
        //     cur+=fil;
        //     min++;
        //     System.out.println(""+min+""+cur);
        // }
        // System.out.println(min);
        // ------------------------------------------------mobile battery--------------------------------------  //
        // int start = 100;
        // int min = 5;
        // int red = 3;
        // int end = 20;
        // while (start>end) {
        //     start=start-red;
        //     min++;
        //     System.out.println(start);
        // }
        // System.out.println(min);
        // ----------------------------------------------sal increment----------------------------------------  //
        double sal = 20000;
        int next = 10; 
        for(int i =0; i<next; i++){
                sal = sal + sal * 0.08;
                System.out.println(next+""+sal);
        }



    }
}
