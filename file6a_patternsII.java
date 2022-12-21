package dsa_course;
import java.util.Scanner;
public class file6a_patternsII {
    public static void hollow_rectangle(int totRows, int totCols){
        for (int i = 1; i<=totRows; i++){
            for (int j = 1; j<=totCols; j++){
                if (i==1 || i== totRows || j == 1 || j == totCols){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void invertedRotatedHalfPyramid(int n){
        for (int i = 1; i<=n; i++){
            for (int j = 1; j<=n-i; j++){
                System.out.print("  ");
            }
            for (int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void invertedHalfPyramid_numbers(int n){
        for (int i = 1; i<=n; i++){
            for (int j = 1; j<=n-i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void FloydsTriangle(int n){
        int counter = 1;
        for (int i = 1; i<=n; i++){
            for (int j = 1; j<=i; j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void triangle_0_1(int n){
        for (int i = 1; i<=n; i++){
            for (int j = 1; j<=i; j++){
                if ((i+j)%2==0){
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
    public static void butterfly(int n){
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }
            for (int j=1; j<=2*(n-i); j++){
                System.out.print("  ");
            }
            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i=n; i>=1; i--){
            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }
            for (int j=1; j<=2*(n-i); j++){
                System.out.print("  ");
            }
            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        System.out.println("""
                We Print Patterns
                Select a character from the guide below to print a pattern
                
                Guide:""");
        System.out.println("""
                Hollow rectangle: A
                Inverted Rotated Half Pyramid: B
                Inverted Half Pyramid (Numbers): C
                Floyd's Triangle: D
                Triangle of 0&1: E
                Butterfly: F
                """);
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        System.out.println();
        if (ch == 'A'){
            System.out.println("Enter the number of rows");
            int x = sc.nextInt();
            System.out.println("Enter the number of cols.\n");
            int y = sc.nextInt();
            hollow_rectangle(x,y);
        } else{
            System.out.println("Enter the number of lines(rows)");
            int n = sc.nextInt();
            switch (ch){
                case 'B':
                    invertedRotatedHalfPyramid(n);
                    break;
                case 'C':
                    invertedHalfPyramid_numbers(n);
                    break;
                case 'D':
                    FloydsTriangle(n);
                    break;
                case 'E':
                    triangle_0_1(n);
                    break;
                case 'F':
                    butterfly(n);
                    break;
                default:
                    System.out.println("Wrong character entered");
            }
        }
        System.out.println("\nTHANK YOU!");
    }
}