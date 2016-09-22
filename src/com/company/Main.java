package com.company;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        int x = 0;
        SimpleShip dot = new SimpleShip();
        ArrayList<Integer> location = new ArrayList<>();
        int RandomNumber = (int)(Math.random()*5);
        //int[] location = {RandomNumber,RandomNumber+1,RandomNumber+2};
        location.add(RandomNumber);
        location.add(RandomNumber+1);
        location.add(RandomNumber+2);
        dot.setLocationCells(location);
        int count = 0;
        while(x==0){
            Scanner s = new Scanner(System.in);
            System.out.print("enter a number: ");
            int number = s.nextInt();
            count++;
            String result = dot.checkYourself(number);
            System.out.println("You guessed "+ count +" times");
            if(result.equals("Kill")){
                x = 1;
            }
        }
    }
}
