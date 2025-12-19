import java.util.Scanner;
public class BasicMath {

    // Method for Addition
    static int add(int a, int b) {
        return a + b;
    }

    // Method for Subtraction
    static int subtract(int a, int b) {
        return a - b;
    }

    // Method for Multiplication
    static int multiply(int a, int b) {
        return a * b;
    }

    // Method for Division
    static int divide(int a, int b) {
        return a / b;
    }

    // Method for Remainder
    static int remainder(int a, int b) {
        return a % b;
    }

    // Method for Square
    static int square(int a) {
        return a * a;
    }

    // Method for Cube
    static int cube(int a) {
        return a * a * a;
    }

    // Method for Absolute Value
    static int absolute(int a) {
        return Math.abs(a);
    }

    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the first number:");
        int x = sc.nextInt();
        System.out.println("Enter the second number:");
        int y = sc.nextInt();

        System.out.println("Addition: " + add(x, y));
        System.out.println("Subtraction: " + subtract(x, y));
        System.out.println("Multiplication: " + multiply(x, y));
        System.out.println("Division: " + divide(x, y));
        System.out.println("Remainder: " + remainder(x, y));
        System.out.println("Square of x: " + square(x));
        System.out.println("Cube of x: " + cube(x));
        System.out.println("Absolute value of -10: " + absolute(-10));
    }
}
