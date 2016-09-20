package com.company;

/**
 * Created by Hai_yang on 16/9/17.
 */
public class SimpleShip {
    int []LocationCells;
    int numOfHits;

    public String checkYourself(String guess){
        int number = Integer.parseInt(guess);
        String result = "Miss";
        for (int j=0; j<LocationCells.length; j++){
            if(number == LocationCells[j]){
                numOfHits++;
                if(numOfHits == 3){
                    result = "Kill";
                    break;
                }
                else{
                    result = "Hit";
                    break;
                }
            }
            else{
                result = "Miss";
            }
        }
        return result;
    }
    public void setLocationCells(int[]loc){
        LocationCells = loc;
        //System.out.println(LocationCells[2]);
    }

}
