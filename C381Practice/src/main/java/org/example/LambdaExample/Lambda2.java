package org.example.LambdaExample;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Lambda2 {
    public static void main(String[] args) {
        List<LambdaPerson> people = new ArrayList<>();
        people = createList(people);

        List<LambdaPerson> over30 = people.stream()
                .filter(p -> p.getAge() > 30)
                .collect(Collectors.toList());

        List<LambdaPerson> under30 = people.stream()
                .filter(p -> p.getAge() < 30)
                .collect(Collectors.toList());

        OptionalDouble averageAge = people
                .stream()
                .mapToInt(p -> p.getAge())
                .average();

        System.out.println(over30);
        System.out.println(under30);
        System.out.println(averageAge);
    }

    public static List<LambdaPerson> createList(List<LambdaPerson> people) {
        LambdaPerson p = new LambdaPerson();
        p.setFirstName("David");
        p.setAge(45);
        people.add(p);

        LambdaPerson p2 = new LambdaPerson();
        p2.setFirstName("Jane");
        p2.setAge(24);
        people.add(p2);

        LambdaPerson p3 = new LambdaPerson();
        p3.setFirstName("Christophe");
        p3.setAge(22);
        people.add(p3);

        LambdaPerson p4 = new LambdaPerson();
        p4.setFirstName("Farrah");
        p4.setAge(28);
        people.add(p4);

        LambdaPerson p5 = new LambdaPerson();
        p5.setFirstName("Kate");
        p5.setAge(18);
        people.add(p5);

        LambdaPerson p6 = new LambdaPerson();
        p6.setFirstName("Farshad");
        p6.setAge(37);
        people.add(p6);

        LambdaPerson p7 = new LambdaPerson();
        p7.setFirstName("Somya");
        p7.setAge(33);
        people.add(p7);

        return people;
    }
}
