package bley0001.student.monash.edu.drinkinggame;

/**
 * Created by brock on 4/10/2017.
 */

public class basicTile {
    //Class level declarations
    private String message;
    private int penalty;

    //Basic tile constructor
    public basicTile(String name1, String name2){
        final int NUMBER_OF_INSTRUCTIONS = 48   ;
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
        basicInstructions[13] = "Android users drink " + penalty + " times";
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
        basicInstructions[24] = name1 + " is a basic bitch, drink " + penalty + " times!";
        basicInstructions[25] = "Everybody playing must replicate a trick performed by " +
                name1 + " or drink " + penalty + " times.";
        basicInstructions[26] = "Tap your head and rub your belly! Go one at a time, and those " +
                "who fail must drink " + penalty + " times.";
        basicInstructions[27] = "Drink " + penalty + " times if you wear glasses. #4eyes";
        basicInstructions[28] = "Those with a terrible haircut drink " + penalty + " times!";
        basicInstructions[29] = "Those who don't wear glasses must drink " + penalty + " times " +
                "to level the playing field. #blurryvision";
        basicInstructions[30] = "Drink " + penalty + " times if you have longer hair than " +
                name1;
        basicInstructions[31] = "Drink " + penalty + " times if you are not wearing shoes";
        basicInstructions[32] = "Those who are wearing shoes must drink " + penalty + " times";
        basicInstructions[33] = "If you're the less attractive person in your relationship " +
                "then drink " + penalty + " times. #punching";
        basicInstructions[34] = "Those who have had a same-sex experience drink " + penalty +
                " times";
        basicInstructions[35] = "BONELESS\nEveryone can give out " + penalty + " drinks but must" +
                " also drink the same amount";
        basicInstructions[36] = name1 + ", balance on one leg for 15 seconds or drink " + penalty +
                " times";
        basicInstructions[37] = "If " + name1 + " cannot click with both hands then they must drink " +
                penalty + " times";
        basicInstructions[38] = "If the first letter of your name is a vowel drink " + penalty +
                " times";
        basicInstructions[39] = "Got a crack in your phone? Drink " + penalty + " times #takecare";
        basicInstructions[40] = "Drink " + penalty + " times if you have pissed yourself in " +
                " the last two years";
        basicInstructions[41] = "If you went to see an Adam Sandler movie in the last year, " +
                " drink " + penalty + " times to forget";
        basicInstructions[42] = name1 + " must name 10 Simpsons characters or drink " + penalty +
                " times #doh";
        basicInstructions[43] = "Drink " + penalty + " times if you have never seen an episode" +
                " of Game of Thrones";
        basicInstructions[44] = "Drink " + penalty + " times if you have never seen an episode" +
                " of The Walking Dead";
        basicInstructions[45] = "On the count of 3, " + name1 + " and " + name2 + " will say" +
                " a number each between 1 and 10 (inclusive). If they say different numbers " +
                "then they must both drink " + penalty + " times, but if they say the same " +
                "numbers then everyone else drinks";
        basicInstructions[46] = "On the count of 3, everybody must point to another player. " +
                "Whoever is pointed at the most must drink " + penalty + " times. #rude";
        basicInstructions[47] = name1 + " will choose a topic for " + name2 + " to rant about " +
                "for 30 seconds. If " + name2 + " fails then they must drink " + penalty +
                " times";

                message = basicInstructions[decider];
    }

    String getMessage(){
        return message;
    }


}
