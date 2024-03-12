package org.example.rpsls;

public class App {
    public static void main(String[] args) {
        UserIO newIO = new UserIO();
        TrackRounds newGame = new TrackRounds();
        int humanChoice = 0;
        int computerChoice = 0;

        String strResults = "";
        String strRPS = "";

            newIO.displayMessage("Welcome to Rock, Paper, Scissors, Lizard, Spock game.");

        int numRounds = newIO.getNumberOfRounds();
            newIO.displayMessage("Rounds: " + numRounds);

            for (int i = 1; i <= numRounds; i++) {
            humanChoice = newIO.getHumanChoice();
            newIO.displayMessage("Human Choice " + humanChoice);

            computerChoice = newIO.getComputerChoice();
            newIO.displayMessage("Computer Choice: " + computerChoice);

            //store results in a string H, C, T
            strRPS = newGame.processRounds(humanChoice, computerChoice);
            strResults = strResults + strRPS;
        }
        //convert string to char
        char[] winCounts = strResults.toCharArray();

        int humanWins = 0;
        int computerWins = 0;
        int hc_Ties = 0;

        //count the wins for the results
            for (int i = 0; i < winCounts.length; i++) {
            switch (winCounts[i]) {
                case 'H':
                    humanWins = humanWins + 1;
                    break;
                case 'C':
                    computerWins = computerWins + 1;
                    break;
                case 'T':
                    hc_Ties = hc_Ties + 1;
                    break;
            }
        }

        //System.out.println(strResults);
        // This section prints out the results
            System.out.println();
            System.out.println("     Results:     ");
            System.out.println("   Human Wins: " + humanWins);
            System.out.println("Computer Wins: " + computerWins);
            System.out.println("         Ties: " + hc_Ties);
            System.out.println("");
            if (humanWins > computerWins) {
            System.out.println("Congratulations, you are the champion!");
        }
            if (humanWins < computerWins) {
            System.out.println("The computer won, too bad.");
        }
            if (humanWins == computerWins) {
            System.out.println("This match was a tie.");
        }
    } //End of Main

}
