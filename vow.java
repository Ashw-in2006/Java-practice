import java.util.Scanner;

public class vow {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String a  = sc.nextLine();
    
    for(int i=0; i<a.length();i++){
        int temp = a.charAt(i)-32;
        System.out.print((char)temp);
    }
    
    int count = 0;
    for(int i=0; i<a.length(); i++){
        char ch = a.charAt(i);
        if(ch=='a'||ch=='e'||ch=='o'||ch == 'i'||ch == 'u'){
            count++;
        }
        
    }
    // System.out.println("\n"+count);
}    
}
