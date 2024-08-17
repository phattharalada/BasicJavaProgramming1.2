import java.util.Scanner;
public class IfElse {
    public static void main(String args[]) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a number(integer): ");
      int n = input.nextInt();
      
      if(n==0){
         System.out.println("The number is zero.");
      } else if (n>0){
          System.out.println("The number is positive.");
      } else if (n<0){
          System.out.println("The number is negative.");
      }

      
    }
}