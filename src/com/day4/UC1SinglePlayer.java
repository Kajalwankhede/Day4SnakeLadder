package com.day4;

public class UC1SinglePlayer {
    public static void main(String[] args) {
        System.out.println("Snake And Ladder.");
        int position=0;
        int check=(int) Math.floor(Math.random()*10) %6 +1;
        position=position+check;
        System.out.println("Current Position of Player: " +position);
    }
}

