package dsa_course;
import java.util.Scanner;
import java.lang.Math;
public class java7c_arrays {
    public static int largest(int[] arr){
        int largest1 = Integer.MIN_VALUE;
        for (int i=0; i<arr.length; i++){
            if (largest1<arr[i]){
                largest1=arr[i];
            }
        }
        return largest1;
    }
    public static void main(String[] args){
        System.out.println("Enter the number of elements in array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        System.out.println("Enter the elements of Array");
        for (int i=0; i<= (n-1); i++){
            arr1[i] = sc.nextInt();
        }
        int large = largest(arr1);
        System.out.println(large+" is the largest element in your array");
    }
}