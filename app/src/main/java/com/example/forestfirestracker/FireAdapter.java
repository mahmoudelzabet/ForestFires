package com.example.forestfirestracker;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class FireAdapter extends ArrayAdapter<Fire> {
    public FireAdapter(Activity context, ArrayList<Fire> fire) {
        super(context, 0, fire);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Fire currentFire = getItem(position);

        TextView lat = listItemView.findViewById(R.id.lat);
        lat.setText(String.valueOf(currentFire.getLat()));

        TextView lng = listItemView.findViewById(R.id.lng);
        lng.setText(String.valueOf(currentFire.getLng()));

        TextView date = listItemView.findViewById(R.id.date);
        date.setText(currentFire.getDate());

        return listItemView;
    }
}
