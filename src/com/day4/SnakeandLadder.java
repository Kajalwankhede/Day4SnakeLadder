package com.day4;

public class SnakeandLadder {
    public static int count = 0, dice = 0;
    public static int randomCheck() {
        int max = 2, min = 0;
        int randomCheck = (int) (Math.random() * (max - min + 1) + min);
        return randomCheck;
    }
    public static int positionCheck() {
        int positionCheck, positionMax = 6, positionMin = 1;
        positionCheck = (int) (Math.random() * (positionMax - positionMin + 1) + positionMin);
        return positionCheck;
    }
    public static void main(String[] args) {
        int player1 = 0, player2 = 0;
        System.out.println("\n*****Snake And Ladder*********** \n");
        while ((player1 != 100) && (player2 != 100)){
            if((player1 != 100) && (player2 != 100))
                player1 = game(player1, " PLAYER 1 ");
            if((player1 != 100) && (player2 != 100))
                player2 = game(player2, " PLAYER 2 ");
        }
    }
    public static int game(int player, String playerName) {
        System.out.println("\n------------------" + playerName + "-----------------------");
        int randomCheck, positionCheck = 0;
        while ((player != 100)) {
            randomCheck = randomCheck();
            if ((randomCheck == 1) && (count == 2)) {
                positionCheck = positionCheck();
                dice++;
                player = ladder(positionCheck, player, dice, playerName);
                return player;
            } else if ((randomCheck == 2) && (count == 2)) {
                positionCheck = positionCheck();
                dice++;
                player = snake(positionCheck, player, dice);
                return player;
            } else if ((randomCheck == 0) && (count == 0)) {
                positionCheck = positionCheck();
                dice++;
                if ((count == 0) && (positionCheck == 1)) {
                    System.out.println("you got : " + positionCheck);
                    System.out.println(playerName + " can start the game now");
                    player = 1;
                    count = 2;
                } else if ((count == 0) && (positionCheck != 1)) {
                    System.out.println("you got : " + positionCheck);
                    System.out.println("No play for " + playerName + " you need 1 to start the game try again");
                }
            }
        }
        return player;
    }
    public static int snake(int positionCheck, int player, int dice) {
        int previousPosition = player;
        System.out.println("\n your previous position  : " + previousPosition);
        System.out.println(" you got : " + positionCheck);
        int snake = player - positionCheck;
        if (snake <= 1)
            snake = 1; // to change -ve to +ve
        player = snake;
        System.out.println(" snake : ohh now your position has gone down to : " + player);
        return player;
    }
    public static int ladder(int positionCheck, int player, int dice, String playerName) {
        int previousPosition = player;
        System.out.println("\n your previous position  : " + previousPosition);
        System.out.println(" you got : " + positionCheck);
        int ladder = player + positionCheck;
        if (ladder > 100) {
            System.out.println(" Your position is above 100 so to WIN ,stay in the previous position till you get 100");
            ladder = previousPosition;
        }
        player = ladder;
        System.out.println(" Ladder : now your position has gone to : " + player);
        if (player == 100) {
            System.out.println(playerName + " threw dice " + dice + " times");
            System.out.println("\n-----------" + playerName + " WON THE GAME ------------------");
            return player;
        }
        return player;
    }

}
