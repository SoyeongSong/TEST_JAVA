import java.io.IOException;
import java.util.ArrayList;
import java.util.*;

public class Method{
    public static int a, b, result;
    public static void main(String args[]) throws IOException{
        int a=2,b=2; // 임의값 강제입력
        Print(a, b);
    }

    public static int Add(int a, int b){
        result = a + b;
        return result;
    }
    public static int Sub(int a, int b){
        result = a - b;
        return result;
    }
    public static int Multiple(int a, int b){
        result = a * b;
        return result;
    }

    public static int Division(int a, int b){
        result = a / b;
        return result;
    }

    public static void Print(int a, int b){
        System.out.println("Enter : "+ a +", " + b);
        System.out.println("Addition : " +Add(a, b));
        System.out.println("Subtraction : " +Sub(a, b));
        System.out.println("Multiplication : " +Multiple(a, b));
        System.out.println("Division : " +Division(a, b));
    }

}