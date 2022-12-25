package dsa_course;
import java.util.Scanner;
import java.util.Arrays;
public class file7e_arrays {
    public static void reverseArray(int[] arr){
        int start = 0; int end = arr.length-1;
        while (start<end){
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = sc.nextInt();
        int[] userArray = new int[n];
        System.out.println("Enter the elements");
        for (int i=0; i<=(n-1); i++){
            userArray[i] = sc.nextInt();
        }
        System.out.println("Your array is "+ Arrays.toString(userArray));
        reverseArray(userArray);
        System.out.println("Your reversed array is "+ Arrays.toString(userArray));
    }
}