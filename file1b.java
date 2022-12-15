package dsa_course;
import java.util.Scanner;
public class file1b {
    public static void main(String args[]){
        /*
        //sum of a and b
        int a = 3;
        int b = 5;
        int sum = a+b;
        System.out.println(sum);
        */
        //taking user i/p
        /*
        Scanner var = new Scanner(System.in);
        String ip = var.next();
        System.out.println(ip);

        String fullname = var.nextLine();
        System.out.println(fullname);

        int number = var.nextInt();
        System.out.println(number);
        */
        //PRODUCT BY USER I/P....AREA OF A CIRCLE
        System.out.println("Enter radius of circle");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        double c = 2*Math.PI*r;
        double ar = Math.PI*r*r;
        System.out.println("Circumference = " +c);
        System.out.println("Area = " +ar);
    }
}
