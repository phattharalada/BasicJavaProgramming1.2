public class Quadratic {
    public static void main(String args[]) {
      int a=1,b=3,c=-4;
      double r = (b*b)-(4*a*c);
      double sq = Math.sqrt(r);
      double x1 = (-b+sq)/(2*a),x2 = (-b-sq)/(2*a);

      System.out.println((int)x1);
      System.out.println((int)x2);
    }
}