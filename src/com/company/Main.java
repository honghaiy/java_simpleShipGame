package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        int x = 0;
        SimpleShip dot = new SimpleShip();
        int[] location = {2,3,4};
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
