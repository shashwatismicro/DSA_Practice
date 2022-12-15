package dsa_course;
import java.util.Scanner;
public class file3e {
    public static void main(String[] args){
//Continue statement
//Print all the numbers entered by user except the multiples of 10
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a number");
            int j = sc.nextInt();
            if (j % 10 == 0) {
                System.out.println("Your number is a multiple of 10");
                continue;
            }
            System.out.println("Your number is " + j);
        }
    }
}
