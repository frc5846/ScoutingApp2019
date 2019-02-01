package com.example.elija.scoutingapp2019;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;


public class Sandstorm extends AppCompatActivity implements OnClickListener {
    Button fuel_one_sand_up;
    Button fuel_one_sand_down;
    Button hatch_one_sand_up;
    Button hatch_one_sand_down;
    Button fuel_two_sand_up;
    Button fuel_two_sand_down;
    Button hatch_two_sand_up;
    Button hatch_two_sand_down;
    Button fuel_three_sand_up;
    Button fuel_three_sand_down;
    Button hatch_three_sand_up;
    Button hatch_three_sand_down;
    TextView fuel_one_sand_entry;
    TextView hatch_one_sand_entry;
    TextView fuel_two_sand_entry;
    TextView hatch_two_sand_entry;
    TextView fuel_three_sand_entry;
    TextView hatch_three_sand_entry;
    public static int fuel_one_sand=0;
    public static int hatch_one_sand=0;
    public static int fuel_two_sand=0;
    public static int hatch_two_sand=0;
    public static int fuel_three_sand=0;
    public static int hatch_three_sand=0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_autonomous);

        fuel_one_sand_up = findViewById(R.id.fuel_one_sand_up);
        fuel_one_sand_down = findViewById(R.id.fuel_one_sand_down);
        hatch_one_sand_up = findViewById(R.id.hatch_one_sand_up);
        hatch_one_sand_down = findViewById(R.id.hatch_one_sand_down);
        fuel_two_sand_up = findViewById(R.id.fuel_two_sand_up);
        fuel_two_sand_down = findViewById(R.id.fuel_two_sand_down);
        hatch_two_sand_up = findViewById(R.id.hatch_two_sand_up);
        hatch_two_sand_down = findViewById(R.id.hatch_two_sand_down);
        fuel_three_sand_up = findViewById(R.id.fuel_three_sand_up);
        fuel_three_sand_down = findViewById(R.id.fuel_three_sand_down);
        hatch_three_sand_up = findViewById(R.id.hatch_three_sand_up);
        hatch_three_sand_down = findViewById(R.id.hatch_three_sand_down);
        fuel_one_sand_entry = findViewById(R.id.fuel_one_sand_entry);
        hatch_one_sand_entry = findViewById(R.id.hatch_one_sand_entry);
        fuel_two_sand_entry = findViewById(R.id.fuel_two_sand_entry);
        hatch_two_sand_entry = findViewById(R.id.hatch_two_sand_entry);
        fuel_three_sand_entry = findViewById(R.id.fuel_three_sand_entry);
        hatch_three_sand_entry = findViewById(R.id.hatch_three_sand_entry);

        fuel_one_sand_up.setOnClickListener(this);
        fuel_one_sand_down.setOnClickListener(this);
        hatch_one_sand_up.setOnClickListener(this);
        hatch_one_sand_down.setOnClickListener(this);
        fuel_two_sand_up.setOnClickListener(this);
        fuel_two_sand_down.setOnClickListener(this);
        hatch_two_sand_up.setOnClickListener(this);
        hatch_two_sand_down.setOnClickListener(this);
        fuel_three_sand_up.setOnClickListener(this);
        fuel_three_sand_down.setOnClickListener(this);
        hatch_three_sand_up.setOnClickListener(this);
        hatch_three_sand_down.setOnClickListener(this);
        fuel_one_sand_entry.setText(String.valueOf(fuel_one_sand));
        hatch_one_sand_entry.setText(String.valueOf(hatch_one_sand));
        fuel_two_sand_entry.setText(String.valueOf(fuel_two_sand));
        hatch_one_sand_entry.setText(String.valueOf(hatch_two_sand));
        fuel_two_sand_entry.setText(String.valueOf(fuel_three_sand));
        hatch_one_sand_entry.setText(String.valueOf(hatch_three_sand));

