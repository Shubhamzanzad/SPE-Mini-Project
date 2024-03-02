package com.example.scientificcalculator;

// sample
import java.util.Scanner;

public class scientificCalculator {
    public static void run() {
        runCalculator();
    }

    public static void runCalculator() {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("Scientific Calculator");
        while (running) {
            System.out.println("1. Square root function (sqrt)");
            System.out.println("2. Factorial function (x!)");
            System.out.println("3. Natural logarithm (ln)");
            System.out.println("4. Power function (x^y)");
            System.out.println("5. Exit");
            System.out.print("\nEnter your choice(1-5): ");
            int choice = scanner.nextInt();

            double num, result;
            switch (choice) {
                case 1:
                    System.out.print("\nEnter a number to find its square root: ");
                    num = scanner.nextDouble();
                    squareRoot(num);
                    break;
                case 2:
                    System.out.print("\nEnter a number to find its factorial: ");
                    num = scanner.nextDouble();
                    result = factorial((int) num);
                    System.out.println("Factorial of " + num + " is " + result);
                    break;
                case 3:
                    System.out.print("\nEnter a number to find its natural logarithm: ");
                    num = scanner.nextDouble();
                    naturalLogarithm(num);
                    break;
                case 4:
                    System.out.print("\nEnter the base: ");
                    num = scanner.nextDouble();
                    System.out.print("Enter the exponent: ");
                    double exponent = scanner.nextDouble();
                    powerFunction(num, exponent);
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("\nInvalid choice!");
                    break;
            }
        }

        System.out.println("Exiting the calculator...");
        scanner.close();
    }

    public static Double squareRoot(Double num) {
        Double result = 0.0;
        if (num < 0) {
            System.out.println("Cannot calculate square root of a negative number.");
        } else {
            result = Math.sqrt(num);
            System.out.println("Square root of " + num + " is " + result);
        }
        return result;
    }

    public static Double naturalLogarithm(Double num) {
        Double result = 0.0;

        if (num <= 0) {
            System.out.println("Natural logarithm is not defined for non-positive numbers.");
        } else if (num == 1) {
            System.out.println("Natural logarithm of " + num + " is 0");
        } else {
            result = Math.log(num);
            System.out.println("Natural logarithm of " + num + " is " + result);
        }
        return result;
    }

    public static Double powerFunction(Double num, Double exponent) {
        double result = 0.0;

        result = Math.pow(num, exponent);
        System.out.println(num + " raised to the power of " + exponent + " is " + result);
        return result;
    }

    public static int factorial(int n) {
        if (n == 0)
            return 1;
        if (n < 0)
            return -1;
        return n * factorial(n - 1);
    }
}
