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
    public static int scale_auto=0;
    public static int switch_auto=0;
    public static int deliver_auto=0;



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
        fuel_one_sand_entry = findViewById(R.id.fuel_one_sand_entry);
        hatch_one_sand_entry = findViewById(R.id.hatch_one_sand_entry);
        fuel_two_sand_entry = findViewById(R.id.fuel_two_sand_entry);

        fuel_one_sand_up.setOnClickListener(this);
        fuel_one_sand_down.setOnClickListener(this);
        hatch_one_sand_up.setOnClickListener(this);
        hatch_one_sand_down.setOnClickListener(this);
        fuel_two_sand_up.setOnClickListener(this);
        fuel_two_sand_down.setOnClickListener(this);
        fuel_one_sand_entry.setText(String.valueOf(scale_auto));
        hatch_one_sand_entry.setText(String.valueOf(switch_auto));
        fuel_two_sand_entry.setText(String.valueOf(deliver_auto));
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

        Button scale_auto_down = (Button) findViewById(R.id.scale_auto_down);
        scale_auto_down.setOnClickListener(new Button.OnClickListener(){
            int i = 0;
            public void onClick(View v){
                i--;
                if (i <0) {i = 0;}
                fuel_one_sand_entry.setText(Integer.toString(i));

            }
        }

        );

        Button switch_auto_up = (Button) findViewById(R.id.switch_auto_up);
        final TextView hatch_one_sand_entry = (TextView) findViewById(R.id.hatch_one_sand_entry);
        switch_auto_up.setOnClickListener(new Button.OnClickListener(){
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
 /*public void scale_auto(View v) {
        if(v==hatch_one_sand_up){
            i++;
        }  else if(v==scale_auto_down){
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
            scale_auto++;
        }
        else if(v==fuel_one_sand_down){
            scale_auto--;
            if (scale_auto<0){
                scale_auto=0;
            }
        }
        else if(v==hatch_one_sand_up) {
            switch_auto++;
        }
        else if(v==hatch_one_sand_down){
            switch_auto--;
            if(switch_auto<0){
                switch_auto=0;
            }
        }
        else if(v==fuel_two_sand_up){
            deliver_auto++;
        }
        else if(v==fuel_two_sand_down){
            deliver_auto--;
            if(deliver_auto<0){
                deliver_auto=0;
            }
        }
        fuel_one_sand_entry.setText(String.valueOf(scale_auto));
        hatch_one_sand_entry.setText(String.valueOf(switch_auto));
        fuel_two_sand_entry.setText(String.valueOf(deliver_auto));
    }
}