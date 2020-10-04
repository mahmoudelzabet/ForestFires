package com.example.forestfirestracker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Spots extends AppCompatActivity {
    Button a1;
    Button a2;
    Button b1;
    Button b2;

    TextView sensor;
    TextView status;

    String st;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spots);

        sensor = findViewById(R.id.s);
        status = findViewById(R.id.status);

        a1 = findViewById(R.id.a1);

        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                st = "SAFE \n details: \n Low temperature \n Light winds";
                sensor.setText("Sensor A1");
                status.setText(st);
            }
        });

        a2 = findViewById(R.id.a2);

        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                st = "unSAFE \n details: \n High temperature\n about 30hour for a fire";
                sensor.setText("Sensor A2");
                status.setText(st);
            }
        });

        b1= findViewById(R.id.b1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                st = " SAFE \n details: \n Low temperature";
                sensor.setText("Sensor B1");
                status.setText(st);
            }
        });

        b2= findViewById(R.id.b2);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                st = " unSAFE \n details: \n small Burned area \n Strong wind";
                sensor.setText("Sensor B2");
                status.setText(st);
            }
        });
    }
}