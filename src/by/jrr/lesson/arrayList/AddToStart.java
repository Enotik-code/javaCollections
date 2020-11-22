package by.jrr.lesson.arrayList;

import java.util.ArrayList;

public class AddToStart {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();

        long start = System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++) {
            integers.add(0, i);
        }
        long result = System.currentTimeMillis();

        System.out.println("result " + (result - start) + " ms.");
    }
}
