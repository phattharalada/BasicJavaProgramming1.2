import java.util.Scanner;
public class L4_5Divided {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Input n: "); 
        int n = input.nextInt();
        
       for(int i=1 ; i<=n ; i++ ){
           if(n%i==0){
               System.out.println(i);
           }
          
       }
      
    }
    
    
}