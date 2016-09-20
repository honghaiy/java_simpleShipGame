package com.company;

/**
 * Created by Hai_yang on 16/9/17.
 */
public class SimpleShip {
    int []LocationCells;
    int numOfHits;

    public String checkYourself(String guess){
        int number = Integer.parseInt(guess);
        for (int j=0; j<LocationCells.length; j++){
            if(number == LocationCells[j]){
                numOfHits++;
                if(numOfHits == 3){
                    return "Kill";
                }
                else{
                    return "Hits";
                }
            }
            else{
                return "Miss";
            }
        }
        return null;
    }
    public void setLocationCells(int[]loc){
        LocationCells = loc;
        //System.out.println(LocationCells[2]);
    }

}
