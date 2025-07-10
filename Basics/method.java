import java.util.Scanner;

public class method {
    static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();

        int z = add(num1, num2); // Corrected method call
        System.out.println("Sum: " + z);
    }
}