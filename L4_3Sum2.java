import java.util.Scanner;
public class L4_3Sum2 {   
   public static void main(String[] args) {
      Scanner input = new Scanner (System.in);
      System.out.print("input n : ");
      int n = input.nextInt();
      System.out.print("input m : ");
      int m = input.nextInt();
      int sum = 0;
      
      //forloop
      for(int i=n;i<=m;i++){ //set ; con ; round
         
          sum+=i;
      }
      System.out.println(sum);
   }
}