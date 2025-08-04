import java.util.Scanner;


class Calculator {
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
            System.out.println("Error: Cannot divide by zero.");
            return 0;
        }
        return a / b;
    }
}


public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator(); 
        boolean continueCalc = true;

        System.out.println("Welcome to Java OOP Console Calculator ");

        while (continueCalc) {

             System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            
            System.out.println("\nChoose operation: +, -, *, /");
            char operator = scanner.next().charAt(0);

           

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            double result = 0;

            switch (operator) {
                case '+':
                    result = calc.add(num1, num2);
                    break;
                case '-':
                    result = calc.subtract(num1, num2);
                    break;
                case '*':
                    result = calc.multiply(num1, num2);
                    break;
                case '/':
                    result = calc.divide(num1, num2);
                    break;
                default:
                    System.out.println("Invalid operator.");
                    continue;
            }

            System.out.println("Result: " + result);

            System.out.print("Do you want to perform another calculation ? (yes/no): ");
            String choice = scanner.next();
            if (!choice.equalsIgnoreCase("yes")) {
                continueCalc = false;
            }
        }

        scanner.close();
        System.out.println("Calculator closed. Have a great day!");
    }
}


