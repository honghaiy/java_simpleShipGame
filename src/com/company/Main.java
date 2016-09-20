package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
       // Scanner s = new Scanner(System.in);
        //System.out.println("enter a number");
        //int number = s.nextInt();
        SimpleShip dot = new SimpleShip();
        int[] location = {2,3,4};
        dot.setLocationCells(location);
        //int haha = Integer.parseInt(number);
        String num = "2";
        String result = dot.checkYourself(num);
        System.out.println(result);
    }
}
