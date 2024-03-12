package org.example;

import java.util.Scanner;

public class MyScanner {

    public static void main(String[] args) {
        Scanner scanInput = new Scanner(System.in);

        System.out.println("Type in your name: ");

        String firstName  = scanInput.nextLine();

        System.out.println("Hello, " + firstName);

        System.out.println("How old are you? ");

        String strAge = scanInput.nextLine();

        int intAge = Integer.parseInt(strAge);

        System.out.println("Age is: " + strAge);


    }
}
