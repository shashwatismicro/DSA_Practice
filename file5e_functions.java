package dsa_course;
import java.util.Scanner;
import java.lang.Math;
public class file5e_functions {
    public static int bcd(int n){
        int pow = 0;
        int dec = 0;
        while(n>0){
            int lastDigit = n%10;
            dec = dec + lastDigit * (int)Math.pow(2,pow);
            pow++;
            n /= 10;
        }
        return dec;
    }
    public static void main(String[] args){
        System.out.println("Enter your binary number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The decimal value for "+n+" is: \n"+bcd(n));
    }
}