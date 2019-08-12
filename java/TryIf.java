import java.io.IOException;
import java.util.Scanner;


public class TryIf{
    public static void main(String args[]) throws IOException{
        //Scanner scanner = new Scanner(System.in);
        System.out.printf("User Age : ");
        //int user = scanner.nextInt();
        
        int user = 15;
        if(user<19){
            if(user > 16 && user < 19){
                System.out.println("You are 17 or 18");
            } else {
                System.out.println("16 or younger");
            }
        }
    }
}