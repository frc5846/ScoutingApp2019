package com.example.elija.scoutingapp2019;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;



public class Notes extends AppCompatActivity{
    TextView team_display;
    TextView match_display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes);
        Intent variables = getIntent();
        Boolean alliance = variables.getBooleanExtra("alliance", true);
        int team_number = variables.getIntExtra("team_number", 5846);
        int match_number = variables.getIntExtra("match_number", 1);
        team_display = findViewById(R.id.team_display);
        match_display = findViewById(R.id.match_display);
        team_display.setText(String.valueOf(team_number));
        match_display.setText(String.valueOf(match_number));
    }


    public void Autonomous(View view) {
        Intent Auto = new Intent(this, Sandstorm.class);
        startActivity(Auto);
    }

    public void Teleop(View view) {
        Intent tele = new Intent(this, Tele.class);
        startActivity(tele);
    }

}