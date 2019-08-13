import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class Collection{
    public static void main(String args[]) throws IOException{
        ArrayList<String> list = new ArrayList<String>();
        list.add("비");
        list.add("맑음");
        list.add("흐림");
        list.add("바람");

        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(813);
        list2.add(815);
        list2.add(816);
        list2.add(817);

        HashMap<Object,Object> hmap = new HashMap<Object,Object>();
        hmap.put("str", list);
        hmap.put("integer", list2);

        ArrayList<Integer> outlist01 = new ArrayList<Integer>();
        ArrayList<String> outlist02 = new ArrayList<String>();
        outlist01 = (ArrayList<Integer>) hmap.get("integer");
        outlist02 = (ArrayList<String>) hmap.get("str");

        System.out.println("\n 리스트 출력 시작! ");

		for (int i=0; i < list.size(); i++) {
            System.out.print(outlist01.get(i)+" ");
            System.out.println(outlist02.get(i));
		}
     
    }
}