package dsa_course;
import java.util.Scanner;
//A function to find i)product ii)factorial iii)binomial coeff.;
public class file5c_functions {
    public static int multiply(int a, int b){
        return a*b;
    }
    public static int factorial(int c){
        int n = 1;
        for (int i=1; i<=c; i++){
            n = multiply(i,n);
        }
        return n;
    }
    public static int binomial(int n, int r){
        /*
        formula for binomial coeff. = n!/r!(n-r)!
         */
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int nrFact = factorial(n-r);
        return n_fact/(r_fact*(nrFact));
    }
    public static void main(String[] args){
        System.out.println("This function will find Binomial Coeffs.");
        System.out.println("Enter the value of n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the value of r");
        int r = sc.nextInt();
        float nCr = binomial(n,r);
        System.out.println("The binomial coeff of n = "+n+" and r = "+r+" is "+nCr);
    }
}