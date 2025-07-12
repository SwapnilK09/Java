import java.util.Scanner;

public class method {
    static int add(int num1,int num2) {
        //return a + b;
        System.out.println("Sum: " + (num1 + num2)); // Print the sum directly
        return 0;1
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        add(num1, num2);
        //int z = add(num1, num2); // Corrected method call
        //System.out.println("Sum: " + z);
    }
}