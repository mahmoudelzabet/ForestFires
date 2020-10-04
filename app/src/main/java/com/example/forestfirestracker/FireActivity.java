package com.example.forestfirestracker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class FireActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fire);

        ArrayList fires = QueryUtils.extractFires();

        // Create a new {@link ArrayAdapter} of earthquakes
        FireAdapter adapter = new FireAdapter(this, fires);

        ListView listView = findViewById(R.id.list);

        // Set the adapter on the {@link ListView}
        // so the list can be populated in the user interface
        listView.setAdapter(adapter);
    }
}