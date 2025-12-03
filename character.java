import java.util.*;
public class character {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char var = sc.next().trim().charAt(0);
        if(var >= 'a' && var <= 'z'){
            System.out.println("Lowercase");
        }
        else{
            System.out.println("Uppercase");
        }
    }
}