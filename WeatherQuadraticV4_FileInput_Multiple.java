// Stage 4: Read multiple sets of coefficients from a file

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WeatherQuadraticV4_FileInput_Multiple {
    public static void main(String[] args) {
        try {
            Scanner fileScanner = new Scanner(new File("coefficients_multiple.txt"));
            int caseNum = 1;
            while (fileScanner.hasNextDouble()) {
                double a = fileScanner.nextDouble();
                double b = fileScanner.nextDouble();
                double c = fileScanner.nextDouble();
                System.out.println("Case #" + caseNum + ":");
                solveQuadratic(a, b, c);
                System.out.println();
                caseNum++;
            }
            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: coefficients_multiple.txt");
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