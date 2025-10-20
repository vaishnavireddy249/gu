import java.util.*;

class Calculator {
    static double add(double a, double b) {
        return a + b;
    }

    static double subtract(double a, double b) {
        return a - b;
    }

    static double multiply(double a, double b) {
        return a * b;
    }

    static double divide(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;
        do {
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.println("Enter your choice(1-5): ");
            int opt = sc.nextInt();

            if (opt == 5) {
                System.out.println("EXIT");
                break;
            }

            System.out.println("Enter first number:");
            double a = sc.nextDouble();
            System.out.println("Enter second number:");
            double b = sc.nextDouble();
            double res = 0;
            switch (opt) {
                case 1:
                    res = add(a, b);
                    System.out.println("res: " + res);
                    break;
                case 2:
                    res = subtract(a, b);
                    System.out.println("res:" + res);
                    break;
                case 3:
                    res = multiply(a, b);
                    System.out.println("res:" + res);
                    break;
                case 4:
                    if (b == 0) {
                        System.out.println("Error");
                    } else {
                        res = divide(a, b);
                        System.out.println("res" + res);
                    }
                    break;
                default:
                    System.out.println("Invalid choice! please select 1-5.");
            }
            System.out.print("/nDo you want to perform another calculation? (y/n): ");
            choice = sc.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');
        sc.close();
        System.out.println("Calculator closed.");
    }
}