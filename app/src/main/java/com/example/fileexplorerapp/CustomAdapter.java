package com.example.fileexplorerapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    Context context;
    String[] countryList;
    int[] flags;
    LayoutInflater inflater;

    public CustomAdapter(Context applicationContext, String[] countryList, int[] flags) {
        this.context = applicationContext;
        this.countryList = countryList;
        this.flags = flags;
        this.inflater = LayoutInflater.from(applicationContext);
    }

    @Override
    public int getCount() {
        return countryList.length;
    }

    @Override
    public Object getItem(int position) {
        return countryList[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.activity_custom, parent, false);
        }

        TextView country = convertView.findViewById(R.id.textView);
        ImageView icon = convertView.findViewById(R.id.icon);

        country.setText(countryList[position]);
        icon.setImageResource(flags[position]);

        return convertView;
    }
}