/*
        Button hatch_one_sand_up = (Button) findViewById(R.id.hatch_one_sand_up);
        final TextView fuel_one_sand_entry = (TextView) findViewById(R.id.fuel_one_sand_entry);





        hatch_one_sand_up.setOnClickListener(new Button.OnClickListener(){
            int i = 0;
            public void onClick(View v){
                i++;
                fuel_one_sand_entry.setText(Integer.toString(i));

            }
        }

        );

        Button fuel_one_sand_down = (Button) findViewById(R.id.fuel_one_sand_down);
        fuel_one_sand_down.setOnClickListener(new Button.OnClickListener(){
            int i = 0;
            public void onClick(View v){
                i--;
                if (i <0) {i = 0;}
                fuel_one_sand_entry.setText(Integer.toString(i));

            }
        }

        );

        Button hatch_one_sand_up = (Button) findViewById(R.id.hatch_one_sand_up);
        final TextView hatch_one_sand_entry = (TextView) findViewById(R.id.hatch_one_sand_entry);
        hatch_one_sand_up.setOnClickListener(new Button.OnClickListener(){
            int i = 0;
            public void onClick(View v){
            i++;
            hatch_one_sand_entry.setText(Integer.toString(i));

            }
        }

        );

        final Button hatch_one_sand_down = (Button) findViewById(R.id.hatch_one_sand_down);
        hatch_one_sand_down.setOnClickListener(new Button.OnClickListener(){
            int i = 0;
            public void onClick(View v){
            i--;
            if (i <0) {i = 0;}
            hatch_one_sand_entry.setText(Integer.toString(i));

            }
        }

        );

        Button fuel_two_sand_up = (Button) findViewById(R.id.fuel_two_sand_up);
        final TextView fuel_two_sand_entry = (TextView) findViewById(R.id.fuel_two_sand_entry);
        fuel_two_sand_up.setOnClickListener(new Button.OnClickListener(){
            int i = 0;
            public void onClick(View v){
            i++;
            fuel_two_sand_entry.setText(Integer.toString(i));

            }
        }

        );

        Button fuel_two_sand_down = (Button) findViewById(R.id.fuel_two_sand_down);
        fuel_two_sand_down.setOnClickListener(new Button.OnClickListener(){
            int i = 0;
            public void onClick(View v){
            i--;
            if (i <0) {i = 0;}
            fuel_two_sand_entry.setText(Integer.toString(i));

            }
        }

        ); */
}
 /*public void fuel_one_sand(View v) {
        if(v==hatch_one_sand_up){
            i++;
        }  else if(v==fuel_one_sand_down){
            i--;
            if (i<0){
                i=0;
            }
        }
 }*/

    public void Teleop (View view) {
        Intent tele = new Intent(this, Tele.class);
        startActivity(tele);
    }

    public void Notes (View view) {
        Intent notes = new Intent(this, Notes.class);
        startActivity(notes);
    }

    @Override
    public void onClick(View v) {
        if(v==fuel_one_sand_up){
            fuel_one_sand++;
        }
        else if(v==fuel_one_sand_down){
            fuel_one_sand--;
            if (fuel_one_sand<0){
                fuel_one_sand=0;
            }
        }
        else if(v==hatch_one_sand_up) {
            hatch_one_sand++;
        }
        else if(v==hatch_one_sand_down){
            hatch_one_sand--;
            if(hatch_one_sand<0){
                hatch_one_sand=0;
            }
        }
        else if(v==fuel_two_sand_up){
            fuel_two_sand++;
        }
        else if(v==fuel_two_sand_down){
            fuel_two_sand--;
            if(fuel_two_sand<0){
                fuel_two_sand=0;
            }
        }
        else if(v==hatch_two_sand_up) {
            hatch_two_sand++;
        }
        else if(v==hatch_two_sand_down){
            hatch_two_sand--;
            if(hatch_two_sand<0){
                hatch_two_sand=0;
            }
        }
        else if(v==fuel_three_sand_up) {
            fuel_three_sand++;
        }
        else if(v==fuel_three_sand_down){
            fuel_three_sand--;
            if(fuel_three_sand<0){
                fuel_three_sand=0;
            }
        }
        else if(v==hatch_three_sand_up) {
            hatch_three_sand++;
        }
        else if(v==hatch_three_sand_down){
            hatch_three_sand--;
            if(hatch_three_sand<0){
                hatch_three_sand=0;
            }
        }
        fuel_one_sand_entry.setText(String.valueOf(fuel_one_sand));
        hatch_one_sand_entry.setText(String.valueOf(hatch_one_sand));
        fuel_two_sand_entry.setText(String.valueOf(fuel_two_sand));
        hatch_two_sand_entry.setText(String.valueOf(hatch_two_sand));
        fuel_three_sand_entry.setText(String.valueOf(fuel_three_sand));
        hatch_three_sand_entry.setText(String.valueOf(hatch_three_sand));
    }
}