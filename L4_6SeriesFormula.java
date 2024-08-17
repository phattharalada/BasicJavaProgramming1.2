import java.util.Scanner;
public class L4_6SeriesFormula {   
   public static void main(String[] args) {
      Scanner input = new Scanner (System.in);
      System.out.print("input a1 : ");
      int a1 = input.nextInt();
      System.out.print("input an : ");
      int an = input.nextInt();
      //process
      double n = (an-a1)+1.0;
      double sum = n*((a1+an)/2.0);
      //Output
      System.out.println(Math.round(sum));
   }
}