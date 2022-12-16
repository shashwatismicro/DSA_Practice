package dsa_course;
import java.util.Scanner;
public class file3g_practice {
    public static void main(String[] args) {
//Print multiplication table and factorial of a number entered by the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int j = 1;
        for (int i = 1; i <= n; i++) {
            j = j*i;
        }
        System.out.println("The factorial of " + n + " is " + j);
        int num = 0;
        int k;
        System.out.println("multiplication table of " + n + " is:");
        for (k = 1; k <= 10; k++) {
            num = k * n;
            System.out.println(n+" x "+k+" = "+num);
        }
    }
}
