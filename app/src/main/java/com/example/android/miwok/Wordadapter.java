package com.example.android.miwok;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/*
 * {@link WordAdapter} is an {@link ArrayAdapter} that can provide the layout for each list
 * based on a data source, which is a list of {@link Word} objects.
 * */

public class Wordadapter extends ArrayAdapter {
    @androidx.annotation.NonNull
    @Override
    public View getView(int position, @androidx.annotation.Nullable View convertView, @androidx.annotation.NonNull ViewGroup parent) {
        return super.getView(position, convertView, parent);
    }
}
