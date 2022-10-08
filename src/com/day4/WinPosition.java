package com.day4;

public class WinPosition {
    public static void main(String[] args) {
        System.out.println("\n************* Welcome to Snake & Ladder **************");
        int Position_max = 6, Position_min = 1,Snake = 1,Max = 2, Min = 0, Count = 0;
        int Ladder = 1,Player=0;
        for (int i = 1;Player!=100 ; i++) {
            i++;
            int randomCheck = (int) (Math.random() * (Max - Min + 1) + Min);
            if (Player == 100) {
                int positionCheck = (int) (Math.random() * (Position_max - Position_min + 1) + Position_min);
                System.out.println("Your Previous Position is  : " + Player);
                System.out.println("you got the : " + positionCheck);
                System.out.println("\nCongratulations you got 100 & Won the Game.");
            } else if ((randomCheck == 1)&&(Count==2)){
                int positionCheck = (int) (Math.random() * (Position_max - Position_min + 1) + Position_min);
                System.out.println("\nyour Previous Position is  : " + Player);
                System.out.println("you got : " + positionCheck);
                Ladder = Player + positionCheck;
                if (Ladder >= 100)
                    Ladder = 100;
                Player = Ladder;
                System.out.println("Ladder : Now your position has gone to : " + Player);
            } else if ((randomCheck == 2)&&(Count==2)) {
                int positionCheck = (int) (Math.random() * (Position_max - Position_min + 1) + Position_min);
                System.out.println("\nyour previous position is : " + Player);
                System.out.println("you got : " + positionCheck);
                Snake = Player - positionCheck;
                if (Snake <= 1)
                    Snake = 1;
                Player = Snake;
                System.out.println("Snake :  Now your position has gone down to : " + Player );
            } else if ((randomCheck == 0)) {
                int positionCheck = (int) (Math.random() * (Position_max - Position_min + 1) + Position_min);
                if ((Count == 0) && (positionCheck == 1)) {
                    System.out.println("\nyou got the: " + positionCheck);
                    System.out.println("You can start the game now");
                    Player = 1;
                    Count = 2;}
                else if((Count == 0) && (positionCheck != 1)){
                    System.out.println("\nyou got the: " + positionCheck);
                    System.out.println("No play : you need 1 to start the game try again");}

            }
        }

    }
}