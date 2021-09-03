//CS441 GameDevForMobile
//Metehan Kundak
//mkundak1@binghamton.edu


package com.example.week01_helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView hello_text;
    Button  click_button;
    Button reset_button;// Back to the initial state
    int counter = 0; //counter to check the number of clicks
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hello_text = (TextView) findViewById(R.id.hello_world_text);
        click_button = (Button) findViewById(R.id.button);
        reset_button = (Button) findViewById(R.id.reset_button);
    }
    public void Clicked(View view) {

        counter++;
        String s_counter = counter +"";
        if (counter % 2 == 1){
            hello_text.setText("You have clicked Hello world for "+counter+" times");
            click_button.setText("Once Again to change the text");

        }
        else if (counter == 0){
            hello_text.setText("Hello world");
            click_button.setText("Click");

        }
        else if (counter % 2 == 0){
            hello_text.setText("Hello Human you have clicked Hello world for "+counter+" times");
            click_button.setText("Click");

        }


    }



    public void Reset(View view) {

        counter=0;
        hello_text.setText("Reset the text");
        click_button.setText("Back to the initial state click again to say Hello");


    }


}
