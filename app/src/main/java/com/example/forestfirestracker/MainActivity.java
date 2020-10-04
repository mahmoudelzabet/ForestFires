package com.example.forestfirestracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    Button spot;
    Button track;
    Button animal;
    Button gHouse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spot = findViewById(R.id.spot);

        spot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Spots.class);
                startActivity(i);
            }
        });

        animal = findViewById(R.id.animals);

        animal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Animals.class);
                startActivity(i);
            }
        });

        gHouse = findViewById(R.id.green_house);

        gHouse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, GreenHouse.class);
                startActivity(i);
            }
        });

        track = findViewById(R.id.fire_track);

        track.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, FireActivity.class);
                startActivity(i);
            }
        });
    }
}