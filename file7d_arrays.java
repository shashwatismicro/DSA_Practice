package dsa_course;
import java.util.Scanner;
public class file7d_arrays {
    public static int binarySearch(int[] array, int key){
        int start = 0;
        int end = array.length-1;
        while (start<=end){
            int mid = (start+end)/2;
            if (array[mid]==key){
                return mid;
            }
            else if (array[mid]<key){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the key");
        int userKey = sc.nextInt();
        System.out.println("Enter the number of elements in array");
        int n = sc.nextInt();
        int[] userArray = new int[n];
        System.out.println("Enter the elements in ascending order");
        for (int i = 0; i<=userArray.length-1; i++){
            userArray[i] = sc.nextInt();
        }
        int result = binarySearch(userArray,userKey);
        if (result!=-1){
            System.out.println("The index for "+userKey+" starting from 0 is "+result);
        } else {
            System.out.println(userKey+" is not in the array");
        }
    }
}