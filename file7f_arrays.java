package dsa_course;
import java.util.Scanner;
public class file7f_arrays {
    public static void printPairs(int[] arr, int elements){
        for (int i=0; i<elements; i++){
            int curr = arr[i];
            for (int j=i+1; j<elements; j++){
                System.out.print("("+curr+", "+arr[j]+")");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in array");
        int n = sc.nextInt();
        int[] userArray = new int[n];
        System.out.println("Enter the elements one by one");
        for (int i=0; i<=n-1; i++){
            userArray[i] = sc.nextInt();
        }
        printPairs(userArray,n);
    }
}
