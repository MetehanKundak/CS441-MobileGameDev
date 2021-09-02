package com.example.week01_helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView hello_text;
    Button  click_button;
    int counter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hello_text = (TextView) findViewById(R.id.hello_world_text);
        click_button = (Button) findViewById(R.id.button);

    }
    public void Clicked(View view) {

        counter++;
        if (counter % 2 == 1){
            hello_text.setText("Clicked Hello world");
            click_button.setText("Once Again");

        }
        else if (counter % 2 == 0){
            hello_text.setText("Hello world");
            click_button.setText("Click");

        }


    }


}
