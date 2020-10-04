package com.example.forestfirestracker;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Animals extends AppCompatActivity {
    Button deer;
    Button fox;
    Button coyote;

    TextView animal;
    TextView details;

    String st;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.animals);

        animal = findViewById(R.id.animal_name);
        details = findViewById(R.id.details);

        deer = findViewById(R.id.deer);
        fox = findViewById(R.id.fox);
        coyote = findViewById(R.id.coyote);

        deer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                st = "Location: California\nBehaviour: UNSTABLE,\n Deer started to behave strangely\nhowever,there is no fire yet.\nThey started to run away.";
                animal.setText("Deer");
                details.setText(st);
            }
        });

        fox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                st = "Location: California Northeast\nBehavior: STABLE (safe)";
                animal.setText("Foxes");
                details.setText(st);
            }
        });

        coyote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                st = "Location: North American\nBehavior: spotted running down the hills,\naway from the flames.";
                animal.setText("Coyotes");
                details.setText(st);
            }
        });
    }
}
