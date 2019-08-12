import java.io.IOException;
import java.util.Scanner;


public class Generic{
    public static void main(String args[]) throws IOException{
        java.util.List<String>list = new java.util.ArrayList<String>();
        list.add("item1");
        list.add("item2");
        list.add("item3");
        list.add("item4");
        System.out.println("The arraylist contains elements:"+list);

        int pos = list.indexOf("item2");
        System.out.println("The index of item2 is: "+pos);
        System.out.println("Checking is empty: "+list.isEmpty());

        int size = list.size();
        System.out.println("The size of the list is:" +size);
        for(int i=0; i<list.size(); i++){
            System.out.println("index:"+i+"-item:"+list.get(i));
        }
    }
}