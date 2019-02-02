package com.example.elija.scoutingapp2019;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Tele extends AppCompatActivity implements OnClickListener {
    Button fuel_one_tele_up;
    Button fuel_one_tele_down;
    Button hatch_one_tele_up;
    Button hatch_one_tele_down;
    Button fuel_two_tele_up;
    Button fuel_two_tele_down;
    Button hatch_two_tele_up;
    Button hatch_two_tele_down;
    Button fuel_three_tele_up;
    Button fuel_three_tele_down;
    Button hatch_three_tele_up;
    Button hatch_three_tele_down;
    Button can_not_climb;
    Button climb_two;
    Button climb_three;
    Button climb_two_team;
    Button climb_three_team;
    TextView fuel_one_tele_entry;
    TextView hatch_one_tele_entry;
    TextView fuel_two_tele_entry;
    TextView hatch_two_tele_entry;
    TextView fuel_three_tele_entry;
    TextView hatch_three_tele_entry;
    public static int fuel_one_tele=0;
    public static int hatch_one_tele=0;
    public static int fuel_two_tele=0;
    public static int hatch_two_tele=0;
    public static int fuel_three_tele=0;
    public static int hatch_three_tele=0;
    public static int climb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tele);
        fuel_one_tele_up = findViewById(R.id.fuel_one_tele_up);
        fuel_one_tele_down = findViewById(R.id.fuel_one_tele_down);
        hatch_one_tele_up = findViewById(R.id.hatch_one_tele_up);
        hatch_one_tele_down = findViewById(R.id.hatch_one_tele_down);
        fuel_two_tele_up = findViewById(R.id.fuel_two_tele_up);
        fuel_two_tele_down = findViewById(R.id.fuel_two_tele_down);
        hatch_two_tele_up = findViewById(R.id.hatch_two_tele_up);
        hatch_two_tele_down = findViewById(R.id.hatch_two_tele_down);
        fuel_three_tele_up = findViewById(R.id.fuel_three_tele_up);
        fuel_three_tele_down = findViewById(R.id.fuel_three_tele_down);
        hatch_three_tele_up = findViewById(R.id.hatch_three_tele_up);
        hatch_three_tele_down = findViewById(R.id.hatch_three_tele_down);
        can_not_climb = findViewById(R.id.can_not_climb);
        climb_two = findViewById(R.id.climb_two);
        climb_three = findViewById(R.id.climb_three);
        climb_two_team = findViewById(R.id.climb_two_team);
        climb_three_team = findViewById(R.id.climb_three_team);
        fuel_one_tele_entry = findViewById(R.id.fuel_one_tele_entry);
        hatch_one_tele_entry = findViewById(R.id.hatch_one_tele_entry);
        fuel_two_tele_entry = findViewById(R.id.hatch_two_tele_entry);
        hatch_two_tele_entry = findViewById(R.id.fuel_two_tele_entry);
        fuel_three_tele_entry = findViewById(R.id.hatch_three_tele_entry);
        hatch_three_tele_entry = findViewById(R.id.fuel_three_tele_entry);

        fuel_one_tele_up.setOnClickListener(this);
        fuel_one_tele_down.setOnClickListener(this);
        hatch_one_tele_up.setOnClickListener(this);
        hatch_one_tele_down.setOnClickListener(this);
        fuel_two_tele_up.setOnClickListener(this);
        fuel_two_tele_down.setOnClickListener(this);
        hatch_two_tele_up.setOnClickListener(this);
        hatch_two_tele_down.setOnClickListener(this);
        fuel_three_tele_up.setOnClickListener(this);
        fuel_three_tele_down.setOnClickListener(this);
        hatch_three_tele_up.setOnClickListener(this);
        hatch_three_tele_down.setOnClickListener(this);
        can_not_climb.setOnClickListener(this);
        climb_two.setOnClickListener(this);
        climb_three.setOnClickListener(this);
        climb_two_team.setOnClickListener(this);
        climb_three_team.setOnClickListener(this);
        fuel_one_tele_entry.setText(String.valueOf(fuel_one_tele));
        hatch_one_tele_entry.setText(String.valueOf(hatch_one_tele));
        fuel_two_tele_entry.setText(String.valueOf(fuel_two_tele));
        hatch_two_tele_entry.setText(String.valueOf(hatch_two_tele));
        fuel_three_tele_entry.setText(String.valueOf(fuel_three_tele));
        hatch_three_tele_entry.setText(String.valueOf(hatch_three_tele));
    }

    public void Autonomous (View view) {
        Intent Auto = new Intent(this, Sandstorm.class);
        startActivity(Auto);
    }

    public void Notes (View view) {
        Intent notes = new Intent(this, Notes.class);
        startActivity(notes);
    }

    @Override
    public void onClick(View v) {
        if(v==fuel_one_tele_up){
            fuel_one_tele++;
        }
        else if(v==fuel_one_tele_down){
            fuel_one_tele--;
            if (fuel_one_tele<0){
                fuel_one_tele=0;
            }
        }
        else if(v==hatch_one_tele_up) {
            hatch_one_tele++;
        }
        else if(v==hatch_one_tele_down){
            hatch_one_tele--;
            if(hatch_one_tele<0){
                hatch_one_tele=0;
            }
        }
        else if(v==fuel_two_tele_up){
            fuel_two_tele++;
        }
        else if(v==fuel_two_tele_down){
            fuel_two_tele--;
            if(fuel_two_tele<0){
                fuel_two_tele=0;
            }
        }
        else if(v==hatch_two_tele_up) {
            hatch_two_tele++;
        }
        else if(v==hatch_two_tele_down){
            hatch_two_tele--;
            if(hatch_two_tele<0){
                hatch_two_tele=0;
            }
        }
        else if(v==fuel_three_tele_up){
            fuel_three_tele++;
        }
        else if(v==fuel_three_tele_down){
            fuel_three_tele--;
            if(fuel_three_tele<0){
                fuel_three_tele=0;
            }
        }
        else if(v==hatch_three_tele_up) {
            hatch_three_tele++;
        }
        else if(v==hatch_three_tele_down){
            hatch_three_tele--;
            if(hatch_three_tele<0){
                hatch_three_tele=0;
            }
        }
        else if (v==can_not_climb){
            climb=0;
            can_not_climb.setSelected(true);
            climb_two.setSelected(false);
            climb_three.setSelected(false);
            climb_two_team.setSelected(false);
            climb_three_team.setSelected(false);
        }
        else if (v==climb_two){
            climb=1;
            can_not_climb.setSelected(false);
            climb_two.setSelected(true);
            climb_three.setSelected(false);
            climb_two_team.setSelected(false);
            climb_three_team.setSelected(false);
        }
        else if (v==climb_three){
            climb=2;
            can_not_climb.setSelected(false);
            climb_two.setSelected(false);
            climb_three.setSelected(true);
            climb_two_team.setSelected(false);
            climb_three_team.setSelected(false);
        }
        else if (v==climb_two_team){
            climb=3;
            can_not_climb.setSelected(false);
            climb_two.setSelected(false);
            climb_three.setSelected(false);
            climb_two_team.setSelected(true);
            climb_three_team.setSelected(false);
        }
        else if (v==climb_three_team){
            climb=4;
            can_not_climb.setSelected(false);
            climb_two.setSelected(false);
            climb_three.setSelected(false);
            climb_two_team.setSelected(true);
            climb_three_team.setSelected(false);
        }

        fuel_one_tele_entry.setText(String.valueOf(fuel_one_tele));
        hatch_one_tele_entry.setText(String.valueOf(hatch_one_tele));
        fuel_two_tele_entry.setText(String.valueOf(fuel_two_tele));
        hatch_two_tele_entry.setText(String.valueOf(hatch_two_tele));
        fuel_three_tele_entry.setText(String.valueOf(fuel_three_tele));
        hatch_three_tele_entry.setText(String.valueOf(hatch_three_tele));

    }

}
