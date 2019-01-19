package com.example.elija.scoutingapp2019;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;


public class Autonomous extends AppCompatActivity implements OnClickListener {
    Button scale_auto_up;
    Button scale_auto_down;
    Button switch_auto_up;
    Button switch_auto_down;
    Button deliver_auto_up;
    Button deliver_auto_down;
    TextView scale_auto_entry;
    TextView switch_auto_entry;
    TextView deliver_auto_entry;
    public static int scale_auto=0;
    public static int switch_auto=0;
    public static int deliver_auto=0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_autonomous);

        scale_auto_up = findViewById(R.id.scale_auto_up);
        scale_auto_down = findViewById(R.id.scale_auto_down);
        switch_auto_up = findViewById(R.id.switch_auto_up);
        switch_auto_down = findViewById(R.id.switch_auto_down);
        deliver_auto_up = findViewById(R.id.deliver_auto_up);
        deliver_auto_down = findViewById(R.id.deliver_auto_down);
        scale_auto_entry = findViewById(R.id.scale_auto_entry);
        switch_auto_entry = findViewById(R.id.switch_tele_entry);
        deliver_auto_entry = findViewById(R.id.deliver_auto_entry);

        scale_auto_up.setOnClickListener(this);
        scale_auto_down.setOnClickListener(this);
        switch_auto_up.setOnClickListener(this);
        switch_auto_down.setOnClickListener(this);
        deliver_auto_up.setOnClickListener(this);
        deliver_auto_down.setOnClickListener(this);
        scale_auto_entry.setText(String.valueOf(scale_auto));
        switch_auto_entry.setText(String.valueOf(switch_auto));
        deliver_auto_entry.setText(String.valueOf(deliver_auto));
/*
        Button scale_auto_up = (Button) findViewById(R.id.scale_auto_up);
        final TextView scale_auto_entry = (TextView) findViewById(R.id.scale_auto_entry);





        scale_auto_up.setOnClickListener(new Button.OnClickListener(){
            int i = 0;
            public void onClick(View v){
                i++;
                scale_auto_entry.setText(Integer.toString(i));

            }
        }

        );

        Button scale_auto_down = (Button) findViewById(R.id.scale_auto_down);
        scale_auto_down.setOnClickListener(new Button.OnClickListener(){
            int i = 0;
            public void onClick(View v){
                i--;
                if (i <0) {i = 0;}
                scale_auto_entry.setText(Integer.toString(i));

            }
        }

        );

        Button switch_auto_up = (Button) findViewById(R.id.switch_auto_up);
        final TextView switch_auto_entry = (TextView) findViewById(R.id.switch_auto_entry);
        switch_auto_up.setOnClickListener(new Button.OnClickListener(){
            int i = 0;
            public void onClick(View v){
            i++;
            switch_auto_entry.setText(Integer.toString(i));

            }
        }

        );

        final Button switch_auto_down = (Button) findViewById(R.id.switch_auto_down);
        switch_auto_down.setOnClickListener(new Button.OnClickListener(){
            int i = 0;
            public void onClick(View v){
            i--;
            if (i <0) {i = 0;}
            switch_auto_entry.setText(Integer.toString(i));

            }
        }

        );

        Button deliver_auto_up = (Button) findViewById(R.id.deliver_auto_up);
        final TextView deliver_auto_entry = (TextView) findViewById(R.id.deliver_auto_entry);
        deliver_auto_up.setOnClickListener(new Button.OnClickListener(){
            int i = 0;
            public void onClick(View v){
            i++;
            deliver_auto_entry.setText(Integer.toString(i));

            }
        }

        );

        Button deliver_auto_down = (Button) findViewById(R.id.deliver_auto_down);
        deliver_auto_down.setOnClickListener(new Button.OnClickListener(){
            int i = 0;
            public void onClick(View v){
            i--;
            if (i <0) {i = 0;}
            deliver_auto_entry.setText(Integer.toString(i));

            }
        }

        ); */
}
 /*public void scale_auto(View v) {
        if(v==scale_auto_up){
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
        if(v==scale_auto_up){
            scale_auto++;
        }
        else if(v==scale_auto_down){
            scale_auto--;
            if (scale_auto<0){
                scale_auto=0;
            }
        }
        else if(v==switch_auto_up) {
            switch_auto++;
        }
        else if(v==switch_auto_down){
            switch_auto--;
            if(switch_auto<0){
                switch_auto=0;
            }
        }
        else if(v==deliver_auto_up){
            deliver_auto++;
        }
        else if(v==deliver_auto_down){
            deliver_auto--;
            if(deliver_auto<0){
                deliver_auto=0;
            }
        }
        scale_auto_entry.setText(String.valueOf(scale_auto));
        switch_auto_entry.setText(String.valueOf(switch_auto));
        deliver_auto_entry.setText(String.valueOf(deliver_auto));
    }
}