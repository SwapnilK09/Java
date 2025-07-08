import java.util.*;
public class switchcase {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.err.println("Enter the day  : ");
        String day = scr.nextLine();

        switch (day) {
        case "Monday":
                System.err.println("1");
                break;
        case "Tuesday":
                System.err.println("2");
                break;
        case "Wednesday":
                System.err.println("3");
                break;
        case "Thursday":
                System.err.println("4");
                break;
        case "Friday":
                System.err.println("5");
                break;
        case "Saturday":
                System.err.println("6");
                break;
        case "Sunday":
                 System.err.println("7Sun");
                break;
        
            default:
                System.err.println("Enter a valid input");
                break;
        }
    }
}
