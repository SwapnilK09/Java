import java.util.*;
public class elevator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of the floor : ");
        int f = sc.nextInt();

        switch (f) {
            case 1:
                System.err.println("Reached to Floor 1");
                break;
            case 2:
                System.err.println("Reached to Floor 2");
                break;
            case 3:
                System.err.println("Reached to Floor 3");
                break;
            case 4:
                System.err.println("Reached to Floor 4");
                break;
            case 5:
                System.err.println("Reached to Floor 5");
                break;
        
            default:
                System.err.println("Reached to ground floor");
                break;
        }
    }
}
