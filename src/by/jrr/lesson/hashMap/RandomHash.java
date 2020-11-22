package by.jrr.lesson.hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RandomHash {
    public static void main(String[] args) {
        Map<PersonKey, String> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Set name");
        String name = scanner.nextLine();
        System.out.println("Set last name");
        String nameLast = scanner.nextLine();
        System.out.println("Set description");
        String desc = scanner.nextLine();

        PersonKey personKey = new PersonKey(name, nameLast);

        map.put(personKey, desc);

        System.out.println(map);


        //map.put(new PersonKey("first2", "second2"), "name2 ");
        //map.put(new PersonKey("first3", "second4"), "name3");
        //System.out.println(map);

        //String firstPerson = map.get(new PersonKey("first", "second"));
        //System.out.println(firstPerson);
    }
}
