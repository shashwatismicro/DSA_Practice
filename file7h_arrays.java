package dsa_course;
import java.util.Scanner;
public class file7h_arrays {
    public static void userInputArray(int[] userArray, int n){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in array");
        n = sc.nextInt();
        System.out.println("Enter the elements one by one");
        for (int i=0; i<=n-1; i++){
            userArray[i] = sc.nextInt();
        }
    }
}