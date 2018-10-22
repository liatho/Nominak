package com.example.android.nominak;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.makeText;

public class MainActivity extends AppCompatActivity {

    //set score to 0
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //Display toast on button click
    public void nominak(View view) {

            Toast.makeText(MainActivity.this, "A legcsodálatosabb barátnak!", Toast.LENGTH_SHORT).show();

    }

}



