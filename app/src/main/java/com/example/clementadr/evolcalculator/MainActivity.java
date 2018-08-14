package com.example.clementadr.evolcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button crush;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);}
        public void crush(View view){
            Intent i= new Intent(this,Main3Activity.class);
            startActivity(i);
    }
    }

