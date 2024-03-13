package org.example.simpleCalculator;

import java.util.Random;
import java.util.Scanner;

public class UserIO {
    public void displayMessage(String msg){
        System.out.println(msg);
    }

    public int getMenuOptions(){
        displayMessage("1: Add two numbers");
        displayMessage("2: Subtract two numbers");
        displayMessage("3: Multiply two numbers");
        displayMessage("4: Divide two numbers");
        displayMessage("5: Exit");
        displayMessage("");
        displayMessage("Please choose an option:");
        Scanner sc = new Scanner(System.in);
        String strChoice = sc.nextLine();
        int choice = 0;
        boolean myContinue = true;
        do {
            try {
                choice = Integer.parseInt(strChoice);
                myContinue = false;
            } catch (Exception e) {
                System.out.println("Invalid menu choice, try again");
                myContinue = false;
            }
        } while (myContinue);
        return choice;
    }

    public double getOperand(String prompt) {
        double operand = 0;
        System.out.println(prompt);
        Scanner sc = new Scanner(System.in);
        while(true) {
            try {
                String strTemp = sc.nextLine();
                operand = Double.parseDouble(strTemp);
                return operand;
            } catch (Exception e) {
                System.out.println("Invalid entry, try again");
            }
        }
    }
}
