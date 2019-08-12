import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class HashMapEx{
    public static void main(String args[]) throws IOException{
        HashMap<Integer,String> hmap = new HashMap<Integer,String>();
        hmap.put(12,"Chaitanya");
        hmap.put(2,"Rahul");
        hmap.put(7,"Singh");
        hmap.put(48,"Ajeet");
        hmap.put(3,"Anuj");
        // Set set = hmap.entrySet();
        // Iterator iterator = set.iterator();

        // while(iterator.hasNext()){
        //     Map.Entry mentry = (Map.Entry)iterator.next();
        //     System.out.println("key:"+mentry.getKey()+"&Value:"+mentry.getValue());
        // }
        // for(Entry<Integer, String> entry : hmap.entrySet()){
        //     System.out.println("key:"+mentry.getKey()+"&Value:"+mentry.getValue());
        // }
        for(Integer key : hmap.keySet()){
            System.out.println("key:"+ key + "&Value:"+hmap.get(key));
        }

    }
}