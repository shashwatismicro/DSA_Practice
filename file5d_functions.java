package dsa_course;
import java.util.Scanner;
public class file5d_functions {
    public static boolean CheckPrime(int a){
        boolean isPrime = true;
        for(int i =2; i<=a-1; i++) {
            if (a % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
    public static void main(String[] args){
        System.out.println("Enter a number to check prime");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        boolean y = CheckPrime(x);
        if (y) {
            System.out.println("It is a prime number");
        }
        else{
            System.out.println("It is a composite number");
        }
    }
}
