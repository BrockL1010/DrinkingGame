package bley0001.student.monash.edu.drinkinggame;

/**
 * Created by brock on 4/10/2017.
 */

public class gamblingTile {
    //Class level variables
    private String message;
    private int penalty;
    private static boolean gamblingFollowUp = false;

    //Gambling tile constructor
    public gamblingTile(String name1, String name2){
        penalty = (int) (Math.random() * 100 % 3 + 2);
        message = "Let's Gamble!\n" + name1 + ", either drink " + penalty + " times now, or choose " +
                "to gamble. If you gamble you will either drink " + (int) (penalty * 2) + " times, or be " +
                "able to give out " + (int) (penalty * 2) + " drinks.";
    }

    public gamblingTile(){
        penalty = 0;
        message = "";
    }

    int recreateTile(String name1, String name2){
        penalty = (int) (Math.random() * 100 % 3 + 2);
        message = "Let's Gamble!\n" + name1 + ", either drink " + penalty + " times now, or choose " +
                "to gamble. If you gamble you will either drink " + (int) (penalty * 2) + " times, or be " +
                "able to give out " + (int) (penalty * 2) + " drinks.";

        return 0;
    }

    String getMessage(){
        return message;
    }

    static boolean getGamblingFollowUp(){
        return gamblingFollowUp;
    }

    int determineResult(String name1){
        int winDecider = (int) (Math.random() * 100 % 2);
        if(winDecider == 0){
            message = "If you gambled then congratulations " + name1 + "! You may now distribute the " + (int) (penalty
                    * 2) + " drinks as you please!";
        }
        else if(winDecider == 1){
            message = "I hope you didn't gamble " + name1 + "! Otherwise you must now drink " + (int) (penalty * 2) + " times";
        }
        gamblingFollowUp = false;

        return 0;
    }

    static int setGamblingFollowUp(boolean status){
        gamblingFollowUp = status;
        return 0;
    }
}
