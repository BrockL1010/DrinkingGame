package bley0001.student.monash.edu.drinkinggame;

/**
 * Created by brock on 5/10/2017.
 */

public class ruleTile {
    //Class variables
    private String message;
    private int penalty;

    //ayo check this test

    //Constructor
    public ruleTile(String name1, String name2){
        final int NUMBER_OF_RULES = 20;
        int ruleDecider = (int) Math.random() * 1364 % NUMBER_OF_RULES;
        penalty = (int) (Math.random() * 100 % 4 + 2);
        String[] rules = new String[NUMBER_OF_RULES];

        rules[0] = name1 + " must drink " + penalty + " times each time they speak!";
        rules[1] = name1 + " can only drink from their non-preferred hand or drink" +
                " " + penalty + " times #buffalo";
        rules[2] = "Looking at anyone's face will from now on bring a " + penalty +
                " drink penalty";
        rules[3] = name1 + " must repeat everything " + name2 + " says or drink " + penalty + " times" +
                " #echo";
        rules[4] = name1 + " can only speak in movie quotes or drink " + penalty + " times";
        rules[5] = name1 + " can only speak in song titles or drink " + penalty + " times";
        rules[6] = "Everyone must now address each other by Mr/Mrs + their surname or drink " + penalty +
                " times";
        rules[7] = "Everyone think of a nickname for the person on your left. Everyone must only be " +
                "addressed by their new nicknames, and those who fail must drink " + penalty + " times";
        rules[8] = "Carrier pigeon! You may only speak to someone if your message is spoken to them " +
                "through another player. Those who fail must drink " + penalty + " times";
        rules[9] = name1 + " amd " + name2 + " must swap drinks until further notice!";
        rules[10] = name1 + " is the barman! Everytime you drink you must ask them for permission " +
                " first (they are allowed to deny your drinks!";
        rules[11] = name1 + " must salute to " + name2 + " until further notice or drink whenever" +
                " they are not";
        rules[12] = name1 + " and " + name2 + " are drinking buddies! Every time one drinks," +
                " the other must drink as well #tagteam";
        rules[13] = name1 + " you have done a no-no :( Go to the naughty corner until" +
                " told otherwise";
        rules[14] = name1 + " must pretend to be " + name2 + " until further notice. Drink " + penalty +
                " times whenever you forget";
        rules[15] = "Every time you speak you must dab or drink " + penalty + " times #dabcity";
        rules[16] = name1 + " and " + name2 + " are having a romantic moment! Don't break " +
                "eye contact or drink " + penalty + " times";
        rules[17] = name1 + " from now on must only talk in an American accent #yanks";
        rules[18] = name1 + " MUST yell EVERY second WORD or DRINK " + penalty + " TIMES";
        rules[19] = name1 + " can only now have T-Rex arms!";

        message = rules[ruleDecider];

    }
}
