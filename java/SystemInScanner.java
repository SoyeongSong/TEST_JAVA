import java.io.IOException;
import java.util.Scanner;


public class SystemInScanner{
    public static void main(String args[]) throws IOException{
        Scanner scanner = new Scanner(System.in);
        System.out.printf("\nEnter the first character : ");
        int ch1 = scanner.nextInt();
        System.out.printf("After conversion:"+ch1);
    }
}