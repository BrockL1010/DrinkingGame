package bley0001.student.monash.edu.drinkinggame;

/**
 * Created by brock on 4/10/2017.
 */

public class rhymingTile {
    //Class variable declarations
    private String message;
    private int penalty;

    //Rhyming tile constructor
    public rhymingTile(String name1, String name2){
        final int NUMBER_OF_RHYMES = 10;
        penalty = (int) (Math.random() * 100 % 4 + 2);
        String[] rhymingWords = new String[NUMBER_OF_RHYMES];
        int rhymeDecider = (int) (Math.random() * 100 % NUMBER_OF_RHYMES);

        rhymingWords[0] = "shirt";
        rhymingWords[1] = "money";
        rhymingWords[2] = "tool";
        rhymingWords[3] = "drum";
        rhymingWords[4] = "dinner";
        rhymingWords[5] = "gutter";
        rhymingWords[6] = "drunk";
        rhymingWords[7] = "dust";
        rhymingWords[8] = "cope";
        rhymingWords[9] = "slowing";

        message = "Time to Rhyme!\nStarting with " + name1 + ", everybody must rhyme a word with " +
                rhymingWords[rhymeDecider] + ". First person to mess up drinks " + penalty +
                " times!";
    }

    String getMessage(){
        return message;
    }
}
