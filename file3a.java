package dsa_course;
import java.util.Scanner;
public class file3a {
    public static void main(String args[]){
    //printing numbers 1 to 10
        int counter = 1;
        while (counter<=10){
            System.out.print(counter);
            counter++;
        }
    //printing n numbers and finding their sum
        System.out.println("\nWrite the valur of n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counter1 = 1;
        int sum = 0;
        while(counter1<=n){
            System.out.print(counter1);
            sum = sum+counter1;
            counter1++;
        }
        System.out.println("\nthe sum is "+sum);
    }
}
