package com.day4;

import java.util.Random;

public class PositionCheck {
    PositionCheck()
    {
        System.out.println("**************Welcome To Snake And Ladder***************.");
    }
    public static void main(String[] args) {
        PositionCheck p=new PositionCheck();
        int StartingPosition=0;
        Random random= new Random();
        System.out.println("Starting Position of Single Player is: "+StartingPosition);
        int DieRoll=(random.nextInt(6)+1);
        System.out.println("The Player rolls die & get number: "+DieRoll);
    }
}