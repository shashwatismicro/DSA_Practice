package dsa_course;
import java.util.Scanner;
import java.lang.Math;
public class file5f_functions {
    public static int dcb(int n){
        int pow = 0;
        int bin = 0;
        while (n>0){
            int lastDigit = n%2;
            bin = bin + lastDigit * (int) Math.pow(10,pow);
            pow++;
            n /= 2;
        }
        return bin;
    }
    public static void main(String[] args){
        System.out.println("Enter the decimal number");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("The binary code for "+x+" is:\n"+dcb(x));
    }
}