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
        final int NUMBER_OF_RHYMES = 27;
        penalty = (int) (Math.random() * 100 % 4 + 2);
        String[] rhymingWords = new String[NUMBER_OF_RHYMES];
        int rhymeDecider = (int) (Math.random() * 100 % NUMBER_OF_RHYMES);

        rhymingWords[0] = "beer";
        rhymingWords[1] = "headache";
        rhymingWords[2] = "fun";
        rhymingWords[3] = "spill";
        rhymingWords[4] = "steal";
        rhymingWords[5] = "gutter";
        rhymingWords[6] = "drunk";
        rhymingWords[7] = "shot";
        rhymingWords[8] = "scull";
        rhymingWords[9] = "slowing";
        rhymingWords[10] = "munt";
        rhymingWords[11] = "bone";
        rhymingWords[12] = "tongue";
        rhymingWords[13] = "bar";
        rhymingWords[14] = "dance";
        rhymingWords[15] = "light";
        rhymingWords[16] = "darts";
        rhymingWords[17] = "pool";
        rhymingWords[18] = "straw";
        rhymingWords[19] = "(break the) seal";
        rhymingWords[20] = "(six) pack";
        rhymingWords[21] = "slab";
        rhymingWords[22] = "drowning";
        rhymingWords[23] = "pissed";
        rhymingWords[24] = "club";
        rhymingWords[25] = "smashed";
        rhymingWords[26] = "duff";

        message = "Time to Rhyme!\nStarting with " + name1 + ", everybody must rhyme a word with " +
                rhymingWords[rhymeDecider] + ". First person to mess up drinks " + penalty +
                " times!";
    }

    String getMessage(){
        return message;
    }
}
