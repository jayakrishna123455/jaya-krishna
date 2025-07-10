// Stage 3: Read coefficients from a file (single set)

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WeatherQuadraticV3_FileInput_Single {
    public static void main(String[] args) {
        try {
            Scanner fileScanner = new Scanner(new File("coefficients.txt"));
            if (fileScanner.hasNextDouble()) {
                double a = fileScanner.nextDouble();
                double b = fileScanner.nextDouble();
                double c = fileScanner.nextDouble();
                solveQuadratic(a, b, c);
            } else {
                System.out.println("File does not contain valid coefficients.");
            }
            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: coefficients.txt");
        }
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