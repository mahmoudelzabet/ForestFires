package com.example.forestfirestracker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GreenHouse extends AppCompatActivity {
    Button gA1;
    Button gA2;

    TextView gId;
    TextView details;

    String st;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_green_house);

        gId = findViewById(R.id.green_house);
        details = findViewById(R.id.details);

        gA1 = findViewById(R.id.g1);
        gA2 = findViewById(R.id.g2);

        gA1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                st = "greenhouse in Area1\nThere are animals need to be rescued.";
                gId.setText("gA1");
                details.setText(st);
            }
        });

        gA2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                st = "Area2 is Safe\nThere is no animals here.";
                gId.setText("gB1");
                details.setText(st);
            }
        });
    }
}