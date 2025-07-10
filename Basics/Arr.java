import java.util.*;
public class Arr{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                System.out.println("Enter the array size : ");
                int size = sc.nextInt();
                int[] arr = new int[size];
        System.out.println("Enter the array elements : ");
        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.err.println("Entered numbers are : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}