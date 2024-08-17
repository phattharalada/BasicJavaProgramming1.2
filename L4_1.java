import java.util.Scanner;
public class L4_1 {   
   public static void main(String[] args) {
      Scanner input = new Scanner (System.in);
      System.out.print("input n : ");
      int n = input.nextInt();
      //forloop
      for(int i=1;i<=12;i++){
          System.out.println(n+"*"+i+"= "+n*i);
      }
   }
}