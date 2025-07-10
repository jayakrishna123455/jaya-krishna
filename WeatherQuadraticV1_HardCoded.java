// Stage 1: Hard-coded variables, quadratic solution

public class WeatherQuadraticV1_HardCoded {
    public static void main(String[] args) {
        // Hard-coded coefficients for ax^2 + bx + c = 0
        double a = 1.0;
        double b = -3.0;
        double c = 2.0;

        solveQuadratic(a, b, c);
    }

    static void solveQuadratic(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;
        System.out.println("Solving: " + a + "x^2 + " + b + "x + " + c + " = 0");
        if (discriminant > 0) {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Two solutions: x1 = " + x1 + ", x2 = " + x2);
        } else if (discriminant == 0) {
            double x = -b / (2 * a);
            System.out.println("One solution: x = " + x);
        } else {
            System.out.println("No real solutions.");
        }
    }
}