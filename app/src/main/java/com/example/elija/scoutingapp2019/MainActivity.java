package com.example.elija.scoutingapp2019;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements OnClickListener {
    //public static final String EXTRA_MESSAGE = "com.example.elija.scoutingapp2019.MESSAGE";

Button blue_alliance;
Button red_alliance;
public static boolean alliance;
public static int team_number;
public static int match_number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        blue_alliance = findViewById(R.id.blue_alliance);
        red_alliance = findViewById(R.id.red_alliance);
        blue_alliance.setOnClickListener(this);
        red_alliance.setOnClickListener(this);


    }

    /**
     * Called when the user taps the Start button
     */

    public void startMatch(View view) {

        //Do something in response to button
           Intent Start = new Intent(this, Sandstorm.class);                    //open data recording section when button is pressed
        // intent.putExtra(EXTRA_MESSAGE, message);
           startActivity(Start);
        EditText team_number_entry = findViewById(R.id.team_number_entry);
        team_number = Integer.parseInt(team_number_entry.getText().toString());
        EditText match_number_entry = findViewById(R.id.match_number_entry);
        match_number = Integer.parseInt(match_number_entry.getText().toString());

        Intent variables = new Intent(MainActivity.this, Notes.class);
        variables.putExtra("alliance", alliance);                                      //Send variables to notes section for recording
        variables.putExtra("team_number", team_number);
        variables.putExtra("match_number", match_number);
        }

    @Override
    public void onClick(View v) {
        if (v==red_alliance){                                                //If red alliance button is pressed, change alliance variable to record that.
            alliance = true;
            blue_alliance.setSelected(false);
            red_alliance.setSelected(true);
        }
        if(v==blue_alliance){                                               //The same as above, but with the blue alliance button
            alliance = false;

    //public void increaseScale (View view) {
        //  TextView Scale_Display = findViewById(R.id.Scale_display);
        //  int Scale = Integer.parseInt(Scale_Display.getText().toString());
        //  Scale_Display.setText(""+Scale++);
            blue_alliance.setSelected(true);
            red_alliance.setSelected(false);

        }
    }
}