package org.example.rpsls;

import java.util.Random;
import java.util.Scanner;

public class UserIO {
    public static void displayMessage(String msg){
        System.out.println(msg);
    }

    public static int getHumanChoice(){
        displayMessage("1: Rock");
        displayMessage("2: Paper");
        displayMessage("3: Scissors");
        displayMessage("4: Lizard");
        displayMessage("5: Spock");
        displayMessage("");
        displayMessage("Please choose Rock, Paper, Scissors, Lizard, or Spock:");
        Scanner sc = new Scanner(System.in);
        int hChoice = sc.nextInt();

        return hChoice;
    }

    public static int getComputerChoice() {
        Random randomRPS = new Random();
        int cChoice = 0;
        cChoice = randomRPS.nextInt(5) + 1;  //will return random 1,2,3,4,5

        return cChoice;
    }

    public static int getNumberOfRounds(){
        int numRounds = 0;
        displayMessage("Plese enter the number of rounds you want to play: ");
        displayMessage("Enter a number from 1 to 10:");
        Scanner sc = new Scanner(System.in);
        numRounds = sc.nextInt();

        if (numRounds < 1 || numRounds > 10){
            displayMessage("Not a valid entry, try again.");
            getNumberOfRounds();
        }

        return numRounds;
    }
}
