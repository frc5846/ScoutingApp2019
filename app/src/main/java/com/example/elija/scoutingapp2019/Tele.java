package com.example.elija.scoutingapp2019;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Tele extends AppCompatActivity implements OnClickListener {
    Button fuel_one_tele_up;                                    //Create variables for buttons in the layout
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
    TextView fuel_one_tele_entry;                               //Create variables for TextViews in the layout
    TextView hatch_one_tele_entry;
    TextView fuel_two_tele_entry;
    TextView hatch_two_tele_entry;
    TextView fuel_three_tele_entry;
    TextView hatch_three_tele_entry;
    public static int fuel_one_tele=0;                          //Create variables for recording data in the layout
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
        fuel_one_tele_up = findViewById(R.id.fuel_one_tele_up);                  //Attach buttons and TextViews to the variables created for them
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
        fuel_two_tele_entry = findViewById(R.id.fuel_two_tele_entry);
        hatch_two_tele_entry = findViewById(R.id.hatch_two_tele_entry);
        fuel_three_tele_entry = findViewById(R.id.fuel_three_tele_entry);
        hatch_three_tele_entry = findViewById(R.id.hatch_three_tele_entry);

        fuel_one_tele_up.setOnClickListener(this);                              //Detect whether any button has been pressed
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
        fuel_one_tele_entry.setText(String.valueOf(fuel_one_tele));             //Set TextViews to the values of their corresponding variables for the recording of data
        hatch_one_tele_entry.setText(String.valueOf(hatch_one_tele));
        fuel_two_tele_entry.setText(String.valueOf(fuel_two_tele));
        hatch_two_tele_entry.setText(String.valueOf(hatch_two_tele));
        fuel_three_tele_entry.setText(String.valueOf(fuel_three_tele));
        hatch_three_tele_entry.setText(String.valueOf(hatch_three_tele));
    }

    public void Autonomous (View view) {                                                  //Switch to sandstorm section on button press
        Intent Auto = new Intent(this, Sandstorm.class);
        startActivity(Auto);
    }

    public void Notes (View view) {                                                      //Switch to notes section on button press
        Intent notes = new Intent(this, Notes.class);
        startActivity(notes);
    }

    @Override
    public void onClick(View v) {
        if(v==fuel_one_tele_up){                                                         //Increase value for fuel scored at level one during tele-op by one
            fuel_one_tele++;
        }
        else if(v==fuel_one_tele_down){                                                  //Decrease value for fuel scored at level one during tele-op by one
            fuel_one_tele--;
            if (fuel_one_tele<0){                                                        //If value for fuel scored at level one during tele-op becomes negative, set to 0
                fuel_one_tele=0;
            }
        }
        else if(v==hatch_one_tele_up) {                                                  //Increase value for hatches scored at level one during tele-op by one
            hatch_one_tele++;
        }
        else if(v==hatch_one_tele_down){                                                 //Decrease value for hatches scored at level one during tele-op by one
            hatch_one_tele--;
            if(hatch_one_tele<0){                                                        //If value for hatches scored at level one during tele-op becomes negative, set to 0
                hatch_one_tele=0;
            }
        }
        else if(v==fuel_two_tele_up){                                                    //Increase value for fuel scored at level two during tele-op by one
            fuel_two_tele++;
        }
        else if(v==fuel_two_tele_down){                                                  //Decrease value for fuel scored at level one during tele-op by one
            fuel_two_tele--;
            if(fuel_two_tele<0){                                                         //If value for fuel scored at level two during tele-op becomes negative, set to 0
                fuel_two_tele=0;
            }
        }
        else if(v==hatch_two_tele_up) {                                                  //Increase value for hatches scored at level two during tele-op by one
            hatch_two_tele++;
        }
        else if(v==hatch_two_tele_down){                                                 //Decrease value for hatches scored at level two during tele-op by one
            hatch_two_tele--;
            if(hatch_two_tele<0){                                                        //If value for hatches scored at level two during tele-op becomes negative, set to 0
                hatch_two_tele=0;
            }
        }
        else if(v==fuel_three_tele_up){                                                  //Increase value for fuel scored at level three during tele-op by one
            fuel_three_tele++;
        }
        else if(v==fuel_three_tele_down){                                                //Decrease value for fuel scored at level three during tele-op by one
            fuel_three_tele--;
            if(fuel_three_tele<0){                                                       //If value for fuel scored at level three during tele-op becomes negative, set to 0
                fuel_three_tele=0;
            }
        }
        else if(v==hatch_three_tele_up) {                                                //Increase value for hatches scored at level three during tele-op by one
            hatch_three_tele++;
        }
        else if(v==hatch_three_tele_down){                                               //Decrease value for hatches scored at level three during tele-op by one
            hatch_three_tele--;
            if(hatch_three_tele<0){                                                      //If value for hatches scored at level three during tele-op becomes negative, set to 0
                hatch_three_tele=0;
            }
        }
        else if (v==can_not_climb){                                                      //Set value for if the robot climbed to 0, which means no
            climb=0;
            can_not_climb.setSelected(true);
            climb_two.setSelected(false);
            climb_three.setSelected(false);
            climb_two_team.setSelected(false);
            climb_three_team.setSelected(false);
        }
        else if (v==climb_two){                                                         //Set value for if the robot climbed to 1, which means to level two
            climb=1;
            can_not_climb.setSelected(false);
            climb_two.setSelected(true);
            climb_three.setSelected(false);
            climb_two_team.setSelected(false);
            climb_three_team.setSelected(false);
        }
        else if (v==climb_three){                                                       //Set value for if the robot climbed to 2, which means to level three
            climb=2;
            can_not_climb.setSelected(false);
            climb_two.setSelected(false);
            climb_three.setSelected(true);
            climb_two_team.setSelected(false);
            climb_three_team.setSelected(false);
        }
        else if (v==climb_two_team){                                                   //Set value for if the robot climbed to 3, which means to level two with the ability to bring another robot
            climb=3;
            can_not_climb.setSelected(false);
            climb_two.setSelected(false);
            climb_three.setSelected(false);
            climb_two_team.setSelected(true);
            climb_three_team.setSelected(false);
        }
        else if (v==climb_three_team){                                                //Set value for if the robot climbed to 1, which means to level three with the ability to bring another robot
            climb=4;
            can_not_climb.setSelected(false);
            climb_two.setSelected(false);
            climb_three.setSelected(false);
            climb_two_team.setSelected(true);
            climb_three_team.setSelected(false);
        }

        fuel_one_tele_entry.setText(String.valueOf(fuel_one_tele));                  //Displays value of fuel scored at level one in tele-op
        hatch_one_tele_entry.setText(String.valueOf(hatch_one_tele));                //Displays value of hatches scored at level one in tele-op
        fuel_two_tele_entry.setText(String.valueOf(fuel_two_tele));                  //Displays value of fuel scored at level two in tele-op
        hatch_two_tele_entry.setText(String.valueOf(hatch_two_tele));                //Displays value of hatches scored at level two in tele-op
        fuel_three_tele_entry.setText(String.valueOf(fuel_three_tele));              //Displays value of fuel scored at level three in tele-op
        hatch_three_tele_entry.setText(String.valueOf(hatch_three_tele));            //Displays value of hatches scored at level three in tele-op

    }

}
