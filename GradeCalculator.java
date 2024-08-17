import java.util.Scanner;
public class GradeCalculator {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("input score : ");
        int score = input.nextInt();
               
       
        // แบ่งเกรด
        if (score > 100 || score < 0) {
                System.out.print("ไม่สามารถคิดคะแนน");
             }
        else {
            if(score >= 85 && score <= 100) {
                System.out.print("A");
            }
            else if (score >= 75 ) {
                System.out.print("B");
            }
            else if (score >= 65 ) {
                System.out.print("C");
            }
            else if (score >= 55 ) {
                System.out.print("D");
            }
            else{
                System.out.print("F");
            }
        }
    }
}
