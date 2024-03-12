package org.example;

import java.util.Scanner;

public class WindowMaster {
    public static void main(String [] args) {
        float height = 0;
        float width = 0;

        String stringHeight;
        String stringWidth;

        float areaOfWindow;
        float cost;
        float perimeterOfWindow;

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Please enter window height:");
        stringHeight = myScanner.nextLine();
        System.out.println("Please enter window width:");
        stringWidth = myScanner.nextLine();

        boolean isTrue = true;
        while (isTrue) {
            try {
                height = Float.parseFloat(stringHeight);
                width = Float.parseFloat(stringWidth);
                isTrue = false;
            } catch(Exception e) {
                System.out.println("Try again");
            }
        }

        areaOfWindow = height * width;

        perimeterOfWindow = 2 * (height + width);

        cost = ((3.50f * areaOfWindow) + (2.25f * perimeterOfWindow));

        System.out.println("Window height = " + stringHeight);
        System.out.println("Window width = " + stringWidth);
        System.out.println("Window area = " + areaOfWindow);
        System.out.println("Window perimeter = " + perimeterOfWindow);
        System.out.println("Total Cost =  " + cost);
    }

}
