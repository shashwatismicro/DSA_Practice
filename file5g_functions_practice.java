package dsa_course;
import java.util.Scanner;
public class file5g_functions_practice {
    public static boolean checkPalindrome(int n){
        int rev = 0;
        int b = n;
        while (n>0) {
            int lastDigit = n % 10;
            rev = rev * 10 + lastDigit;
            n /= 10;
        }
        if (b == rev) {
            return true;
        } else {
            return false;
        }
        //Very important: A simple return statement: return b==rev; would also do the same
    }
    public static void main(String[] args){
        System.out.println("Enter a number to check whether it is a palindrome or not");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean ans = checkPalindrome(num);
        if (ans){
            System.out.println("Your number is a Palindrome");
        } else {
            System.out.println("Your number is not a Palindrome");
        }
    }
}