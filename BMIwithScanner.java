import java.util.Scanner;
public class BMIwithScanner {   
   public static void main(String[] args) {
      Scanner input = new Scanner (System.in);
      System.out.print("input weight(kg) :");
      double w = input.nextDouble();
      System.out.print("input height(m) :");
      double height = input.nextDouble();
      double h = height*0.01;
      double bmi = w/(h*h);
      System.out.println("BMI :"+bmi); 
        
        if (bmi<18.5) {
         System.out.println("น้ําหนักต่ํากว่าเกณฑ์");
      } else if (bmi >= 18.5 && bmi <= 22.9){
         System.out.println("สมส่วน");
      } else if (bmi >= 23.0 && bmi <= 24.9){
         System.out.println("น้ำหนักเกิน");
      } else if (bmi >= 25.0 && bmi <= 29.9){
         System.out.println("โรคอ้วน");
      } else if (bmi>30){
         System.out.println("โรคอ้วนอันตราย");
      }
      
      
   }
}

