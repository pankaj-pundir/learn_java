package w3Schools;

import java.util.HashMap;

public class HashMapClass {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        map.put("foo",0);
        map.put("bar",1);
        map.put("baz",2);
        for (String key : map.keySet())
        {
            System.out.println(key + "=" + map.get(key));
        }

        for(Integer values : map.values()){
            System.out.println(values);
        }
    }
}
