import java.io.IOException;
import java.util.Scanner;


public class ForNumber{
    public static void main(String args[]) throws IOException{
        int row, col;
        for(row = 1; row < 6; row++){
            for (col = 0; col < 5; col++) {
                int a = 1;
                a = row + (col * 5);
                System.out.print( a +" ");
            }
            System.out.println(" ");
        }
    }
}