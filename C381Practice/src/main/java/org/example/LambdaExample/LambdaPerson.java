package org.example.LambdaExample;

import java.util.Objects;

public class LambdaPerson {
    String firstName;
    String lastName;
    int age;
    String eyeColor;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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
        LambdaPerson that = (LambdaPerson) o;
        return age == that.age && Objects.equals(firstName, that.firstName) && Objects.equals(lastName, that.lastName) && Objects.equals(eyeColor, that.eyeColor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age, eyeColor);
    }

    @Override
    public String toString() {
        return "LambdaPerson{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", eyeColor='" + eyeColor + '\'' +
                '}';
    }
}
