package session_2lab;
import java.util.Scanner;

public class Calculator {

    
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
    public double add(double a, double b) {
        return a + b;
    }

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();

         System.out.println("Enter two integers:");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        System.out.println("Sum of two integers: " + calc.add(x1, y1));

  
        System.out.println("Enter three integers:");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int z2 = scanner.nextInt();
        System.out.println("Sum of three integers: " + calc.add(x2, y2, z2));

           System.out.println("Enter two double values:");
        double d1 = scanner.nextDouble();
        double d2 = scanner.nextDouble();
        System.out.println("Sum of two doubles: " + calc.add(d1, d2));

        scanner.close();
    }
}

