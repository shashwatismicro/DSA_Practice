package dsa_course;
import  java.util.Scanner;
public class file7b_arrays {
//Linear Search
    public static int linearsearch(int[] arr, int key){
        for (int i = 0; i<= arr.length; i++){
            if (arr[i]==key){
                return i;
            } else {
                return -1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want to enter");
        int n = sc.nextInt();
        System.out.println("Enter "+n+" elements");
        int[] numbers = new int[n];
        for (int i=0; i<=(n-1); i++){
            numbers[i] = sc.nextInt();
        }
        System.out.println("Enter the key for linear search");
        int key = sc.nextInt();
        int y = linearsearch(numbers,key);
        if (y!=-1){
            System.out.println("The index of "+key+" starting from 0 is "+y);
        } else {
            System.out.println("""
                Your key is not the element of your array
                Please try again""");
        }
    }
}