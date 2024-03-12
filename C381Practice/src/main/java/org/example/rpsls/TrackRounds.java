package org.example.rpsls;

public class TrackRounds {
    public static String processRounds(int human, int computer) {

        String compareChoice = "";
        compareChoice = human + "." + computer;

        // 1=Rock
        // 2=Paper
        // 3=Scissors
        // 4=Lizard
        // 5=Spock

        // Rock crushes Scissors         1.3
        // Rock crushes Lizard           1.4
        // Paper covers Rock             2.1
        // Paper disproves Spock         2.5
        // Scissors cuts Paper           3.2
        // Scissors decapitates Lizard   3.4
        // Lizard eats Paper             4.2
        // Lizard poisons Spock          4.5
        // Spock smashes Scissors        5.3
        // Spock vaporizes Rock          5.1

        switch (compareChoice) {
            case "1.1": //rock vs. rock
            case "2.2": //paper vs. paper
            case "3.3": //scissors vs. scissors
            case "4.4": //lizard vs lizard
            case "5.5": // Spock vs Spock
                //These are all ties
                return "T";

            case "1.3": //rock vs scissors
            case "1.4": // rock vs lizard
            case "2.1": //paper vs rock
            case "2.5": //paper vs Spock
            case "3.2": //scissors vs paper
            case "3.4": //scissors vs lizard
            case "4.2": //Lizard vs paper
            case "4.5": //lizard vs spock
            case "5.3": //Spock vs scissors
            case "5.1": //Spock vs rock
                //These are all the Human Wins
                return "H";

            case "3.1": //rock vs scissors
            case "4.1": //lizard vs rock
            case "1.2": //paper vs scissors
            case "5.2": //Paper disproves Spock
            case "2.3": //lizard vs Spock
            case "4.3": //Scissors decapitates Lizard
            case "2.4": //Lizard eats Paper
            case "5.4": //Lizard poisons Spock
            case "3.5": //Spock smashes Scissors
            case "1.5": //Spock vaporizes Rock

                //These are all the computer wins
                return "C";

            default:
                //execute code if no match found
                return "X";
        } // end of switch


    } //end of processRounds()
}
