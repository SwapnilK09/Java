import java.util.*;
public class Voting {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number : ");
            int num = sc.nextInt();
            if(num>18){
                System.out.println("You are eligible for the Voting");
            }
            else{
                System.out.println("Not eligible");
            }
        }
    }