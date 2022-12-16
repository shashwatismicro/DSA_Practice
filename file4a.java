package dsa_course;

public class file4a {
    public static void main(String[] args){
        System.out.println("Printing patterns");
//Star pattern
        for (int i = 1; i<=4; i++){
            //one line
            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("\n\n");
//Reverse star pattern
        for (int x = 1; x<=4; x++){
            for(int y = 4; y>=x; y--){
                System.out.print ("* ");
            }
            System.out.println();
        }
        System.out.println("\n\n");
//Half pyramid pattern
        for (int m = 1; m<=4; m++){
            for (int n = 1; n<=m; n++){
                System.out.print(n+" ");
            }
            System.out.println();
        }
        System.out.println("\n\n");
//Character pyramid pattern
        char ch = 'a';
        for (int line = 1; line<=4; line ++){
            for (int chr = 1; chr<=line; chr++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
}
