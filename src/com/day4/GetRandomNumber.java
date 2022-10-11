package com.day4;
import java.util.Random;
public class GetRandomNumber {
    GetRandomNumber()
    {
        System.out.println("***************Welcome To Snake And Ladder.*****************");
    }
    public static void main(String[] args) {
        GetRandomNumber p=new GetRandomNumber();
        int StartingPosition = 0;
        System.out.println("Player Position :" +StartingPosition);
        Random random= new Random();
        int DieRoll=(random.nextInt(6)+1);
        System.out.println("The Player rolls die & get number 1 to 6: "+DieRoll);
    }
}