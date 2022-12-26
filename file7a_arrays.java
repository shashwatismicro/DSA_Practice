package dsa_course;
import java.util.Scanner;
public class file7a_arrays {
//percentage calculator
    public static float per(int[] marks, int sub){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i=0; i<=sub-1; i++){
            marks[i] = sc.nextInt();
            sum += marks[i];
        }
        return (float)(sum/sub);
    }
    public static void main(String[] args){
        System.out.println("Enter the number of subjects");
        Scanner sc = new Scanner(System.in);
        int totSub = sc.nextInt();
        int[] userMarks = new int[totSub];
        System.out.println("Enter the marks of all the "+totSub+" subjects one by one");
        float totPer = per(userMarks,totSub);
        System.out.println("You got "+totPer+"%");
    }
}