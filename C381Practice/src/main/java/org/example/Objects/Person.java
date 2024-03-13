package org.example.Objects;

import java.util.Objects;

public class Person {
    String fName;
    String lName;
    int age;
    String eyeColor;

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        if (!Objects.equals(fName, person.fName)) return false;
        if (!Objects.equals(lName, person.lName)) return false;
        return Objects.equals(eyeColor, person.eyeColor);
    }

    @Override
    public int hashCode() {
        int result = fName != null ? fName.hashCode() : 0;
        result = 31 * result + (lName != null ? lName.hashCode() : 0);
        result = 31 * result + age;
        result = 31 * result + (eyeColor != null ? eyeColor.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fName =' " + fName + '\'' +
                ", age = " + age +
                ", eyeColor = " + eyeColor +
                '}';
    }
}
