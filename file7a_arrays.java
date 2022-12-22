package dsa_course;
import java.util.Scanner;
public class file7a_arrays {
    public static void main(String[] args){
        //percentage calculator
        System.out.println("Enter the number of subjects");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int marks[] = new int[n];
        for (int i = 0; i<= marks.length-1; i++){
            System.out.println("Enter the marks for subject "+(i+1));
            marks[i] = (int) sc.nextFloat();
        }
        for (int i = 0; i<= marks.length; i++){
            System.out.println(marks[i]);
        }
        /*
        float sum = 0;
        for (int i = 0; i<=(n-1); i++){
            sum = sum + marks[i];
        }
        float per = sum/100;
        System.out.println("The percentage is "+per+"%");

         */
    }
}
