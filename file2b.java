package dsa_course;
import java.util.Scanner;
public class file2b {
    public static void main(String args[]){
        System.out.println("Income Tax Dept. of India");
        System.out.println("Enter your income");
        Scanner sc = new Scanner(System.in);
        float inc = sc.nextFloat();
        float tax;
        if (inc<500000){
            tax = 0;
        }
        else if (inc>=500000 && inc <1000000){
            tax = 0.2f;
        }
        else{
            tax = 0.3f;
        }
        float tax_amt = inc*tax;
        float sal = inc - tax_amt;
        System.out.println("Your income report:\nYou pay "+tax+"% tax to the govt.");
        System.out.println("Your total tax amount is: ₹"+tax_amt);
        System.out.println("You get an yearly salary of: ₹"+sal);
    }
}
/*
ternary operator:
Syntax - variable = (condition)? statement 1 : statement 2
                                    true          false

for string type variable check if even or odd:
            System.out.println("Enter a number")
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            String st = (n%2==0)?"Even":"Odd";
            System.out.println(st);
 */