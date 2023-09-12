import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Advanced Calculator");
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Select an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Sine (sin)");
        System.out.println("6. Cosine (cos)");
        System.out.println("7. Tangent (tan)");
        System.out.println("8. Natural Logarithm (ln)");
        System.out.println("9. Base 10 Logarithm (log10)");

        int choice = scanner.nextInt();
        double result = 0;

        switch (choice) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero");
                    System.exit(0);
                }
                break;
            case 5:
                result = Math.sin(num1);
                break;
            case 6:
                result = Math.cos(num1);
                break;
            case 7:
                result = Math.tan(num1);
                break;
            case 8:
                result = Math.log(num1);
                break;
            case 9:
                result = Math.log10(num1);
                break;
            default:
                System.out.println("Invalid choice");
                System.exit(0);
        }

        System.out.println("Result: " + result);
        scanner.close();
    }
}