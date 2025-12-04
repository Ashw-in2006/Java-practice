import java.util.*;
public class vowel {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String a  = sc.nextLine();
    a = a.toLowerCase();
    int count = 0;
    for(int i=0; i<a.length(); i++){
        char ch = a.charAt(i);
        if(ch=='a'||ch=='e'||ch=='o'||ch == 'i'||ch == 'u'){
            count++;
        }
        
    }
    System.out.println(count);
}    
}
