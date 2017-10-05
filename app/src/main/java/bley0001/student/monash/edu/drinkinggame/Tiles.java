package bley0001.student.monash.edu.drinkinggame;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class Tiles extends AppCompatActivity {
    ArrayList<String> arrPlayers = new ArrayList<String>();
    int penalty = 0;
    String name1 = "";
    String name2 = "";
    int currentGroupDrinks = 0;     //Holds the number of drinks in the group cup
    gamblingTile gambling1 = new gamblingTile(name1, name2);
    private static int ruleFinishPoint = 1;


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
        else if(ruleTile.getRuleFollowUp() == true && ruleFinishDecider <= ruleFinishPoint){
            //display end rule message
            //remove rule from current rules array
        }

        else {
            name1 = choosePlayer();
            name2 = choosePlayer();

            while (name1 == name2){
                name2 = choosePlayer();
            }

            if (typeDecider <= 80) {
                basicTile basic1 = new basicTile(name1, name2);
                retVal = basic1.getMessage();
            } else if (typeDecider <= 85) {
                gambling1.recreateTile(name1, name2);
                retVal = gambling1.getMessage();
                gamblingTile.setGamblingFollowUp(true);
            }
            else if (typeDecider <= 90){
                rhymingTile rhyming1 = new rhymingTile(name1, name2);
                retVal = rhyming1.getMessage();
            }
            else if (typeDecider <= 95){
                groupCupTile group1 = new groupCupTile(name1, name2);
                retVal = group1.getMessage();
            }
            else if (typeDecider <= 99){
                ruleTile.addCurrentRule(new ruleTile(name1, name2));
            }
        }

        return retVal;
    }
    String choosePlayer(){
        int temp = (int)(Math.random() * 100 % Player.getNumberOfPlayers());

        return arrPlayers.get(temp);
    }

}
