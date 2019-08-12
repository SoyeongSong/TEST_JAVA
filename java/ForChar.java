import java.io.IOException;
import java.util.Scanner;
import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory.Default;


public class ForChar{
    public static void main(String args[]) throws IOException{
        int row, col;
        for(row = 1; row < 8; row++){
            for(col = 1; col < 6; col++){
                if(row ==1 || row==7){
                System.out.printf("~");
                }
                else if (col==1 || col==5){
                    System.out.printf("!");
                }
                else{
                    System.out.print((row-6) + (col-1)*5);
                }
            System.out.print("\t");
            }
        System.out.println(" ");
        }
    }
}