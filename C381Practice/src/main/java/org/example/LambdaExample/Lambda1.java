package org.example.LambdaExample;

import java.util.ArrayList;
import java.util.List;

public class Lambda1 {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(5);
        myList.add(7);
        myList.add(22);
        myList.add(42);

        myList.forEach(item -> System.out.print(item + " "));
    }
}
