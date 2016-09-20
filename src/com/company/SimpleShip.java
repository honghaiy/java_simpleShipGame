package com.company;

/**
 * Created by Hai_yang on 16/9/17.
 */
public class SimpleShip {
    int []LocationCells;
    int numOfHits = 0;

    public void setLocationCells(int[]loc){
        LocationCells = loc;
        //System.out.println(LocationCells[2]);
    }

    public String checkYourself(int guess){
        //int number = Integer.parseInt(guess);
        String result = "Miss";
        for (int j=0; j<LocationCells.length; j++){
            if(guess == LocationCells[j]){
                result = "Hit";
                numOfHits++;
                break;
            }
        }
        if(numOfHits == LocationCells.length){
                result = "Kill";
        }
        System.out.println(result);
        return result;
    }
}
