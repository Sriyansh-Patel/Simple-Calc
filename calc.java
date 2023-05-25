import java.util.Scanner;

class calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Select an operation: ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        int operation = scanner.nextInt();
        double result = 0;

        switch (operation) {
            case 1:
                result = num1 + num2;
                System.out.println("Addition result: " + result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println("Subtraction result: " + result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println("Multiplication result: " + result);
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Division result: " + result);
                } else {
                    System.out.println("Error: Cannot divide by zero");
                }
                break;
            default:
                System.out.println("Invalid operation");
        }

        scanner.close();
    }
}
