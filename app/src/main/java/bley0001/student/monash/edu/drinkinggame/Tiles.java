package bley0001.student.monash.edu.drinkinggame;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class Tiles extends AppCompatActivity {
    private ArrayList<String> arrPlayers = new ArrayList<String>();
    private int penalty = 0;
    private String name1 = "";
    private String name2 = "";
    private int currentGroupDrinks = 0;     //Holds the number of drinks in the group cup
    private gamblingTile gambling1 = new gamblingTile(name1, name2);

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
        int ruleFinishDecider = (int) (Math.random() * 1765 % 100);

        

        if(gamblingTile.getGamblingFollowUp() == true) {
            gambling1.determineResult(name1);
            retVal = gambling1.getMessage();
        }
        else if(ruleTile.getRuleFollowUp() == true && ruleFinishDecider <= ruleTile.getCurrentRules().get(0).getRuleFinishPoint()){
            retVal = ruleTile.getCurrentRules().get(0).getEndRuleMessage();
            ruleTile.getCurrentRules().remove(0);

            if (ruleTile.getCurrentRules().size() == 0){
                ruleTile.setRuleFollowUp(false);
            }
        }

        else {
            name1 = choosePlayer();
            name2 = choosePlayer();

            while (name1 == name2){
                name2 = choosePlayer();
            }

            //Increments the chances of the rule finishing next turn by 5
            if (ruleTile.getRuleFollowUp() == true){
                for (int i = 0; i <= ruleTile.getCurrentRules().size() - 1; i++){
                    ruleTile.getCurrentRules().get(i).setRuleFinishPoint(ruleTile.getCurrentRules().get(i).getRuleFinishPoint() + 4);
                }
                //ruleTile.setRuleFinishPoint(ruleTile.getRuleFinishPoint() + 5);
            }


            //Decides what type of tile will be next
            if (typeDecider <= 70) {
                basicTile basic1 = new basicTile(name1, name2);
                retVal = basic1.getMessage();
            } else if (typeDecider <= 75) {
                gambling1.recreateTile(name1, name2);
                retVal = gambling1.getMessage();
                gamblingTile.setGamblingFollowUp(true);
            }
            else if (typeDecider <= 80){
                rhymingTile rhyming1 = new rhymingTile(name1, name2);
                retVal = rhyming1.getMessage();
            }
            else if (typeDecider <= 90){
                groupCupTile group1 = new groupCupTile(name1, name2);
                retVal = group1.getMessage();
            }
            else if (typeDecider <= 99){
                ruleTile rule1 = new ruleTile(name1, name2);
                ruleTile.addCurrentRule(rule1);
                retVal = rule1.getRule();
            }

        }

        return retVal;
    }
    String choosePlayer(){
        int temp = (int)(Math.random() * 100 % Player.getNumberOfPlayers());

        return arrPlayers.get(temp);
    }

}
