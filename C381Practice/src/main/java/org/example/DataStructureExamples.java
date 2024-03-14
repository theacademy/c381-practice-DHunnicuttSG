package org.example;

import java.util.*;

public class DataStructureExamples {
    public static void main(String[] args) {
        //ArrayList
        List<String> animals = new ArrayList<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Elephant");
        animals.add(2, "Horse");
        animals.add("Cat");

        System.out.println(animals);


        //LinkedList
        List<String> animals2 = new LinkedList<>();

        animals2.add("Dog");
        animals2.add("Cat");
        animals2.add("Elephant");
        animals2.add(2, "Horse");
        animals2.add("Cat");

        System.out.println(animals2);
        //HashSet
        Set<String> colors = new HashSet<>();
        colors.add("Blue");
        colors.add("Green");
        colors.add("Orange");
        colors.add("Red");
        colors.add("Purple");
        colors.add("Yellow");

        System.out.println(colors);
        //HashMap

        Map<String, Integer> numLegs = new TreeMap<>();

        numLegs.put("Human", 2);
        numLegs.put("Cat", 4);
        numLegs.put("ant", 6);
        numLegs.put("Spider", 8);
        numLegs.put("ANT", 6);
        numLegs.remove("ANT");

        System.out.println(numLegs);
        System.out.println(numLegs.keySet());
        System.out.println(numLegs.values());
        System.out.println(numLegs.size());

        System.out.println(numLegs.get("ant"));

        Stack<String> games = new Stack<>();
        games.push("Super Mario");
        games.push("Donkey Kong");
        games.push("Asteroids");
        games.push("Asteroids");
        games.pop();


        System.out.println(games);
        System.out.println(games.peek());

    }
}
