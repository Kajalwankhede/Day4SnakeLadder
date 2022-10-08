package com.day4;


public class CheckPlayOrNot {
    public static void main(String[] args) {
        System.out.println("\nWelcome to Snake and Ladder");
        int Snake = 1, Position_max = 6, Position_min = 1, Max = 2, Min = 0, Count = 0;
        int Ladder = 1, Player = 0;
        int randomCheck = (int) (Math.random() * (Max - Min + 1) + Min);

        if (randomCheck == 1) {
            int positionCheck = (int) (Math.random() * (Position_max - Position_min + 1) + Position_min);
            System.out.println("you got the number: " + positionCheck);
            Ladder = Player + positionCheck;
            if (Ladder >= 100)
                Ladder = 100;
            Player = Ladder;
            System.out.println("Ladder : Your position has gone to : " + Player);
        } else if (randomCheck == 2) {
            int positionCheck = (int) (Math.random() * (Position_max - Position_min + 1) + Position_min);
            System.out.println("you got : " + positionCheck);
            Snake = Player - positionCheck;
            if (Snake <= 1)
                Snake = 1; // to change -ve to +ve
            Player = Snake;
            System.out.println("Snake :  Now your position has gone down to : " + Player);
        } else if ((randomCheck == 0)) {
            int positionCheck = (int) (Math.random() * (6 - 2 + 1) + 2);
            System.out.println("\nyou got : " + positionCheck);
            System.out.println("No play : you need 1 to start the game try again");
        }
    }
}