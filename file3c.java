package dsa_course;

public class file3c {
    public static void main(String args[]){
    //Print reverse of a number
        int x = 786879;
        while(x>0){
            int lastdigit = x%10;
            System.out.print(lastdigit);
            x = x/10;
        }
    //Save reverse of a digit
        int y = 456564;
        int reverse = 0;
        while(y>0){
            int last_digit = y%10;
            reverse = (reverse*10)+last_digit;
            y /= 10;
        }
        System.out.println("\nReverse is "+reverse);
    }
}
