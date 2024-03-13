package org.example.Objects;

public class ObjectHashCodeExample {
    public static void main(String[] args) {
        testP1andP2();
        System.out.println("**********");
        testNameEqualityP1P2();
    }

    public static void testP1andP2() {
        Person p1 = new Person();
        Person p2 = new Person();

        p1.setfName("Joe");
        p1.setlName("Smith");
        p1.setAge(25);
        p1.setEyeColor("Green");

        p2.setfName("Joe");
        p2.setlName("Smith");
        p2.setAge(25);
        p2.setEyeColor("Green");

        System.out.println(p1);
        System.out.println(p2);

        //test equality of objects
        boolean objBoolTest = p1.equals(p2);
        System.out.println("p1 = p2: " + objBoolTest);

        System.out.println("p1 hashcode: " + p1.hashCode());
        System.out.println("p2 hashcode: " + p2.hashCode());
    }

    private static void testNameEqualityP1P2() {
        Person p1 = new Person();
        Person p2 = new Person();

        p1.setfName("Joe");
        p1.setlName("Smith");  //proper case Smith
        p1.setAge(25);
        p1.setEyeColor("Blue");

        p2.setfName("Joe");
        p2.setlName("smith");  //lowercase smith
        p2.setAge(45);
        p2.setEyeColor("green");

        boolean testObjName = p1.getlName().equalsIgnoreCase(p2.getlName());
        System.out.println("p1 lName = p2 lName: " + testObjName);
        System.out.println("p1 lName hashcode: " + p1.getlName().toUpperCase().hashCode());
        System.out.println("p2 lName hashcode: " + p2.getlName().toUpperCase().hashCode());
    }
}
