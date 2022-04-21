import java.util.Locale;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        System.out.println("Rock, Paper, Scissors");
        System.out.println("By Mohammed Shahidul Islam\n");

        Scanner input = new Scanner(System.in);

        System.out.println("Please type in:" +
                "[R] for Rock," +
                "[P] for Paper," +
                "[S] for Scissors");

        System.out.print("Player One: ");
        String playerOneChoice = input.next().toUpperCase();
        //playerOneChoice = playerOneChoice.toUpperCase();

        System.out.print("Player Two: ");
        String playerTwoChoice = input.next().toUpperCase();
        //playerTwoChoice = playerTwoChoice;

        if (playerOneChoice.equals(playerTwoChoice)) { // Checks for tie
            System.out.println("Tie!");
        }

        else {
            if ((playerOneChoice.equals("R") && playerTwoChoice.equals("P")) || (playerOneChoice.equals("P") && playerTwoChoice.equals("R"))) { // Paper Wins
                if (playerOneChoice.equals("P")) {
                    System.out.println("Player One wins!!");
                }
                else {
                    System.out.println("Player Two wins!!");
                }
            }

            if ((playerOneChoice.equals("S") && playerTwoChoice.equals("P")) || (playerOneChoice.equals("P") && playerTwoChoice.equals("S"))) { // Scissor Wins
                if (playerOneChoice.equals("S")) {
                    System.out.println("Player One wins!!");
                }
                else {
                    System.out.println("Player Two wins!!");
                }
            }

            if ((playerOneChoice.equals("R") && playerTwoChoice.equals("S")) || (playerOneChoice.equals("S") && playerTwoChoice.equals("R"))) { // Rock Wins
                if (playerOneChoice.equals("R")) {
                    System.out.println("Player One wins!!");
                }
                else {
                    System.out.println("Player Two wins!!");
                }
            }
        }

        input.close();
    }
}
