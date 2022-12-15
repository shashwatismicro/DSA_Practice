package dsa_course;
import java.util.Scanner;
public class file3b {
    public static void main(String[] args){
    //For loop syntax
    /*
    for(initialization; condition; updation){
             // code ..do something
             }
     */
    //Print hello world 10 times
        for (int i = 1; i<=10; i++){
            System.out.println("Hello worlds");
        }
    //Print square pattern of asterics 5x5
        for(int i = 1; i<=5; i++){
            System.out.println("* * * * *");
        }
    //Print square using while loop
        int x = 1;
        while(x<=5){
            System.out.println("- - - - -");
            x++;
        }
    }
}
