package org.example.arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Iterator;

//test page
public class Arrays {
    public static void main(String[] args) {
        int [] numbers = {2, 3, 4};
        String [] animals = {"dog", "cat", "house"};

        for (int i : numbers) {
            System.out.println(i);
        }

        for (String animal : animals) {
            System.out.println(animal);
        }

        //Set
        HashSet<String> set = new HashSet<String>();

        //Map
        Map<Integer, String> map = new HashMap<>();
        map.put(1,  "value 1");
        map.put(2, "value 2");

        String element = map.get(1);
        System.out.println(element);

        //key iterator
      /*  Iterator iterator = map.keySet().iterator();
        while (iterator.hasNext()){
            int key = iterator.next();
            String value = map.get(key);
            System.out.println(value);
        }*/

        for (int key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " " + value);
        }

        //enum
        enum Browser {
            CHROME,
            FIREFOX,
            SAFARI
        }

        Browser browser = Browser.CHROME;
        System.out.println(browser);
    }

}
