package by.jrr.lesson.arrayList;

import java.util.ArrayList;

public class AddToEnd {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();

        long start = System.currentTimeMillis();

        for (int i = 0; i < 100_000; i++) {
            integers.add(i);
        }
        long result = System.currentTimeMillis();

        System.out.println("result " + (result - start) + " ms.");
    }
}
