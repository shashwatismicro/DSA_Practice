package dsa_course;
import java.util.Scanner;
public class file2c {
    public static void main(String[] args){
        //Calculator
        System.out.println("This is a calculator\n\nUser guide:");
        System.out.println("Multiplication(AxB):M\nDivision(A/B):D\nAddition(A+B):A\nSubtraction(A-B):S\nRemainder(A%B):R");
        System.out.println("\nChoose a letter:");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        System.out.println("Enter the value of A");
        float a = sc.nextFloat();
        System.out.println("Enter the value of B");
        float b = sc.nextFloat();
        float result = 0;
        switch (ch){
            case 'M':
                result = a*b;
                break;
            case 'D':
                result = a/b;
                break;
            case 'A':
                result = a+b;
                break;
            case 'S':
                result = a-b;
                break;
            case 'R':
                result = a%b;
                break;
            default:
                System.out.println("Wrong i/p");;
        }
        System.out.println("Result = "+result);
    }
}
