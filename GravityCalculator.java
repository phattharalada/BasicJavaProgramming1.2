public class GravityCalculator {
    public static void main(String[] arguments) {
        double a = -9.81;  // Earth's gravity in m/s^2
        double v = 0.0;
        double t = 10.0;
        double xi = 0.0;
        double finalPosition = 0.0;
        double x = 0.5*a*t*t+v*t+xi;
        System.out.println("The object's position after " + t +
                " seconds is " + (float) x + " m.");
    }
}