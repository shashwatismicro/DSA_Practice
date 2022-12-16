package dsa_course;
import java.util.Scanner;
public class file3f {
    public static void main(String args[]){
//Check if a number is prime or not
        Scanner sc = new Scanner(System.in);
        System.out.println("This is a prime number checker\nPress 0 to exit");
        while (true){
            System.out.println("Enter your number");
            int n = sc.nextInt();
            boolean checkPrime = true;
            for (int i = 2; i<=(n-1); i++){
                if (n%i==0){
                    checkPrime = false;
                }
            }
            if (checkPrime){
                System.out.println(n+" is a prime number");
            }else {
                System.out.println(n+" is a composite number");
            }
            if (n==0){
                System.out.println("Fact: zero is neither prime nor composite");
                break;
            }
        }
    }
}