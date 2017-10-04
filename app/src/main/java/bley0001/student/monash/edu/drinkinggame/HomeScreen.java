package bley0001.student.monash.edu.drinkinggame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class HomeScreen extends AppCompatActivity {



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
                if (!edtextAddPlayer.getText().toString().equals("") || !edtextAddPlayer.getText().toString().equals(" ")) {
                    if (Player.getNumberOfPlayers() == 0) {
                        edtextPlayers.append(edtextAddPlayer.getText());
                        Player.addPlayer(edtextAddPlayer.getText().toString());
                        new Player(edtextAddPlayer.getText().toString());
                        edtextAddPlayer.setText("");
                    } else {
                        edtextPlayers.append("\n" + edtextAddPlayer.getText());
                        Player.addPlayer(edtextAddPlayer.getText().toString());
                        new Player(edtextAddPlayer.getText().toString());
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
                playGame.putExtra("bley0001.student.monash.edu.players", Player.getPlayers());
                startActivity(playGame);
            }
        });
    }


}

