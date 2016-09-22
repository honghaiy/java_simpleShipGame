package com.company;

import java.util.ArrayList;

/**
 * Created by Hai_yang on 16/9/17.
 */
public class SimpleShip {
    //int []LocationCells;
    ArrayList<Integer> LocationCells;
    //int numOfHits = 0;

    public void setLocationCells(ArrayList<Integer> loc){
        LocationCells = loc;
    }

    public String checkYourself(int guess){
        String result = "Miss";
        int index = LocationCells.indexOf(guess);
        if (index >= 0){
            LocationCells.remove(index);
            if(LocationCells.isEmpty()){
                result = "Kill";
            }
            else{
                result = "Hit";
            }
        }
        System.out.println(result);
        return result;
    }
}
