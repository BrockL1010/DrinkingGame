package bley0001.student.monash.edu.drinkinggame;

import android.app.AlertDialog;
import android.content.DialogInterface;
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
                if (!edtextAddPlayer.getText().equals("") && !edtextAddPlayer.getText().equals(" ")) {
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

                if(Player.getNumberOfPlayers() <= 1) {
                    AlertDialog alertDialog = new AlertDialog.Builder(HomeScreen.this).create();
                    alertDialog.setTitle("Loner");
                    alertDialog.setMessage("Try finding some friends before playing.");
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                    alertDialog.show();
                }
                else {
                    Intent playGame = new Intent(getApplicationContext(), Tiles.class);
                    playGame.putExtra("bley0001.student.monash.edu.players", Player.getPlayers());
                    startActivity(playGame);
                }
            }
        });
    }


}

