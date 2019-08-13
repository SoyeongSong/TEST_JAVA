import java.io.IOException;
import java.util.ArrayList;
import java.util.*;

public class DisplayOverloading{
    public static void display(String c) {
        System.out.println("One parameter: " + c);
    }

    public void display(String c, int num) {
        System.out.println("Two parameter Method: " + c + ", " + num);
    }

    public void display(int c) {
        System.out.println("One parameter: " + c);
    }

    public static void main(String[] args) {
        DisplayOverloading d =  new DisplayOverloading();
        d.display("a");
        d.display("b", 654);
    }
}