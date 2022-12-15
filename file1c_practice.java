package dsa_course;
import java.util.Scanner;
public class file1c_practice {
    public static void main(String args[]){
        /*
        In a program, input 3 numbers : A, B and C. You have to output the average of
        these 3 numbers   (Easy peasy...wont solve)
        : In a program, input the side of a square. You have to output the area of the
        square     (Easy peasy ...wont solve)
        */
        /*: Enter cost of 3 items from the user (using float data type) - a pencil,
        a pen and an eraser. You have to output the total cost of the items
        back to the user as their bill. Add 18% gst on each item
         */
        //Answer:
        System.out.print("Enter prices:\n Item 1 = ₹ ");
        Scanner sc = new Scanner(System.in);
        float a1 = sc.nextFloat();
        System.out.print(a1+"\n Item 2 = ₹ ");
        float a2 = sc.nextFloat();
        System.out.print(a2+"\n Item 3 = ₹ ");
        float a3 = sc.nextFloat();
        System.out.println(a3+"\n Adding 18% GST to each item:");
        float b1 = (float)(a1*0.18)+a1;
        float b2 = (float)(a2*0.18)+a2;
        float b3 = (float)(a3*0.18)+a3;

        System.out.println("Sub total :");
        System.out.println("Item 1 = ₹"+b1+"\nItem 2 = ₹"+b2+"\nItem 3 = ₹"+b3);
        float total = b1+b2+b3;
        System.out.println("Total amount = ₹"+total);
    }
}
