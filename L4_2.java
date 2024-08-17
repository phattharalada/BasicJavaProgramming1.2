import java.util.Scanner;
public class L4_2 {   
   public static void main(String[] args) {
      Scanner input = new Scanner (System.in);
      System.out.print("input n : ");
      int n = input.nextInt();
      int sum = 0;
      //forloop
      for(int i=1;i<=n;i++){ //set ; con ; round
         
          sum+=i;
      }
      System.out.println(sum);
   }
}