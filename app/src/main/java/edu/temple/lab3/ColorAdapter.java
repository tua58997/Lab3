package edu.temple.lab3;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ColorAdapter extends BaseAdapter {

    Context context;
    ArrayList<String> colors;

    public ColorAdapter (Context context, ArrayList<String> colors){
        this. context = context;
        this.colors = colors;
    }
    @Override
    public int getCount() {
        return colors.size();
    }

    @Override
    public Object getItem(int position) {
        return colors.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView view;
        if (convertView instanceof TextView) {
            view = (TextView)convertView;
        }
        else {
            view = new TextView(context);
        }
        String color = colors.get(position);
        view.setText(color);
        view.setBackgroundColor(Color.parseColor(color));
        return view;
    }
}
