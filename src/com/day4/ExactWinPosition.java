package com.day4;
public class ExactWinPosition {
    public static void main(String[] args) {
    System.out.println("\n**********Welcome to snake and ladder************");
    int ladder = 1, player = 0,positionCheck=0,snake = 1;
    int max = 2, min = 0, count = 0, positionMax = 6, positionMin = 1;
    for (int i = 1; player != 100; i++) {
        i++;
        int randomCheck = (int) (Math.random() * (max - min + 1) + min);
        if ((randomCheck == 1) && (count == 2)) {
            positionCheck = (int) (Math.random() * (positionMax - positionMin + 1) + positionMin);
            System.out.println("\nYour Previous Position is  : " + player);
            int previousPosition=player;
            System.out.println("you got the : " + positionCheck);
            ladder = player + positionCheck;
            if (ladder >100){
                System.out.println("Your position is above 100 to WIN ,Stay in  previous position till you get 100");
                ladder = previousPosition;}
            player = ladder;
            System.out.println("Ladder : now your position has gone to : " + player);
            if(player==100)
                System.out.println("**** Congratulation..YOU WON ****");
        } else if ((randomCheck == 2) && (count == 2)) {
            positionCheck = (int) (Math.random() * (positionMax - positionMin + 1) + positionMin);
            System.out.println("\nyour previous position  : " + player);
            System.out.println("you got : " + positionCheck);
            snake = player - positionCheck;
            if (snake <= 1)
                snake = 1; // to change -ve to +ve
            player = snake;
            System.out.println("snake :  Now your position has gone down to : " + player);
        } else if ((randomCheck == 0)) {
            positionCheck = (int) (Math.random() * (positionMax - positionMin + 1) + positionMin);
            if ((count == 0) && (positionCheck == 1)) {
                System.out.println("\nyou got : " + positionCheck);
                System.out.println("you can start the game now");
                player = 1;
                count = 2;}
        } else if ((count == 0) && (positionCheck != 1)) {
            System.out.println("\nyou got : " + positionCheck);
            System.out.println("No play : you need 1 to start the game try again");
        }

    }
}

}