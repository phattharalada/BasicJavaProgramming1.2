public class BMI {
    public static void main(String args[]) {
      double w=90,h=156*0.01;
      double bmi = w/(h*h);

      double bmi1 = (double)Math.ceil(bmi);
     System.out.println(bmi1);
      
    }
}