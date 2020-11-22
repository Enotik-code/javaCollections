package by.jrr.lesson.hashMap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Kirill", 12);
        map.put("Matvey ", 32);
        map.put("Semen", 3);
        map.put("Anton", 4);

        System.out.println(map);

        Integer value = map.get("Anton");
        System.out.println(value);

        Integer value2 = map.get("Katya");
        System.out.println(value2);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Name =  " + entry.getKey() + " Age = " + entry.getValue());
        }

        System.out.println();
    }
}
