package com.example.elija.scoutingapp2019;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Tele extends AppCompatActivity implements OnClickListener {
    Button scale_tele_up;
    Button scale_tele_down;
    Button switch_tele_up;
    Button switch_tele_down;
    Button deliver_tele_up;
    Button deliver_tele_down;
    Button switch_opp_up;
    Button switch_opp_down;
    TextView scale_tele_entry;
    TextView switch_tele_entry;
    TextView deliver_tele_entry;
    TextView switch_opp_entry;
    public static int scale_tele=0;
    public static int switch_tele=0;
    public static int deliver_tele=0;
    public static int switch_opp=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tele);
        scale_tele_up = findViewById(R.id.scale_tele_up);
        scale_tele_down = findViewById(R.id.scale_tele_down);
        switch_tele_up = findViewById(R.id.switch_tele_up);
        switch_tele_down = findViewById(R.id.switch_tele_down);
        deliver_tele_up = findViewById(R.id.deliver_tele_up);
        deliver_tele_down = findViewById(R.id.deliver_tele_down);
        switch_opp_up = findViewById(R.id.switch_opp_up);
        switch_opp_down = findViewById(R.id.switch_opp_down);
        scale_tele_entry = findViewById(R.id.scale_tele_entry);
        switch_tele_entry = findViewById(R.id.switch_tele_entry);
        deliver_tele_entry = findViewById(R.id.deliver_tele_entry);
        switch_opp_entry = findViewById(R.id.switch_opp_entry);

        scale_tele_up.setOnClickListener( this);
        scale_tele_down.setOnClickListener(this);
        switch_tele_up.setOnClickListener(this);
        switch_tele_down.setOnClickListener(this);
        deliver_tele_up.setOnClickListener(this);
        deliver_tele_down.setOnClickListener(this);
        switch_opp_up.setOnClickListener(this);
        switch_opp_down.setOnClickListener(this);
        scale_tele_entry.setText(String.valueOf(scale_tele));
        switch_tele_entry.setText(String.valueOf(switch_tele));
        deliver_tele_entry.setText(String.valueOf(deliver_tele));
        switch_opp_entry.setText(String.valueOf(switch_opp));
    }

    public void Autonomous (View view) {
        Intent Auto = new Intent(this, Autonomous.class);
        startActivity(Auto);
    }

    public void Notes (View view) {
        Intent notes = new Intent(this, Notes.class);
        startActivity(notes);
    }

    @Override
    public void onClick(View v) {
        if(v==scale_tele_up){
            scale_tele++;
        }
        else if(v==scale_tele_down){
            scale_tele--;
            if (scale_tele<0){
                scale_tele=0;
            }
        }
        else if(v==switch_tele_up) {
            switch_tele++;
        }
        else if(v==switch_tele_down){
            switch_tele--;
            if(switch_tele<0){
                switch_tele=0;
            }
        }
        else if(v==deliver_tele_up){
            deliver_tele++;
        }
        else if(v==deliver_tele_down){
            deliver_tele--;
            if(deliver_tele<0){
                deliver_tele=0;
            }
        }
        else if(v==switch_opp_up) {
            switch_opp++;
        }
        else if(v==switch_opp_down){
            switch_opp--;
            if(switch_opp<0){
                switch_opp=0;
            }
        }

        scale_tele_entry.setText(String.valueOf(scale_tele));
        switch_tele_entry.setText(String.valueOf(switch_tele));
        deliver_tele_entry.setText(String.valueOf(deliver_tele));
        switch_opp_entry.setText(String.valueOf(switch_opp));
    }

}
