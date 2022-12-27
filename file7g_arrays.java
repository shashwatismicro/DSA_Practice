package dsa_course;
import java.util.Scanner;
public class file7g_arrays {
//Print sub arrays
    public static void subArray(int[] arr, int n){
        for (int i=0; i<n; i++){
            int start = i;
            for (int j=i; j<n; j++){
                int end = j;
                for (int k=start; k<=end; k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
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
        subArray(userArray,n);
        int totSubArr = n*(n+1)/2;
        System.out.println("Total sub arrays printed = "+totSubArr);
    }
}