import java.util.Scanner;
public class L4_4Wage {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Input Hourly rate: "); 
        int n = input.nextInt();
        System.out.print("Input number of hours: ");
        int m = input.nextInt();
       
        int normal = 40*n;
       

        if(m>40){
            double extra = m-40;
            System.out.println(normal+(extra*1.5*n));
        } 
        else {
            
            System.out.println(normal);
        }
    }
    
    
}