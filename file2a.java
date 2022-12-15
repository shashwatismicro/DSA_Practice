package dsa_course;
import java.util.Scanner;
public class file2a {
    public static void main(String args[]){
        System.out.println("Income Tax Department of India");
        System.out.println("Enter your yearly Income");
        Scanner sc = new Scanner(System.in);
        float inc = sc.nextFloat();
        if (inc<=500000){
            float tax = 0;
            float sal = inc-(inc*tax);
            System.out.println("You are paying "+tax+"% tax to the govt.");
            System.out.println("your total tax is ₹" +tax*inc);
            System.out.println("Your total salary is ₹" +sal);
        } else if (inc<=1000000){
            float tax = (float)0.2;
            float sal = inc-(inc*tax);
            System.out.println("You are paying "+tax+"% tax to the govt.");
            System.out.println("your total tax is ₹" +tax*inc);
            System.out.println("Your total salary is ₹" +sal);
        }else {
            float tax = (float)0.3;
            float sal = inc-(inc*tax);
            System.out.println("You are paying "+tax+"% tax to the govt.");
            System.out.println("your total tax is ₹" +tax*inc);
            System.out.println("Your total salary is ₹" +sal);
        }
    }
}
//repeat this again using second syntax
