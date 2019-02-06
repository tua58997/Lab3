package edu.temple.lab3;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class ColorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ConstraintLayout myLayout = findViewById(R.id.layout);
        Spinner spinner = findViewById(R.id.spinner);

        ArrayList colors = new ArrayList<String>();
        colors.add("red");
        colors.add("blue");
        colors.add("green");
        colors.add("gray");
        colors.add("cyan");
        colors.add("magenta");
        colors.add("lightgray");
        colors.add("darkgray");
        colors.add("aqua");
        colors.add("lime");

        final ColorAdapter adapter = new ColorAdapter(this, colors);

        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                view.setBackgroundColor(Color.parseColor("white"));
                myLayout.setBackgroundColor(Color.parseColor((String)adapter.getItem(position)));
                Toast.makeText(ColorActivity.this, "Selection made", Toast.LENGTH_LONG).show();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
