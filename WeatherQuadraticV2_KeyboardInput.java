// Stage 2: Keyboard input for coefficients

import java.util.Scanner;

public class WeatherQuadraticV2_KeyboardInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();

        solveQuadratic(a, b, c);
        scanner.close();
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