package dsa_course;
import java.util.Scanner;
public class file3d {
//Break statement
//Keep taking user inputs of a number till user enters a multiple of 10
    public static void main(String[] args){
        int j = 1;
        while(j>=1){
            System.out.println("Enter a number");
            Scanner sc = new Scanner(System.in);
            int i = sc.nextInt();
            System.out.println("Your number is "+i);
            j++;
            if (i%10==0){
                break;
            }
        }
        System.out.println("You finally entered a multiple of 10");
    }
}
