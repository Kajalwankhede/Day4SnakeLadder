package com.day4;

public class ExactWinPosition {
    public static void main(String[] args) {
        int Winning_Position = 100;
        int TotalNoOfDiceRoll = 0;
        int playerPosition = 1;
        int diceRoll = 0;
        int SnakeArray[] = {54, 90, 99};
        int LadderArray[] = {9, 40, 67};

        System.out.println("Welcome to the Game of SNAKE & LADDER");
        System.out.println("Starting Position of the Player = 0");

        for (playerPosition = 1; playerPosition <= 100; playerPosition++) {
            double randomnumber = (double) (Math.random() * 6);
            diceRoll = (int) randomnumber;
            System.out.println("Dice Number =" + " " + diceRoll);
            playerPosition = playerPosition + diceRoll;
            playerPosition = playerPosition - 1;

            System.out.println("Current Position =" + " " + playerPosition);
            TotalNoOfDiceRoll++;

            if (playerPosition == 100) {
                System.out.println("CONGRATULATION!!!!! YOU WON THE GAME.");
            }
            if (diceRoll == 0) {
                playerPosition = playerPosition - diceRoll;
                System.out.println("No Play: You have to stay on the same position!!");
            }
            if (playerPosition == SnakeArray[0]) {
                playerPosition = 19;
                System.out.println("IT'S A SNAKE.");
                System.out.println("You are at " + playerPosition + " position.");

            } else if (playerPosition == SnakeArray[1]) {
                playerPosition = 48;
                System.out.println("IT'S A SNAKE.");
                System.out.println("You are at " + playerPosition + " position.");

            } else if (playerPosition == SnakeArray[2]) {
                playerPosition = 77;
                System.out.println("IT'S A SNAKE.");
                System.out.println("You are at " + playerPosition + " position.");

            } else if (playerPosition == LadderArray[0]) {
                playerPosition = 34;
                System.out.println("YOU GOT A LADDER.");
                System.out.println("You are at " + playerPosition + " position.");

            } else if (playerPosition == LadderArray[1]) {
                playerPosition = 64;
                System.out.println("YOU GOT A LADDER.");
                System.out.println("You are at " + playerPosition + " position.");

            } else if (playerPosition == LadderArray[2]) {
                playerPosition = 86;
                System.out.println("YOU GOT A LADDER.");
                System.out.println("You are at " + playerPosition + " position.");

            } else if (playerPosition > Winning_Position) {
                playerPosition = playerPosition - diceRoll;
                System.out.println("Position Goes Beyond 100\nNo Play--Player stop on same position.");
                System.out.println("Player current Position is: " + playerPosition);
                System.out.println("The Number is required to Player for win: " + (Winning_Position - playerPosition));
            }
        }

        while (playerPosition != Winning_Position );
        System.out.println("Player reaches the winning position");
    }
}
