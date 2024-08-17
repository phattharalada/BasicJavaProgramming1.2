import java.util.Scanner;
 
public class LeapYear {
 
    public static void main(String[] args) {
         
        Scanner scan = new Scanner(System.in);
         
        System.out.print(" Enter a year : ");
        int year = scan.nextInt();
        
        boolean isleapYear = ((year % 4==0) && (year % 100 != 0)) || (year % 400 == 0);
        
        if (isleapYear){
            System.out.println(year + " is a leap year.");
        }else{
            System.out.println(year + " is not a leap year.");
        }
         
    }
}