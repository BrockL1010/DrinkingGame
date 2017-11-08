package bley0001.student.monash.edu.drinkinggame;

/**
 * Created by brock on 4/10/2017.
 */

public class groupCupTile {
    //Class variable declarations
    private String message;
    private int penalty;
    private static int currentGroupDrinks = 0;

    //Group cup tile constructor
    public groupCupTile(String name1, String name2){
        if (currentGroupDrinks <= 2){
            int instructionDecider = (int) (Math.random() * 1463 % 2);  //Decides the instruction
            //for adding to the cup

            if(instructionDecider == 0){
                message = name1 + " will now share some of their drink into the group " +
                        "cup! #generous";
            }
            else if(instructionDecider == 1){
                message = name1 + ", choose somebody to pour some of their drink into the " +
                        "group cup";
            }
            currentGroupDrinks++;
        }

        else if (currentGroupDrinks > 2){
            int temp = (int) (Math.random() * 1463 % 100 + 1);   //Used to randomly determine whether the cup requires drinking

            //If temp <= 35 then drink
            if(temp <= 35){
                int instructionDecider = (int) Math.random() * 100 % 3;  //Decides how the drink will be completed

                //These 'if' conditions determine which message will be
                //output telling a user to drink the group cup
                if(instructionDecider == 0){
                    message = "Enjoy the group cup " + name1 + ", it's all yours! Drink it :)";
                }
                else if(instructionDecider == 1){
                    message = name1 + " pick somebody to finish the group cup! #rivalry";
                }
                else if(instructionDecider == 2){
                    message = name1 + " and " + name2 + " must square off in rock paper scissors. " +
                            "The loser drinks the group cup.";
                }

                currentGroupDrinks = 0;
            }
            //if temp <= 100 then add to the cup
            else if(temp <= 100){
                int instructionDecider = (int) Math.random() * 1463 % 2;  //Decides the instruction
                //for adding to the cup

                if(instructionDecider == 0){
                    message = name1 + " will now share some of their drink into the group " +
                            "cup! #generous";
                }
                else if(instructionDecider == 1){
                    message = name1 + ", choose somebody to pour some of their drink into the " +
                            "group cup";
                }

                currentGroupDrinks++;
            }
        }
    }

    String getMessage(){
        return message;
    }
}
