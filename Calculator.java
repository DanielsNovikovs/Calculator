package com.calculator;

import java.util.Scanner;

/**
 * Enterprise-ready Console Calculator Service.
 * Demonstrates clean architecture, OOP principles, and robust error handling.
 */
public class Calculator {

    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }

    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public double modulus(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Modulus by zero is not allowed.");
        }
        return a % b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("=========================================");
        System.out.println("      Java CLI Calculator Service        ");
        System.out.println("=========================================");

        while (running) {
            System.out.println("\nSelect Operation:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Power (^)");
            System.out.println("6. Modulus (%)");
            System.out.println("0. Exit");
            System.out.print("Enter choice (0-6): ");

            if (!scanner.hasNextInt()) {
                System.out.println("Error: Please enter a valid integer option.");
                scanner.next();
                continue;
            }

            int choice = scanner.nextInt();

            if (choice == 0) {
                running = false;
                System.out.println("Exiting Application. Goodbye!");
                break;
            }

            if (choice < 0 || choice > 6) {
                System.out.println("Error: Invalid option selected. Try again.");
                continue;
            }

            System.out.print("Enter first number: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Error: Invalid input. Enter a valid number:");
                scanner.next();
            }
            double num1 = scanner.nextDouble();

            System.out.print("Enter second number: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Error: Invalid input. Enter a valid number:");
                scanner.next();
            }
            double num2 = scanner.nextDouble();

            try {
                double result = 0;
                switch (choice) {
                    case 1:
                        result = calculator.add(num1, num2);
                        break;
                    case 2:
                        result = calculator.subtract(num1, num2);
                        break;
                    case 3:
                        result = calculator.multiply(num1, num2);
                        break;
                    case 4:
                        result = calculator.divide(num1, num2);
                        break;
                    case 5:
                        result = calculator.power(num1, num2);
                        break;
                    case 6:
                        result = calculator.modulus(num1, num2);
                        break;
                }
                System.out.printf(">>> Result: %.4f%n", result);
            } catch (ArithmeticException e) {
                System.out.println("Execution Error: " + e.getMessage());
            }
        }
        scanner.close();
    }
}