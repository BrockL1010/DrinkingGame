package bley0001.student.monash.edu.drinkinggame;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

import static bley0001.student.monash.edu.drinkinggame.HomeScreen.intPlayers;

public class Tiles extends AppCompatActivity {
    ArrayList<String> arrPlayers = new ArrayList<String>();
    boolean gamblingFollowUp = false;
    int penalty = 0;
    String name1 = "";
    String name2 = "";
    int currentGroupDrinks = 0;     //Holds the number of drinks in the group cup

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tiles);

        Button test = (Button) findViewById(R.id.btnTest);
        final TextView tvInstruction = (TextView) findViewById(R.id.tvInstruction);
        arrPlayers = getIntent().getExtras().getStringArrayList("bley0001.student.monash.edu.players");



        test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvInstruction.setText("");
                tvInstruction.append(generateInstruction());
            }
        });

    }
    String generateInstruction(){

        int typeDecider = (int) (Math.random() * 1163 % 100);
        String retVal = "";


        if(gamblingFollowUp == true) {
            int winDecider = (int) (Math.random() * 100 % 2);
            if(winDecider == 0){
                retVal = "If you gambled then congratulations " + name1 + "! You may now distribute the " + (int) (penalty
                        * 3) + " drinks as you please!";
            }
            else if(winDecider == 1){
                retVal = "I hope you didn't gamble " + name1 + "! Otherwise you must now drink " + (int) (penalty * 2) + " times";
            }
            gamblingFollowUp = false;
        }
        else {
            name1 = choosePlayer();
            name2 = choosePlayer();

            while (name1 == name2){
                name2 = choosePlayer();
            }

            if (typeDecider <= 40) {
                retVal = basicInstruction(name1, name2);
            } else if (typeDecider <= 50) {
                retVal = gamblingInstruction(name1, name2);
            }
            else if (typeDecider <= 65){
                retVal = rhymingInstruction(name1, name2);
            }
            else if (typeDecider <= 99){
                retVal = groupCupInstruction(name1, name2);
            }
        }

        return retVal;
    }
    String choosePlayer(){
        int temp = (int)(Math.random() * 100 % intPlayers);

        return arrPlayers.get(temp);
    }
    String basicInstruction(String name1, String name2){
        final int NUMBER_OF_INSTRUCTIONS = 24   ;
        int decider = (int) (Math.random() * 100 % NUMBER_OF_INSTRUCTIONS);
        penalty = (int) (Math.random() * 100 % 4 + 2);
        String retVal = "";
        String[] basicInstructions = new String[NUMBER_OF_INSTRUCTIONS];

        basicInstructions[0] = "If you've read the texts of your significant other, drink " + penalty + " times";
        basicInstructions[1] = "The person to the right of " + name1 + ", drink " + penalty + " times";
        basicInstructions[2] = "The person to the left of " + name1 + ", drink " + penalty + " times";
        basicInstructions[3] = "Everybody drink " + penalty + " times. It's in the spirit of the game!";
        basicInstructions[4] = "Drink once if you are listening, those who are not can drink " + penalty + " times. Losers";
        basicInstructions[5] = "If your partner is in the room with us all drink " + penalty + " times. Whipped bastards!";
        basicInstructions[6] = name1 + ", if your drink is more than half full then drink " + penalty + " times. Hurry up!";
        basicInstructions[7] = "I bless " + name1 + " with my powers. You may now give out " + penalty + " drinks";
        basicInstructions[8] = "I'm getting real sick of " + name1 + "'s shit. Drink " + penalty + " times you prick";
        basicInstructions[9] = "If you're single and ready to mingle then drink " + penalty + " times";
        basicInstructions[10] = "Those drinking a beer at the moment, drink " + penalty + " times!";
        basicInstructions[11] = "Those who are not drinking beer drink " + penalty + " times";
        basicInstructions[12] = "iPhone users drink " + penalty + " times, you deserve it!";
        basicInstructions[13] = "Android users drink " + penalty + " times, nice cameras!";
        basicInstructions[14] = "Drink " + penalty + " times if you and someone in the room have" +
                " the same drink";
        basicInstructions[15] = "If you and someone else in the room have the same drink, each" +
                " give out " + penalty + " drinks! #tagteam";
        basicInstructions[16] = name1 + " if you play a sport other than drinking, give out " + penalty +
                " drinks. #athlete";
        basicInstructions[17] = "If you have a gym membership but haven't gone in the last week " +
                "then drink " + penalty + " times.";
        basicInstructions[18] = name1 + ", do " + name2 + " a favour, get up and fetch their" +
                " next drink for them";
        basicInstructions[19] = name1 + " and " + name2 + ", have an intense rock paper scissors battle!" +
                " Loser has to drink " + penalty + " times.";
        basicInstructions[20] = name1 + ", if you think you're a better drinker than " + name2 +
                " then prove it! Drink " + penalty + " times";
        basicInstructions[21] = "Those who have never thrown up at the hands of alcohol, drink " +
                penalty + " times. Tonight's the night!";
        basicInstructions[22] = "If you're studying a course that's taking you nowhere, drink " +
                penalty + " times! Enjoy the job market";
        basicInstructions[23] = name1 + " can decide who must drink the group cup!... Choose wisely";




        return basicInstructions[decider];
    }
    String gamblingInstruction(String name1, String name2){
        String retVal = "";
        penalty = (int) (Math.random() * 100 % 3 + 2);


        retVal = "Let's Gamble!\n" + name1 + ", either drink " + penalty + " times now, or choose " +
                "to gamble. If you gamble you will either drink " + (int) (penalty * 2) + " times, or be " +
                "able to give out " + (int) (penalty * 3) + " drinks.";

        gamblingFollowUp = true;

        return retVal;
    }

    String rhymingInstruction(String name1, String name2){
        String retVal = "";
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
        rhymingWords[7] = "permit";
        rhymingWords[8] = "cope";
        rhymingWords[9] = "slowing";

        retVal = "Time to Rhyme!\nStarting with " + name1 + ", everybody must rhyme a word with " +
                rhymingWords[rhymeDecider] + ". First person to mess up drinks " + penalty +
                " times!";

        return retVal;

    }

    String groupCupInstruction(String name1, String name2){
        String retVal = "";

        if (currentGroupDrinks > 2){
            int temp = (int) Math.random() * 1463 % 100 + 1;   //Used to randomly determine whether the cup requires drinking

            //If temp <= 75 then add to the cup
            if(temp <= 75){
                int instructionDecider = (int) Math.random() * 100 % 3;  //Decides how the drink will be completed

                //These 'if' conditions determine which message will be
                //output telling a user to drink the group cup
                if(instructionDecider == 0){
                    retVal = "Enjoy the group cup " + name1 + ", it's all yours! Drink it :)";
                }
                else if(instructionDecider == 1){
                    retVal = name1 + " pick somebody to finish the group cup! #rivalry";
                }
                else if(instructionDecider == 2){
                    retVal = name1 + " and " + name2 + " must square off in rock paper scissors. " +
                            "The loser drinks the group cup.";
                }

                currentGroupDrinks = 0;
            }
            //if temp <= 100 then add to the cup
            else if(temp <= 100){
                int instructionDecider = (int) Math.random() * 100 % 2;  //Decides the instruction
                                                                            //for adding to the cup

                if(instructionDecider == 0){
                    retVal = name1 + " will now share some of their drink into the group " +
                            "cup! #generous";
                }
                else if(instructionDecider == 1){
                    retVal = name1 + ", choose somebody to pour some of their drink into the " +
                            "group cup";
                }

                currentGroupDrinks++;
            }
        }

        if (currentGroupDrinks <= 2){
            int instructionDecider = (int) Math.random() * 100 % 2;  //Decides the instruction
            //for adding to the cup

            if(instructionDecider == 0){
                retVal = name1 + " will now share some of their drink into the group " +
                        "cup! #generous";
            }
            else if(instructionDecider == 1){
                retVal = name1 + ", choose somebody to pour some of their drink into the " +
                        "group cup";
            }
            currentGroupDrinks++;
        }

        return retVal;
    }
}
