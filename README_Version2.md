# Software-Engineering-1

## Weather Modeling using the Quadratic Solution

This is a staged Java implementation demonstrating how to use the quadratic formula for weather modeling, progressing through the following stages:

1. **Hard-coded Variables**
2. **Keyboard Input (Scanner)**
3. **Read from a File (Single Set of Inputs)**
4. **Read from a File (Multiple Sets of Inputs)**

---

### 1. Hard-coded Variables

```java
public class WeatherQuadraticHardCoded {
    public static void main(String[] args) {
        // Example coefficients for ax^2 + bx + c = 0
        double a = 1;
        double b = -3;
        double c = 2;
        solveQuadratic(a, b, c);
    }

    static void solveQuadratic(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;
        if (discriminant < 0) {
            System.out.println("No real roots.");
        } else {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Roots: " + root1 + ", " + root2);
        }
    }
}
```

---

### 2. Keyboard Input

```java
import java.util.Scanner;

public class WeatherQuadraticKeyboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = sc.nextDouble();
        System.out.print("Enter b: ");
        double b = sc.nextDouble();
        System.out.print("Enter c: ");
        double c = sc.nextDouble();
        solveQuadratic(a, b, c);
    }

    static void solveQuadratic(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;
        if (discriminant < 0) {
            System.out.println("No real roots.");
        } else {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Roots: " + root1 + ", " + root2);
        }
    }
}
```

---

### 3. Read from a File (Single Set)

Suppose `input.txt` contains:
```
1 -3 2
```

```java
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WeatherQuadraticFileSingle {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("input.txt"));
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        solveQuadratic(a, b, c);
    }

    static void solveQuadratic(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;
        if (discriminant < 0) {
            System.out.println("No real roots.");
        } else {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Roots: " + root1 + ", " + root2);
        }
    }
}
```

---

### 4. Read from a File (Multiple Sets)

Suppose `input.txt` contains:
```
1 -3 2
1 2 1
2 5 -3
```

```java
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WeatherQuadraticFileMultiple {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("input.txt"));
        while (sc.hasNextDouble()) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();
            System.out.print("For a=" + a + ", b=" + b + ", c=" + c + ": ");
            solveQuadratic(a, b, c);
        }
    }

    static void solveQuadratic(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;
        if (discriminant < 0) {
            System.out.println("No real roots.");
        } else {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Roots: " + root1 + ", " + root2);
        }
    }
}
```

---

> **Note:** In a realistic weather model, coefficients `a`, `b`, and `c` would be derived from weather data. Here, the quadratic equation is used as an example for staged input handling.
> 
