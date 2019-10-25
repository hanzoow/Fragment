package com.example.fragmentproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ListFag.itemSelected{

    TextView tvDct;
    ArrayList<String> descriptions;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDct = findViewById(R.id.tvDescription);

        descriptions = new ArrayList<String>();
        descriptions.add("Decription for item 1");
        descriptions.add("Decription for item 2");
        descriptions.add("Decription for item 3");
    }

    @Override
    public void onItemSelected(int index) {

        tvDct.setText(descriptions.get(index));
    }
}
