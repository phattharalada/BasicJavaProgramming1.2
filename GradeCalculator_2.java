import java.util.Scanner;
public class GradeCalculator_2 {
    public static void main(String args[]) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter score 1(integer): ");
      int s1 = input.nextInt();
      System.out.print("Enter score 2(integer): ");
      int s2 = input.nextInt();
      System.out.print("Enter score 3(integer): ");
      int s3 = input.nextInt();
      System.out.print("Enter score 4(integer): ");
      int s4 = input.nextInt();
      System.out.print("Enter score 5(integer): ");
      int s5 = input.nextInt();
      //process
      double a = (s1+s2+s3+s4+s5)/5.0;
      System.out.println("The student's average grade is "+a);
      //if-else
      if(a>=90 && a<=100){
         System.out.println("The student's letter grade is A");
      } else if (a>=80 && a<=89){
          System.out.println("The student's letter grade is B");
      } else if (a>=70 && a<=79){
          System.out.println("The student's letter grade is C");
      } else if (a>=60 && a<=69){
          System.out.println("The student's letter grade is D");
      } else if (a<=59){
          System.out.println("The student's letter grade is F");
      }

      
    }
}