package dsa_course;
import java.util.Scanner;
public class file5b_function {
    public static void printHelloWorld(){
//Print hello world 10 times
        for (int i=1; i<=10; i++) {
            System.out.println("Hello World");
        }
    }
    public static int adder(int a, int b){
//The function to calculate sum
        int sum = a + b;
        return sum;
    }
    public static void main(String[] args){
//The main function for calling our user defined functions
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Enter another number");
        int y = sc.nextInt();
        int answer = adder(x,y);  //calling the adder
        System.out.println("The sum is : "+answer);
        System.out.println("\n\nPrinting hello world 10 times\n");
        printHelloWorld();  //calling the hello world function
    }
}
