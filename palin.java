import java.util.Scanner;
public class palin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String text = " ";
        for(int i = str.length()-1;i>=0 ;i--){
            text = text + str.charAt(i);
            
        
        }
        System.out.println(text);
        

    }
}
