package w3Schools;

import java.util.ArrayList;
import java.util.Collections;

class MyUtils {
    static void ShowArrayList(ArrayList<String> ar){
        System.out.println("Displaying array data");
        for(String a : ar) System.out.println(a);

        System.out.println("Display ended");
    }
    static void sortArrayList(ArrayList<String>ar){
        Collections.sort(ar);
    }
}

public class ArrayListClass extends MyUtils{


    public static void main (String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("pankaj");
        list.add("nitesh");
        list.add("abhishek");
        list.set(1,"tarun");
        System.out.println(list.get(1)); 

        MyUtils.sortArrayList(list);
        MyUtils.ShowArrayList(list);

        list.remove("pankaj");
        System.out.println(list.size( ));
        list.clear();
    }
    
}
