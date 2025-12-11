import java.util.*;
public class star {
    void patternA(){
        Scanner sc = new Scanner(System.in);
        int var = sc.nextInt();
        for(int i = 0; i < var; i++){           //Row           //for(int i = 0; i < var; i++)
            for(int j = 0; j< var ; j++){       //Column        //for(int j = i; j <= var-1 ; j++)  for(int j = 0; j <= i ; j++)
                System.out.print("*");
            }
            System.out.println();
    }
}
//------------------------------------------------------------------------------------------------------//
      void patternB(){
        Scanner sc = new Scanner(System.in);
        int var = sc.nextInt();
        for(int i = 0; i < var; i++){           //Row           //for(int i = 0; i < var; i++)
            for(int j = 0; j< var ; j++){       //Column        //for(int j = i; j <= var-1 ; j++)  for(int j = 0; j <= i ; j++)
                System.out.print(j);
            }
            System.out.println();
    }
}
//----------------------------------------------------------------------------------------------------------//
    void patternC(){
        Scanner sc = new Scanner(System.in);
        int var = sc.nextInt();
        for(int i = 1; i <= var; i++){           //Row           //for(int i = 0; i < var; i++)
            for(int j = 1; j <= i ; j++){       //Column        //for(int j = i; j <= var-1 ; j++)  for(int j = 0; j <= i ; j++
                System.out.print(j+" ");
            }
            System.out.println();
    }
}
    //--------------------------------------------------------------------------//
        void patternD(){
        Scanner sc = new Scanner(System.in);
        int var = sc.nextInt();
        int val = 1;
        for(int i = 1; i <= var; i++){           //Row           //for(int i = 0; i < var; i++)
            val = i%2==0 ? 0 : 1;
            for(int j = 1; j <= i ; j++){       //Column        //for(int j = i; j <= var-1 ; j++)  for(int j = 0; j <= i ; j++)
                
                System.out.print(val+" ");
                
                val = val!=0 ? 0 : 1;
            }
            System.out.println();
    }
}
//------------------------------------------------------------------------------------//
        void patternE(){
        Scanner sc = new Scanner(System.in);
        int var = sc.nextInt();
        int val = 1;
        for(int i = 1; i <= var; i++){           //Row           //for(int i = 0; i < var; i++)
            
            for(int j = 1; j <= i ; j++){       //Column        //for(int j = i; j <= var-1 ; j++)  for(int j = 0; j <= i ; j++)
                
                System.out.print(val++);
                System.out.print(" ");
                
            }
            System.out.println();
    }
}
//------------------------------------------------------------------------------------//
    public static void main(String[] args) {
        star ob= new star();
        ob.patternA();

        }
        
    }
    

