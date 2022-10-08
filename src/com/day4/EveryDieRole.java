package com.day4;

import java.util.Random;

public class EveryDieRole {
    EveryDieRole(){
        System.out.println();
    }
    public static void main(String[] args){
        EveryDieRole a=new EveryDieRole();
        int start_position = 0;
        int Player_Position = 0;
        int Winning_Position = 100;
        int die_count=0;
        Random random = new Random();

        //Snake & Ladder game played with single played at start position.
        System.out.println("Single player at starting position " + start_position);

        //The player rolling die till reaches the winning position.
        do {
            int die = (random.nextInt(6) + 1);
            die_count++;
            System.out.println("The Player rolls the die and get a random no between 1 to 6 : " + die);

            //Player checks for an option.
            int b = random.nextInt(3);
            Player_Position = Player_Position + die;
            switch (b) {
                case 0:
                    System.out.println("No play the player stays in the same position ");
                    System.out.println("Player current position : " + Player_Position);
                    break;
                case 1:
                    Player_Position = Player_Position + die;
                    System.out.println("Player gets Ladder & Player moves ahead by number of position received in the die : " + die);
                    System.out.println("Player current position : " + Player_Position);
                    break;
                case 2:
                    Player_Position = Player_Position - die;
                    if (Player_Position <= 0) {
                        Player_Position = 0;
                        System.out.println("Oops Snake byte and Player is Starting from zero");
                        System.out.println("Player current position is : " + Player_Position);
                    } else {
                        System.out.println("Oops Snake bytes and Player moves behind by number of position : " + die);
                        System.out.println("Player current position is : " + Player_Position);
                    }
                    break;
            }
            if (Player_Position > Winning_Position)
            {
                Player_Position -= die;
                System.out.println("Position goes beyond 100.\nSo no play - Player stays in the same position ");
                System.out.println("Player current position is : " + Player_Position);
                System.out.println("The number required by the player is : "+(Winning_Position-Player_Position));
            }
        }
        while (Player_Position != Winning_Position);//Check exact winning position
        System.out.println("Player reaches the exact winning position");
        System.out.println("The number of times the dice was rolled is : "+die_count);
    }
}