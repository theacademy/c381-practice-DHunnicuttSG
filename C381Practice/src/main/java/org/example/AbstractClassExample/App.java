package org.example.AbstractClassExample;

public class App {
    public static void main(String[] args) {
        Square mySquare =new Square(7,7);
        mySquare.color = "Red";

        System.out.println(mySquare.getArea());
        System.out.println(mySquare.getPerimeter());
        System.out.println(mySquare.color);
    }
}
