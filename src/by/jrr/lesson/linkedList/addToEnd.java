package by.jrr.lesson.linkedList;

import java.util.LinkedList;

public class addToEnd {
    public static void main(String[] args) {

        LinkedList<Integer> integers = new LinkedList<>();

        long start = System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++) {
            integers.add(i);
        }
        long result = System.currentTimeMillis();
        System.out.println("result " + (result - start) + " ms.");
    }
}
