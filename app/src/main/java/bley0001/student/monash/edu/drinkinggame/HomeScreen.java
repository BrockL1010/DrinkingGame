package bley0001.student.monash.edu.drinkinggame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class HomeScreen extends AppCompatActivity {

    static int intPlayers = 0;
    private ArrayList<String> arrPlayers = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homescreen);


        Button btnAddPlayer = (Button) findViewById(R.id.btnAddPlayer);
        Button btnPlay = (Button) findViewById(R.id.btnPlay);
        final EditText edtextPlayers = (EditText) findViewById(R.id.edtextPlayers);
        final EditText edtextAddPlayer = (EditText) findViewById(R.id.edtextAddPlayer);

        btnAddPlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edtextAddPlayer.getText().toString().equals("") || edtextAddPlayer.getText().toString() != " ") {
                    if (getPlayers() == 0) {
                        edtextPlayers.append(edtextAddPlayer.getText());
                        arrPlayers.add(edtextAddPlayer.getText().toString());
                        intPlayers++;
                        edtextAddPlayer.setText("");
                    } else {
                        edtextPlayers.append("\n" + edtextAddPlayer.getText());
                        arrPlayers.add(edtextAddPlayer.getText().toString());
                        intPlayers++;
                        edtextAddPlayer.setText("");
                    }
                }
            }
        });

        //Play button which initiates game
        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playGame = new Intent(getApplicationContext(), Tiles.class);
                playGame.putExtra("bley0001.student.monash.edu.players", arrPlayers);
                startActivity(playGame);
            }
        });
    }

    public int getPlayers(){
        return intPlayers;
    }
    ArrayList<String> getArrPlayers(){
        return arrPlayers;
    }

    private void TestUpload(){
        int i = 1+1;
    }
}

