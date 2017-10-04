package bley0001.student.monash.edu.drinkinggame;

import java.util.ArrayList;

/**
 * Created by brock on 4/10/2017.
 */

public class Player {
    //Class variable declarations
    private String name;
    private static int numberOfPlayers = 0;
    private static ArrayList<String> arrPlayers = new ArrayList<String>();


    //Constructor
    public Player(String initName){
        name = initName;
        numberOfPlayers++;
    }

    //Adds a player to the game
    static int addPlayer(String playerName){
        arrPlayers.add(playerName);

        return 0;
    }

    //
    static ArrayList<String> getPlayers(){
        return arrPlayers;
    }

    //Returns the number of players in the game
    static public int getNumberOfPlayers(){
        return numberOfPlayers;
    }
    ArrayList<String> getArrPlayers(){
        return arrPlayers;
    }

    private void testUpload(){
        int i = 1+1;
        int ii = 2+2;
        int iii = i+ii;
    }
}
