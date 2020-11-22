package by.jrr.lesson.linkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class addToStart {
    public static void main(String[] args) {
        LinkedList<Integer> integers = new LinkedList<>();

        long start = System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++) {
            integers.add(0, i);
        }
        long result = System.currentTimeMillis();

        System.out.println("result " + (result - start) + " ms.");
    }
}
